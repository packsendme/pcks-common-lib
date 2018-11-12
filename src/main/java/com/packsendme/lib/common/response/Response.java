package com.packsendme.lib.common.response;

public class Response<T> {
	
	private String message;
	private T body;
	private T response;


	  public Response(String message, T body) {
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

}
