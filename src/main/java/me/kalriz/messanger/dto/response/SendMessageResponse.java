package me.kalriz.messanger.dto.response;

import lombok.Builder;
import lombok.Data;
import me.kalriz.messanger.types.ResponseErrorCode;
import me.kalriz.messanger.types.ResponseResultCode;

@Data
@Builder
public class SendMessageResponse {

	private ResponseResultCode resultCode;
	private ResponseErrorCode errCode;
	private String errMsg;
	
}
