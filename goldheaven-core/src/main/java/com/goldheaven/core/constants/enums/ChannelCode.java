/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-7 下午3:40:13 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.constants.enums;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(渠道商代码) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-7 下午3:40:13 
 * ***************************************************************
 * </p>
 */

public enum ChannelCode {
	
	YOUMI("1", "有米积分墙");

	private ChannelCode(String channelCode, String channelName) {
		this.channelCode = channelCode;
		this.channelName = channelName;
	}
	
	/**
	 * 渠道号
	 */
	private String channelCode;
	
	/**
	 * 渠道商名称
	 */
	private String channelName;

	/**
	 * @return the channelCode
	 */
	public String getChannelCode() {
		return channelCode;
	}

	/**
	 * @return the channelName
	 */
	public String getChannelName() {
		return channelName;
	}
	
}
