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

import java.util.List;

import org.springframework.stereotype.Repository;

import com.goldheaven.core.entity.UserInfo;

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
	UserInfo getUserById(Long id);
	
	/**
	 * 条件查询用户列表（分页）
	 * @return
	 */
	List<UserInfo> getUserListByParam();
	
	/**
	 * 条件查询用户总数
	 * @return
	 */
	Integer getUserNumByParam();
	
	/**
	 * 保存用户
	 * @param user
	 * @return
	 */
	Integer saveUser(UserInfo user);
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	Integer updateUser(UserInfo user);
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	Integer deleteUser(Long id);
}
