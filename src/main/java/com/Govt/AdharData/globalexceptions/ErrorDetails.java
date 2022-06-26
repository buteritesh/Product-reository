package com.Govt.AdharData.globalexceptions;

public class ErrorDetails {
	private String errorMsg;
	private String details;
	
	public ErrorDetails() {
		
	}

	public ErrorDetails(String errorMsg, String details) {
		super();
		this.errorMsg = errorMsg;
		this.details = details;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "ErrorDetails [errorMsg=" + errorMsg + ", details=" + details + "]";
	}
	

}
