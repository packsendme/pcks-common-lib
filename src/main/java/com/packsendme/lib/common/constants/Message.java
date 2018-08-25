package com.packsendme.lib.common.constants;

public final class Message {
	
	public static final String SUCCESS_STATUS = "SUCCESS"; 
	public static final String ERROR_STATUS = "ERROR"; 
	public static final String FAIL_STATUS = "FAIL"; 

	// ACCOUNT
	public static final int SUCCESS_COD_CREATE_ACCOUNT = 201;
	public static final String SUCCESS_CREATE_ACCOUNT = "ACCOUNT_CREATE";
	
	public static final int ERROR_COD_CREATE_ACCOUNT = 2;
	public static final String ERROR_CREATE_ACCOUNT = "ACCOUNT_NOT_CREATE";
	
	public static final int SUCCESS_COD_UPDATE_ACCOUNT = 202;
	public static final String SUCCESS_UPDATE_ACCOUNT = "ACCOUNT_UPDATE";

	public static final int ERROR_COD_UPDATE_ACCOUNT = 3;
	public static final String ERROR_UPDATE_ACCOUNT = "ACCOUNT_NOT_UPDATE";

	public static final int SUCCESS_COD_CANCEL_ACCOUNT = 203;
	public static final String SUCCESS_CANCEL_ACCOUNT = "ACCOUNT_CANCEL";

	public static final int ERROR_COD_CANCEL_ACCOUNT = 4;
	public static final String ERORR_CANCEL_ACCOUNT = "ACCOUNT_NOT_CANCEL";

	public static final int SUCCESS_COD_LOAD_ACCOUNT = 204;
	public static final String SUCCESS_LOAD_ACCOUNT = "ACCOUNT_LOAD";

	public static final int ERROR_COD_LOAD_ACCOUNT = 5;
	public static final String ERROR_LOAD_ACCOUNT = "ACCOUNT_NOT_LOAD";

	public static final int SUCCESS_COD_CREATE_PAYMENT = 205;
	public static final String SUCCESS_CREATE_PAYMENT = "PAYMENT_SAVE";

	public static final int ERROR_COD_CREATE_PAYMENT = 6;
	public static final String ERROR_CREATE_PAYMENT = "PAYMENT_NOT_SAVE";


	// USER
	public static final int SUCCESS_COD_USER_FOUND = 200;
	public static final String SUCCESS_USER_FOUND = "USER_FOUND";
	public static final int  ERROR_COD_NOT_USER_FOUND = 1;
	public static final String ERROR_USER_NOT_FOUND = "USER_NOT_FOUND";


	
	public static final int SUCCESS_COD = 200;  // 100 / 200
	public static final int ERROR_COD = 100; // 0 / 100 
	public static final int FAIL_COD = -100; // 0 / -100 
	
}
