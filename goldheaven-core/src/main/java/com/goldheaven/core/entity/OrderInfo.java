package com.goldheaven.core.entity;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * <p>
 * ************************************************************** 
 * @Description: TODO(订单) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:07:36 
 * ***************************************************************
 * </p>
 */
public class OrderInfo implements Serializable {
	
	private static final long serialVersionUID = 6986489413556429227L;

	/**
	 * ID
	 */
	private Long id;
	
	/**
	 * 订单ID
	 */
	private String orderId;
	
	/**
	 * 广告名称
	 */
	private String adName;
	
	/**
	 * 渠道号
	 */
	private Integer channelId;
	
	/**
	 * 获取的积分
	 */
	private Integer goldcoins;
	
	/**
	 * 设备ID
	 */
	private String deviceId;
	
	/**
	 * 订单创建时间
	 */
	private Date time;
	
	/**
	 * 用户ID
	 */
	private Long userId;
	
	/**
	 * 用户名
	 */
	private String userName;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderInfo other = (OrderInfo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the adName
	 */
	public String getAdName() {
		return adName;
	}

	/**
	 * @param adName the adName to set
	 */
	public void setAdName(String adName) {
		this.adName = adName;
	}

	/**
	 * @return the channelId
	 */
	public Integer getChannelId() {
		return channelId;
	}

	/**
	 * @param channelId the channelId to set
	 */
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	/**
	 * @return the goldcoins
	 */
	public Integer getGoldcoins() {
		return goldcoins;
	}

	/**
	 * @param goldcoins the goldcoins to set
	 */
	public void setGoldcoins(Integer goldcoins) {
		this.goldcoins = goldcoins;
	}

	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
