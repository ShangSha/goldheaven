/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:16:13 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.service;

import java.util.List;

import com.goldheaven.core.entity.UserEntity;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(用户业务逻辑接口) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:16:13 
 * ***************************************************************
 * </p>
 */

public interface IUserService {

	/**
	 * 通过ID获取用户
	 * @param id
	 * @return
	 */
	UserEntity getUserById(Long id);
	
	
	List<UserEntity> getUserList();
	
	/**
	 * 保存用户信息
	 * @param user
	 * @return
	 */
	boolean saveUser(UserEntity user);
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	boolean updateUser(UserEntity user);
	
	/**
	 * 通过ID删除用户信息
	 * @param id
	 * @return
	 */
	boolean deleteUser(Long id);
}
