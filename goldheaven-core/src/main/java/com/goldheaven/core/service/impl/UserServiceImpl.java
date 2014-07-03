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

import com.goldheaven.core.dao.IUserDao;
import com.goldheaven.core.entity.UserEntity;
import com.goldheaven.core.service.IUserService;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:16:29 
 * ***************************************************************
 * </p>
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	public UserEntity getUserById(Long id) {
		return userDao.getUserById(id);
	}
}
