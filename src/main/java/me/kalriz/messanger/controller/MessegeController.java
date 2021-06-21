package me.kalriz.messanger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.kalriz.messanger.dto.event.Message;
import me.kalriz.messanger.dto.response.SendMessageResponse;
import me.kalriz.messanger.exception.MessageException;
import me.kalriz.messanger.service.MessageService;
import me.kalriz.messanger.types.ResponseResultCode;

@RestController
@RequestMapping("/messege")
public class MessegeController {

	@Autowired
	private MessageService messageService;

	@PostMapping
	public SendMessageResponse SendMessage(@RequestBody Message message) {
		try {
			messageService.sendMessage(message);
		
			return SendMessageResponse.builder()
					.resultCode(ResponseResultCode.SUCCESS).build();
		} catch (MessageException e) {
			return SendMessageResponse.builder()
					.resultCode(ResponseResultCode.ERROR)
					.errCode(e.getErrorCode())
					.errMsg(e.getErrorMsg()).build();
		}
	}
}
