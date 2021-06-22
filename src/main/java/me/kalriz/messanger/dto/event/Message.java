package me.kalriz.messanger.dto.event;

import lombok.Data;

@Data
public class Message {
	private String nickName;
	private Integer roomId;
	private Long timestamp = System.currentTimeMillis();
	private String message;
}
