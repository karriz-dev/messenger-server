package me.kalriz.messanger.dto.event;

import static org.junit.Assert.assertNotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class MessageTests {

	@Test
	public void messageGenerateTest()
	{
		Message message = new Message();
		
		message.setMessage("test message");
		
		message.setNickName("kalee");
		
		System.out.println(message.toString());
		
		Date generateTime = new Date(message.getTimestamp());
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("generate time: " + sdFormat.format(generateTime));
		
		assertNotNull(message);
	}
}
