package com.goldheaven.core.util;

import java.io.Serializable;

/**
 * 
 * <p>
 * ************************************************************** 
 * @Description: TODO(分页工具对象) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-14 下午12:22:26 
 * ***************************************************************
 * </p>
 */
public class Page implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 每页显示记录数
	 */
	private int pageSize = 20;
	
	/**
	 * 共多少条记录
	 */
	private int recordCount = 0;
	
	/**
	 * 共几页
	 */
	private int pageCount = 1;
	
	/**
	 * 当前第几页
	 */
	private int page = 1;

	public Page() {
	}

	public Page(int pageSize) {
		this.pageSize = pageSize;
	}

	public Page(int page, int pageSize) {
		this.page = page;
		this.pageSize = pageSize;
	}
	
	/**
	 * 完全构造器
	 * @param pageSize
	 * @param recordCount
	 * @param pageCount
	 * @param pageNo
	 */
	public Page(int pageSize, int recordCount, int pageCount, int page) {
		super();
		this.pageSize = pageSize;
		this.recordCount = recordCount;
		this.pageCount = pageCount;
		this.page = page;
	}

	/**
	 * 获得每页记录数
	 * 
	 * @return
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * 每页显示记录数
	 * @param pageSize
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 获取总记录数
	 * @return
	 */
	public int getRecordCount() {
		return recordCount;
	}

	/**
	 * 共多少条记录数
	 * @param recordCount
	 */
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	/**
	 * 获取总页数 最小值为1
	 * @return
	 */
	public int getPageCount() {
		
		// 根据总页数，获取总页数 
		if (this.recordCount > 0) {
			if (recordCount % pageSize == 0) {
				this.pageCount = recordCount / pageSize;
			} else {
				this.pageCount = recordCount / pageSize + 1;
			}
		} else {
			this.pageCount = 1;
		}

		return this.pageCount;
	}

	/**
	 * 共几页
	 * @param pageCount
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * 获得当前页数<br>
	 * 注意：有可能当前页数大于总页数
	 * @return
	 */
	public int getPage() {
		if (page <= 0) {
			page = 1;
		}

		return page;
	}

	/**
	 * 设置当前第几页
	 * 
	 * @param pageNo
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * 当前页面第一行
	 * @return
	 */
	public int getFirstRow() {
		return (this.getPage() - 1) * this.getPageSize();
	}

	/**
	 * 下一页第一行
	 * @return
	 */
	public int getEndRow() {
		return this.getPage() * this.getPageSize() + 1;
	}

}