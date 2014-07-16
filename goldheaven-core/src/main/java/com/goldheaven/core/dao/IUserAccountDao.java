package com.goldheaven.core.dao;

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

}
