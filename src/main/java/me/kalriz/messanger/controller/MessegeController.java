package me.kalriz.messanger.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.kalriz.messanger.dto.response.SendMessageResponse;
import me.kalriz.messanger.types.ResponseResultCode;

@RestController
@RequestMapping("/messege")
public class MessegeController {
	@PostMapping
	public SendMessageResponse SendMessage()
	{
		return SendMessageResponse.builder()
				.resultCode(ResponseResultCode.SUCCESS)
				.build();
	}
}
