package com.goldheaven.core.service;

import java.util.List;

import com.goldheaven.core.entity.ConvertRecordInfo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(兑换业务逻辑接口) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:16:13 
 * ***************************************************************
 * </p>
 */

public interface IConvertRecordService {
	
	/**
	 * 兑换记录多条件查询
	 * @return
	 */
	List<ConvertRecordInfo> getConvertRecordListByParam();
	
	/**
	 * 兑换记录总数（多条件）
	 * @return
	 */
	Integer getConvertRecordNumByParam();
	
	/**
	 * 保存用户记录
	 * @return
	 */
	boolean saveConvertRecord(ConvertRecordInfo convertRecord);

}
