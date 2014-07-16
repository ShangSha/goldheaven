package com.goldheaven.core.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.goldheaven.core.entity.ConvertRecordInfo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(兑换记录数据持久层) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:10:41 
 * ***************************************************************
 * </p>
 */
@Repository
public interface IConvertRecordDao {
	
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

}
