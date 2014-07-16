package com.goldheaven.core.service;

import com.goldheaven.core.entity.UserAccountInfo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(用户账户业务逻辑接口) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:16:13 
 * ***************************************************************
 * </p>
 */

public interface IUserAccountService {
	
	/**
	 * 通过用户ID获取用户账单
	 * @param userId
	 * @return
	 */
	UserAccountInfo getUserAccountByUserId(Long userId);

}
