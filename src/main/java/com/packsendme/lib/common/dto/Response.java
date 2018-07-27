package com.packsendme.lib.common.dto;

public class Response<T> {
	
	 private static final String R_MSG_EMPTY = "";
	  private static final String R_CODE_OK = "OK";

	  private final int codStatus;
	  private final String status;
	  private final T message;

	  private T response;


	  public Response(final int codStatus, final String status, final T message) {

	    this.codStatus = codStatus == 0 ? codStatus : codStatus;
	    this.status = status == null ? Response.R_CODE_OK : status;
	    this.message = message == null ? message : message;
	    this.response = null;
	  }

	  /**
	   * @return the message
	   */
	  public T getMessage() {

	    return this.message;
	  }

	  /**
	   * @return the response
	   */
	  public T getResponse() {

	    return this.response;
	  }

	  /**
	   * @return the responseCode
	   */
	  public String getStatus() {

	    return this.status;
	  }

	  /**
	   * sets the response object
	   *
	   * @param obj
	   * @return
	   */
	  public Response<T> setResponse(final T obj) {

	    this.response = obj;
	    return this;
	  }

	public int getCodStatus() {
		return codStatus;
	}
}
