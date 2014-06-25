package com.pkrm.baseexception;

/**
 * @author Srinivasulu
 * 
 *         Make this class abstract so that developers are forced to create
 *         suitable exception types only
 * 
 */
public class PKRMException extends Exception {

	private static final long serialVersionUID = 1L;

	// Each exception message will be hold here
	String apiErrorCode;
	String apiErrorName;
	String apiErrorDesc;
	String apiHttpResCode;
	 
	
	public PKRMException(String aApiErrCode, String aApiErrName,
			String aApiErrDesc,String aApiHttpResCode) {
		
		this.apiErrorCode = aApiErrCode;
		this.apiErrorName = aApiErrName;
		this.apiErrorDesc = aApiErrDesc;
		this.apiHttpResCode = aApiHttpResCode;
		
	}
	
	
	/**
	 * Message can be retrieved using this accessor method
	 */
	public String getMessage() {
		return super.getMessage();
	}


	/**
	 * @return the apiErrorCode
	 */
	public String getApiErrorCode() {
		return apiErrorCode;
	}


	/**
	 * @param apiErrorCode the apiErrorCode to set
	 */
	public void setApiErrorCode(String apiErrorCode) {
		this.apiErrorCode = apiErrorCode;
	}


	/**
	 * @return the apiErrorName
	 */
	public String getApiErrorName() {
		return apiErrorName;
	}


	/**
	 * @param apiErrorName the apiErrorName to set
	 */
	public void setApiErrorName(String apiErrorName) {
		this.apiErrorName = apiErrorName;
	}


	/**
	 * @return the apiErrorDesc
	 */
	public String getApiErrorDesc() {
		return apiErrorDesc;
	}


	/**
	 * @param apiErrorDesc the apiErrorDesc to set
	 */
	public void setApiErrorDesc(String apiErrorDesc) {
		this.apiErrorDesc = apiErrorDesc;
	}


	/**
	 * @return the apiHttpResCode
	 */
	public String getApiHttpResCode() {
		return apiHttpResCode;
	}


	/**
	 * @param apiHttpResCode the apiHttpResCode to set
	 */
	public void setApiHttpResCode(String apiHttpResCode) {
		this.apiHttpResCode = apiHttpResCode;
	}
	


}