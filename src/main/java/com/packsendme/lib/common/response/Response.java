package com.packsendme.lib.common.response;

import org.springframework.http.HttpStatus;

public class Response<T> {
	
	private HttpStatus status;
	private String message;
	private T body;
	private T response;


	  public Response(HttpStatus status, String message, T body) {
	    this.status = status == null ? status : status;
	    this.message = message == null ? message : message;
	    this.body = body == null ? body : body;
	    this.response = null;
	  }

		public Response() {
			super();
			// TODO Auto-generated constructor stub
		}	  
	

	/**
	   * @return the response
	   */
	  public T getResponse() {

	    return this.response;
	  }


	/**
	   * @return the message
	   */
	  public String getMessage() {

	    return this.message;
	  }
	  
	  /**
	   * @return the body
	   */
	  public T getBody() {

	    return this.body;
	  }

	  /**
	   * @return the responseCode
	   */
	  public HttpStatus getStatus() {

	    return this.status;
	  }

}
