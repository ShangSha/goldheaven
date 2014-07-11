/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午4:48:11 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.constants;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(错误信息) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午4:48:11 
 * ***************************************************************
 * </p>
 */

public enum ErrorCode {
	
	SUCCESS(0, "成功"),
	ERROR(-1, "失败"),
	
	LOGINFAIL(1001, "用户名或密码错误");
	
	private ErrorCode(int errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	/**
	 * 错误代码
	 */
	private int errorCode;
	/**
	 * 错误描述
	 */
	private String errorMsg;

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

}
