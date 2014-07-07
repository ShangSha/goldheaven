/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:16:29 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goldheaven.core.dao.IUserDao;
import com.goldheaven.core.entity.UserEntity;
import com.goldheaven.core.service.IUserService;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(用户业务逻辑实现类) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:16:29 
 * ***************************************************************
 * </p>
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public UserEntity getUserById(Long id) {
		return userDao.getUserById(id);
	}

	@Override
	public boolean saveUser(UserEntity user) {
		return userDao.saveUser(user) > 0;
	}

	@Override
	public boolean updateUser(UserEntity user) {
		return userDao.updateUser(user) > 0;
	}

	@Override
	public boolean deleteUser(Long id) {
		return userDao.deleteUser(id) > 0;
	}
	
}
