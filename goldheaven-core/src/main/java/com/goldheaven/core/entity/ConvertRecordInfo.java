package com.goldheaven.core.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * <p>
 * ************************************************************** 
 * @Description: TODO(兑换记录) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:07:36 
 * ***************************************************************
 * </p>
 */
public class ConvertRecordInfo implements Serializable {
	
	private static final long serialVersionUID = 2832815562551841321L;

	/**
	 * ID
	 */
	private Long id;
	
	/**
	 * 兑换积分
	 */
	private Long convertGoldcoin;
	
	/**
	 * 兑换方式
	 */
	private String convertType;
	
	/**
	 * 兑换金额
	 */
	private Double convertMoney;
	
	/**
	 * 兑换时间
	 */
	private Date convertTime;
	
	/**
	 * 兑换用户
	 */
	private UserInfo user;
	
	/**
	 * 审核记录
	 */
	private ReviewRecordInfo reviewRecord;
	
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
		ConvertRecordInfo other = (ConvertRecordInfo) obj;
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

	public Long getConvertGoldcoin() {
		return convertGoldcoin;
	}

	public void setConvertGoldcoin(Long convertGoldcoin) {
		this.convertGoldcoin = convertGoldcoin;
	}

	public String getConvertType() {
		return convertType;
	}

	public void setConvertType(String convertType) {
		this.convertType = convertType;
	}

	public Double getConvertMoney() {
		return convertMoney;
	}

	public void setConvertMoney(Double convertMoney) {
		this.convertMoney = convertMoney;
	}

	public Date getConvertTime() {
		return convertTime;
	}

	public void setConvertTime(Date convertTime) {
		this.convertTime = convertTime;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public ReviewRecordInfo getReviewRecord() {
		return reviewRecord;
	}

	public void setReviewRecord(ReviewRecordInfo reviewRecord) {
		this.reviewRecord = reviewRecord;
	}

	@Override
	public String toString() {
		return "ConvertRecordInfo [id=" + id + ", convertGoldcoin=" + convertGoldcoin + 
				", convertType=" + convertType + ", convertMoney=" + convertMoney + ", convertTime="
				+ convertTime + ", user=" + user + ", reviewRecord=" + reviewRecord + "]";
	}

}
