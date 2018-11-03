package com.packsendme.lib.common.constants;

public enum HttpExceptionPackSend {

	// 200 - 400 -> SUCCESS
	
	// 400 - 500 -> ERRO

	// 500 - 600 -> FAIL GENERAL



	 // A - 200 - 400
	
	     // 200 - 300 (CRUD)
  

	/**
	 * {@code 201 ACCOUNT_CREATED}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	ACCOUNT_CREATED(201, "ACCOUNT_CREATED"),

	/**
	 * {@code 202 ACCOUNT_CREATED}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	USER_ACCESS_CREATED(202, "ACCESS_CREATED"),

	/**
	 * {@code 203 USERNAME_REGISTER}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	USERNAME_REGISTER(203, "USERNAME_REGISTER"),

	/**
	 * {@code 204 USER_DELETE_ACCOUNT}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	USER_DELETE(204, "USERNAME_DELETE"),


	/**
	 * {@code 205 ACCOUNT_DELETE}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	ACCOUNT_DELETE(205, "ACCOUNT_DELETE"),

	
	/**
	 * {@code 206 UPDATE_ACCOUNT}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	UPDATE_ACCOUNT(206, "ACCOUNT_UPDATE"),

	// A) 300 - 400 (VALIDATE)

	/**
	 * {@code 302 NOT FOUND ACCOUNT}.
	 */
	FOUND_ACCOUNT(302, "ACCOUNT_FOUND"),

	/**
	 * {@code 302 NOT FOUND ACCOUNT}.
	 */
	FOUND_USER(303, "USERNAME_FOUND"),

	/**
	 * {@code 302 NOT FOUND ACCOUNT}.
	 */
	FOUND_SMS_CODE(304, "SMSCODE_FOUND"),
	
	/**
	 * {@code 305 NOT FOUND ACCOUNT}.
	 */
	USERNAME_VALIDATE_ACCESS(305, "USERNAME_SUCCESS"),
	
	/**
	 * {@code 306 NOT FOUND ACCOUNT}.
	 */
	NOT_FOUND_EMAIL(306, "EMAIL_NOTFOUND"),
	
	
	/**
	 * {@code 307 USERNAME UPDATE}.
	 */
	USERNAME_UPDATE(307, "USERNAME_UPDATE"),
	
	
	 // 400 - 500
	
	
	/**
	 * {@code 404 NOT FOUND ACCOUNT}.
	 */
	NOT_FOUND_ACCOUNT(404, "ACCOUNT_NOTFOUND"),

	
	/**
	 * {@code 405 NOT FOUND ACCOUNT}.
	 */
	NOT_FOUND_SMS_CODE(405, "SMSCODE_NOTFOUND"),

	/**
	 * {@code 406 USERNAME_REGISTER}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	USERNAME_NOT_REGISTERED(406, "USERNAME NOT REGISTERED IN SYSTEM"),


	/**
	 * {@code 407 NOT FOUND ACCOUNT}.
	 */
	FOUND_EMAIL(407, "EMAIL_FOUND"),

	
	 // 500 - 600

	/**
	 * {@code 500 Internal Server Error}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.6.1">HTTP/1.1: Semantics and Content, section 6.6.1</a>
	 */
	FAIL_EXECUTION(500, "FAIL_GENERALSYSTEM"),
	

	/**
	 * {@code 501 Internal Server Error}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.6.1">HTTP/1.1: Semantics and Content, section 6.6.1</a>
	 */

	ACCOUNT_CREATE_FAIL(501, "Failed to create account");

	


	
	private final int value;

	private final String action;

	
	HttpExceptionPackSend(int value, String action) {
		this.value = value;
		this.action = action;
	}
	
	
	/**
	 * Return the integer value of this status code.
	 */
	public int value() {
		return this.value;
	}

	/**
	 * Return the reason phrase of this status code.
	 */
	public String getAction() {
		return this.action;
	}

	}
