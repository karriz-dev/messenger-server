package me.kalriz.messanger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.kalriz.messanger.component.Producer;
import me.kalriz.messanger.dto.event.Message;
import me.kalriz.messanger.dto.response.SendMessageResponse;
import me.kalriz.messanger.types.ResponseResultCode;

@RestController
@RequestMapping("/messege")
public class MessegeController {
	
	@Autowired 
	private Producer messageProducer;
	
	@PostMapping
	public SendMessageResponse SendMessage(@RequestBody Message message)
	{
		messageProducer.Send("kalee-event", "message ok");
		
		return SendMessageResponse.builder()
				.resultCode(ResponseResultCode.SUCCESS)
				.build();
	}
}
