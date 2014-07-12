package com.goldheaven.core.entity;

import java.io.Serializable;
import java.util.Date;

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
	private String orderID;
	
	/**
	 * 广告名称
	 */
	private String adName;
	
	/**
	 * 渠道号
	 */
	private String channelId;
	
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
	 * 用户
	 */
	private UserInfo user;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
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
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getAdName() {
		return adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Integer getGoldcoins() {
		return goldcoins;
	}

	public void setGoldcoins(Integer goldcoins) {
		this.goldcoins = goldcoins;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", orderID=" + orderID + ", adName=" + adName + 
				", channelId=" + channelId + ", goldcoins=" + goldcoins + ", deviceId=" + deviceId 
				+ ", time=" + time + ", user=" + user + "]";
	}

}
