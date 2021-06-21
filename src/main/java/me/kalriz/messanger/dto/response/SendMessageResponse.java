package me.kalriz.messanger.dto.response;

import lombok.Builder;
import lombok.Data;
import me.kalriz.messanger.types.ResponseResultCode;

@Data
@Builder
public class SendMessageResponse {

	private ResponseResultCode resultCode;
	private Integer errCode;
	private String errMsg;
	
}
