/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-16 下午3:34:51 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(APP版本信息) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-16 下午3:34:51 
 * ***************************************************************
 * </p>
 */

public class AppVersionInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	/**
	 * 版本名称
	 */
	private String name;
	
	/**
	 * app类型
	 */
	private Integer type;
	
	/**
	 * 更新内容
	 */
	private String content;
	
	/**
	 * 下载地址
	 */
	private String url;
	
	/**
	 * 更新时间
	 */
	private Date pubTime;
	
	/**
	 * 是否启用
	 */
	private Integer status;

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
		AppVersionInfo other = (AppVersionInfo) obj;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the pubTime
	 */
	public Date getPubTime() {
		return pubTime;
	}

	/**
	 * @param pubTime the pubTime to set
	 */
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AppVersionInfo [id=" + id + ", name=" + name + ", type=" + type + ", content=" 
	        + content + ", url=" + url + ", pubTime=" + pubTime + ", status=" + status + "]";
	}
	
	

}
