package me.kalriz.messanger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.kalriz.messanger.dto.response.GeneralResponse;
import me.kalriz.messanger.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService accountService;

	@PostMapping("/index")
	public GeneralResponse createAccountIndex() {
		return accountService.createNewAccountIndex();
	}
}
