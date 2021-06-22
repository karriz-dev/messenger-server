package me.kalriz.messanger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import me.kalriz.messanger.component.Producer;
import me.kalriz.messanger.dto.event.Message;
import me.kalriz.messanger.exception.MessageException;

@Service
public class MessageService {
	
	@Autowired
	private Producer producer;
	
	@Async
	public void sendMessage(Message message) throws MessageException
	{
		Gson gson = new Gson();
		
		if(message.getNickName() == null)
		{
			throw new MessageException(0x00000001, "nickname cannot be null");
		}
		
		if(message.getMessage() == null || message.getMessage().length() < 1)
		{
			throw new MessageException(0x00000002, "message cannot be null and length < 1");
		}
		
		producer.Send("kalee-event", gson.toJson(message));
	}
}
