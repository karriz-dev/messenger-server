package me.kalriz.messanger.exception;

public class AccountException extends Exception {
	
	private static final long serialVersionUID = 7758354536314599387L;
	
	private Integer errCode = 0;
	private String errMsg = null;
	
	public AccountException(Integer errCode, String errMsg)
	{
		this.errCode = errCode;
		this.errMsg = errMsg;
	}
	
	public Integer getErrorCode()
	{
		return this.errCode;
	}
	
	public String getErrorMsg()
	{
		return this.errMsg;
	}
}
