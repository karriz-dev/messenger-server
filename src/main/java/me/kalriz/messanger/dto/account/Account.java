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
	private Long createAt;
	private Long passwordUpdateAt;
	private Long nicknameUpdateAt;
	private String kaleelandAccount;
}
