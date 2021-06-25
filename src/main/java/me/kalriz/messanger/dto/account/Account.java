package me.kalriz.messanger.dto.account;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
	private Integer accountId;
	private String email;
	private String password;
	private String nickname;
	private Integer gmCode;
	private String kaleelandAccount;
	
	@Builder.Default
	private Long createAt = System.currentTimeMillis();
	@Builder.Default
	private Long passwordUpdateAt = System.currentTimeMillis();
	@Builder.Default
	private Long nicknameUpdateAt = System.currentTimeMillis();
}
