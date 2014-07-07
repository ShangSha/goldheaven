/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:10:41 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.dao;

import org.springframework.stereotype.Repository;

import com.goldheaven.core.entity.UserEntity;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(用户数据持久层) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:10:41 
 * ***************************************************************
 * </p>
 */
@Repository
public interface IUserDao {

	/**
	 * 通过ID获取用户
	 * @param id
	 * @return
	 */
	UserEntity getUserById(Long id);
	
	/**
	 * 保存用户
	 * @param user
	 * @return
	 */
	Integer saveUser(UserEntity user);
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	Integer updateUser(UserEntity user);
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	Integer deleteUser(Long id);
}
