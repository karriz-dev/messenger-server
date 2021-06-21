package me.kalriz.messanger.exception;

public class MessageException extends Exception {

	private static final long serialVersionUID = 4041549672250773748L;

	private Integer errCode = 0;
	private String errMsg = null;
	
	public MessageException(Integer errCode, String errMsg)
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
