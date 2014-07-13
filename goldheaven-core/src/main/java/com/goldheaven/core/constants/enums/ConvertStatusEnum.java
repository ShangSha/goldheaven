package com.goldheaven.core.constants.enums;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(兑换记录审核信息) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午4:48:11 
 * ***************************************************************
 * </p>
 */

public enum ConvertStatusEnum {
	
	UN_AUDITED(1, "未审核"),
	
	SUCCESS(2, "兑换成功"),
	
	FAIL(3, "兑换失败");

	private ConvertStatusEnum(Integer status, String introduceCN) {
		this.status = status;
		this.introduceCN = introduceCN;
	}
	
	/**
	 * 处理状态
	 */
	private Integer status;
	
	/**
	 * 处理中文
	 */
	private String introduceCN;

	public Integer getStatus() {
		return status;
	}

	public String getIntroduceCN() {
		return introduceCN;
	}

}
