/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-16 下午3:53:33 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.constants.enums;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(APP类型枚举) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-16 下午3:53:33 
 * ***************************************************************
 * </p>
 */

public enum AppTypeEnum {
	
	IOS(1, "IOS"),
	
	ANDROID(2, "Android");

	private AppTypeEnum(int typeCode, String typeName) {
		this.typeCode = typeCode;
		this.typeName = typeName;
	}
	
	/**
	 * APP类型编号
	 */
	private int typeCode;
	
	/**
	 * APP类型名称
	 */
	private String typeName;

	/**
	 * @return the typeCode
	 */
	public int getTypeCode() {
		return typeCode;
	}

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}
	
}
