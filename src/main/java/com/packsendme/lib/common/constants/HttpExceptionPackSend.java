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
	CREATED_ACCOUNT(201, "CREATED_ACCOUNT"),

	/**
	 * {@code 202 ACCOUNT_CREATED}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	USER_ACCESS_CREATED(202, "ACCESS_CREATED"),

	/**
	 * {@code 203 USERNAME_REGISTER}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	REGISTER_USERNAME(203, "REGISTER_USERNAME"),

	/**
	 * {@code 204 USER_DELETE_ACCOUNT}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	CANCEL_USERNAME(204, "CANCEL_USERNAME"),


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

	/**
	 * {@code 206 UPDATE_ACCOUNT}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	UPDATE_PASSWORD(207, "PASSWORD_UPDATE"),

	/**
	 * {@code 206 UPDATE_ACCOUNT}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	GENERATOR_SMSCODE(208, "GENERATOR_SMSCODE"),

	/**
	 * {@code 209 CREATE_PAYMENT}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	CREATE_PAYMENT(209, "CREATE_PAYMENT"),
	
	
	/**
	 * {@code 210 DELETE_PAYMENT}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	DELETE_PAYMENT(210, "DELETE_PAYMENT"),
	
	/**
	 * {@code 211 UPDATE_PAYMENT}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	UPDATE_PAYMENT(211, "UPDATE_PAYMENT"),
	
	
	/**
	 * {@code 212 CREATED_COUNRTY}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	COUNTRY_CREATED(212, "COUNTRY_CREATED"),
	
	/**
	 * {@code 213 DELETE_SMSCODE}.
	 * @see <a href="http://tools.ietf.org/html/rfc7231#section-6.3.2">HTTP/1.1: Semantics and Content, section 6.3.2</a>
	 */
	DELETE_SMSCODE(213, "DELETE_SMSCODE"),
	

	GOOGLEAPI_PLACE(214, "GOOGLE_DISTANCE"),
	
	BUSINESS_RULE(215, "BUSINESS_RULE"),

	
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
	NOT_FOUND_EMAIL(306, "NOT_FOUND_EMAIL"),
	
	
	/**
	 * {@code 307 USERNAME UPDATE}.
	 */
	UPDATE_USERNAME(307, "UPDATE_USERNAME"),

	/**
	 * {@code 307 USERNAME UPDATE}.
	 */
	LOGIN_USER(308, "LOGIN_USER"),
	
	/**
	 * {@code 302 NOT FOUND PAYMENT TYPE}.
	 */
	FOUND_PAYMENT(309, "FOUND_PAYMENT"),

	/**
	 * {@code 303 COUNTRY_NOT_FOUND}.
	 */
	COUNTRY_NOT_FOUND(303, "COUNTRY_NOT_FOUND"),
	
	/**
	 * {@code 304 COUNTRY_FOUND}.
	 */
	COUNTRY_FOUND(304, "COUNTRY_FOUND"),

	/**
	 * {@code 305 VALIDATE_CARD}.
	 */
	VALIDATE_CARD(305, "VALIDATE_CARD"),

	
	/**
	 * {@code 306 SIMULATION_ROADWAY}.
	 */
	SIMULATION_ROADWAY(306, "SIMULATION_ROADWAY"),

	/**
	 * {@code 307 SIMULATION_AIRWAY}.
	 */
	SIMULATION_AIRWAY(307, "SIMULATION_AIRWAY"),

	/**
	 * {@code 308 SIMULATION_MARITIMEWAY}.
	 */
	SIMULATION_MARITIMEWAY(308, "SIMULATION_MARITIMEWAY"),
	
	
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
	
	/**
	 * {@code 302 NOT FOUND PAYMENT TYPE}.
	 */
	NOT_FOUND_PAYMENT(408, "NOT_FOUND_PAYMENT"),

	
	/**
	 * {@code 409 NOT_VALIDATE_CARD}.
	 */
	NOT_VALIDATE_CARD(409, "NOT_VALIDATE_CARD"),

	NOT_FOUND_GOOGLEAPI_PLACE(410, "NOT_FOUND"),
	
	NOT_BUSINESS_RULE(411, "NOT_FOUND"),

	
	
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
