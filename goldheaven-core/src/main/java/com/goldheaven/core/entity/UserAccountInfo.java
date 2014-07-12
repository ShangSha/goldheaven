package com.goldheaven.core.entity;

import java.io.Serializable;

/**
 * 
 * <p>
 * ************************************************************** 
 * @Description: TODO(用户账户信息) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:07:36 
 * ***************************************************************
 * </p>
 */
public class UserAccountInfo implements Serializable {
	
	private static final long serialVersionUID = 6121151584199021591L;

	/**
	 * ID
	 */
	private Long id;
	
	/**
	 * 账户总金币
	 */
	private Long totalGoldcoin;
	
	/**
	 * 可兑换金币
	 */
	private Long freeGoldcoin;
	
	/**
	 * 已支付金额
	 */
	private Double paidMoney;
	
	/**
	 * 所属用户
	 */
	private UserInfo user;
	
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
		UserAccountInfo other = (UserAccountInfo) obj;
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

	public Long getTotalGoldcoin() {
		return totalGoldcoin;
	}

	public void setTotalGoldcoin(Long totalGoldcoin) {
		this.totalGoldcoin = totalGoldcoin;
	}

	public Long getFreeGoldcoin() {
		return freeGoldcoin;
	}

	public void setFreeGoldcoin(Long freeGoldcoin) {
		this.freeGoldcoin = freeGoldcoin;
	}

	public Double getPaidMoney() {
		return paidMoney;
	}

	public void setPaidMoney(Double paidMoney) {
		this.paidMoney = paidMoney;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserAccountInfo [id=" + id + ", totalGoldcoin=" + totalGoldcoin + ", freeGoldcoin=" 
	              + freeGoldcoin + ", paidMoney=" + paidMoney + ", user=" + user + "]";
	}

}
