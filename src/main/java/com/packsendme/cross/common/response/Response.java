package com.packsendme.cross.common.response;

public class Response<T> {
	
	private String message;
	private T body;
	private int responseCode;


	public Response(int responseCode, String message, T body) {
	    this.responseCode = responseCode == 0 ? responseCode : responseCode;
	    this.message = message == null ? message : message;
	    this.body = body == null ? body : body;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	
	

}
