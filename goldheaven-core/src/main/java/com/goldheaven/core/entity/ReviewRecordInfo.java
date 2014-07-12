package com.goldheaven.core.entity;

import java.io.Serializable;
import java.util.Date;

import com.goldheaven.core.entity.ConvertRecordInfo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(提现审核记录) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午5:59:14 
 * ***************************************************************
 * </p>
 */
public class ReviewRecordInfo implements Serializable {
	
	private static final long serialVersionUID = 8937686601168328340L;

	/**
	 * ID
	 */
	private Long id;
	
	/**
	 * 审核人
	 */
	private String reviewPerson;
	
	/**
	 * 审核信息
	 */
	private String message;
	
	/**
	 * 审核时间
	 */
	private Date reviewTime;
	
	/**
	 * 兑换记录
	 */
	private ConvertRecordInfo drawRecord;

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
		ReviewRecordInfo other = (ReviewRecordInfo) obj;
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

	public String getReviewPerson() {
		return reviewPerson;
	}

	public void setReviewPerson(String reviewPerson) {
		this.reviewPerson = reviewPerson;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getReviewTime() {
		return reviewTime;
	}

	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}

	public ConvertRecordInfo getDrawRecord() {
		return drawRecord;
	}

	public void setDrawRecord(ConvertRecordInfo drawRecord) {
		this.drawRecord = drawRecord;
	}
	
}
