package com.goldheaven.manage.web.vo;

import java.util.List;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(EasyUI 列表模型) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 上午11:03:01 
 * ***************************************************************
 * </p>
 */
public class EasyUIVo<T> {
	
	/**
	 * 数据列表
	 */
	private List<T> rows;
	
	/**
	 * 查询总记录数
	 */
	private Integer total;
	
	public EasyUIVo() {
		super();
	}

	public EasyUIVo(List<T> rows, Integer total) {
		super();
		this.rows = rows;
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
	
}
