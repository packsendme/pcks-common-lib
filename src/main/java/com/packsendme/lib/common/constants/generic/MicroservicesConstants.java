package com.packsendme.lib.common.constants.generic;

public final class MicroservicesConstants {
	
	
	//User
	public static final String USER_URL_VALIDADUSERNAME = "http://packsendme-iam-server/iam/api/user/validadUsername/{username}";

	public static final String MICROSERVICE_ACCOUNT = "packsendme-account-server";
	public static final String MC_ACCOUNT_OP_CREATE = "packsendme-account-server/createAccountService";
	public static final String MC_ACCOUNT_OP_LOAD  = "packsendme-account-server/loadAccountService";
	public static final String MC_ACCOUNT_OP_CANCEL  = "packsendme-account-server/cancelAccountService";
	public static final String MC_ACCOUNT_OP_UPDATE  = "packsendme-account-server/updateAccountService";
	
	public static final String STATUS_ACTIVE = "ACTIVATED";
	public static final String STATUS_DISABLED = "DISABLED";

	public static final String ACTIVATIONKEY = "NULL";
	
	public static final boolean SMS_VALIDATE_FOUND = true;
	public static final boolean SMS_VALIDATE_NOTFOUND = false;

	public static final String UPDATE_OP_USERNAME = "UPDATE";
	public static final String ADD_OP_USERNAME = "ADD";

	public static final boolean USERNAME_ACCOUNT_ACTIVE = true;
	public static final boolean USERNAME_ACCOUNT_DISABLED = false;
	

}
