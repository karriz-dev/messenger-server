package me.kalriz.messanger.service;

import org.elasticsearch.ElasticsearchStatusException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountServiceTests {
	
	@Autowired
	private AccountService accountService;
	
	@Test
	public void createNewAccountIndexExceptionTest()
	{	
		// 이미 인덱스가 존재하는 경우 테스트
		ElasticsearchStatusException exception = Assertions.assertThrows(ElasticsearchStatusException.class, ()->{
			accountService.createNewAccountIndex();
		});
		
		Assertions.assertNotNull(exception.getMessage());
	}
}
