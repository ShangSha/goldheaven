package com.goldheaven.core.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.goldheaven.core.entity.UserAccountInfo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(用户账户数据持久层) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:10:41 
 * ***************************************************************
 * </p>
 */
@Repository
public interface IUserAccountDao {
	
	/**
	 * 通过用户ID，获取用户账单
	 * @return
	 */
	UserAccountInfo getUserAccountByUserId(Long userId);
	
	/**
	 * 多条件查询用户账单列表（分页）
	 * @return
	 */
	List<UserAccountInfo> getUserAccountListByParam();
	
	/**
	 * 多条件查询用户账单总数
	 * @return
	 */
	Integer getUserAccountNumByParam();

}
