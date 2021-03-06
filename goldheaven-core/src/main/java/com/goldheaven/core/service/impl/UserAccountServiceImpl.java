package com.goldheaven.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goldheaven.core.dao.IUserAccountDao;
import com.goldheaven.core.entity.UserAccountInfo;
import com.goldheaven.core.service.IUserAccountService;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(用户账户业务逻辑实现类) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:16:13 
 * ***************************************************************
 * </p>
 */

@Transactional
@Service("userAccountService")
public class UserAccountServiceImpl implements IUserAccountService {
	
	@Autowired
	private IUserAccountDao userAccountDao;

	@Override
	public UserAccountInfo getUserAccountByUserId(Long userId) {
		return userAccountDao.getUserAccountByUserId(userId);
	}

	@Override
	public List<UserAccountInfo> getUserAccountListByParam() {
		return userAccountDao.getUserAccountListByParam();
	}

	@Override
	public Integer getUserAccountNumByParam() {
		return userAccountDao.getUserAccountNumByParam();
	}
	
}
