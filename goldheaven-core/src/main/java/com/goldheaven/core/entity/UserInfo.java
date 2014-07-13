package com.goldheaven.core.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * <p>
 * ************************************************************** 
 * @Description: TODO(用户信息) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:07:36 
 * ***************************************************************
 * </p>
 */
public class UserInfo implements Serializable {
	
	private static final long serialVersionUID = -8879028159658754925L;

	/**
	 * ID
	 */
	private Long id;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 电话号码
	 */
	private String telePhone;
	
	/**
	 * 支付宝账号
	 */
	private String alipayAccount;
	
	/**
	 * 注册时间
	 */
	private Date createTime;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		UserInfo other = (UserInfo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTelePhone() {
		return telePhone;
	}

	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}

	public String getAlipayAccount() {
		return alipayAccount;
	}

	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", telePhone=" + telePhone 
				+ ", alipayAccount=" + alipayAccount + ", createTime=" + createTime + "]";
	}

}
