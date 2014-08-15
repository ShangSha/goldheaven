package com.goldheaven.core.entity;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

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
	private Integer totalGoldcoin;
	
	/**
	 * 可兑换金币
	 */
	private Integer freeGoldcoin;
	
	/**
	 * 已支付金额
	 */
	private Double paidMoney;
	
	/**
	 * 所属用户ID
	 */
	private Long userId;
	
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
	 * @return the totalGoldcoin
	 */
	public Integer getTotalGoldcoin() {
		return totalGoldcoin;
	}

	/**
	 * @param totalGoldcoin the totalGoldcoin to set
	 */
	public void setTotalGoldcoin(Integer totalGoldcoin) {
		this.totalGoldcoin = totalGoldcoin;
	}

	/**
	 * @return the freeGoldcoin
	 */
	public Integer getFreeGoldcoin() {
		return freeGoldcoin;
	}

	/**
	 * @param freeGoldcoin the freeGoldcoin to set
	 */
	public void setFreeGoldcoin(Integer freeGoldcoin) {
		this.freeGoldcoin = freeGoldcoin;
	}

	/**
	 * @return the paidMoney
	 */
	public Double getPaidMoney() {
		return paidMoney;
	}

	/**
	 * @param paidMoney the paidMoney to set
	 */
	public void setPaidMoney(Double paidMoney) {
		this.paidMoney = paidMoney;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
