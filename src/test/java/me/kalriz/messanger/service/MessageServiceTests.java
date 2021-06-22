package me.kalriz.messanger.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import me.kalriz.messanger.dto.event.Message;
import me.kalriz.messanger.exception.MessageException;

@SpringBootTest
public class MessageServiceTests {
	
	@Autowired
	private MessageService messageService;
	
	@Test
	public void messageHasNotNicknameTest()
	{	
		Message message = new Message();
		
		MessageException exception = Assertions.assertThrows(MessageException.class, ()->{
			messageService.sendMessage(message);
		});
		
		Assertions.assertTrue(exception.getErrorCode() == 0x00000001);
	}
	
	@Test
	public void messageHasNotMessageTest()
	{	
		Message message = new Message();
		
		message.setNickName("kalee");
		
		MessageException exception = Assertions.assertThrows(MessageException.class, ()->{
			messageService.sendMessage(message);
		});
		
		Assertions.assertTrue(exception.getErrorCode() == 0x00000002);
	}
}
