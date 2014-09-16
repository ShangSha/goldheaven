/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-9-16 下午3:00:19 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.entity;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(意见反馈记录) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-9-16 下午3:00:19 
 * ***************************************************************
 * </p>
 */

public class FeedbackInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 唯一标识
	 */
	private Long id;
	
	/**
	 * 反馈内容
	 */
	private String content;
	
	/**
	 * 联系方式
	 */
	private String contact;
	
	/**
	 * APP版本信息
	 */
	private Integer appVersionId;
	
	/**
	 * 用户ID
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
		FeedbackInfo other = (FeedbackInfo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the appVersionId
	 */
	public Integer getAppVersionId() {
		return appVersionId;
	}

	/**
	 * @param appVersionId the appVersionId to set
	 */
	public void setAppVersionId(Integer appVersionId) {
		this.appVersionId = appVersionId;
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
	
}
