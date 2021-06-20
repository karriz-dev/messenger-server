package me.kalriz.messanger.dto.response;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import me.kalriz.messanger.types.ResponseResultCode;

public class SendMessageResponseTests {

	@Test
	public void generateTest()
	{
		SendMessageResponse response = SendMessageResponse.builder()
										.resultCode(ResponseResultCode.SUCCESS)
										.build();
		
		assertNotNull(response);
	}
}
