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

import com.goldheaven.core.entity.UserEntity;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:10:41 
 * ***************************************************************
 * </p>
 */

public interface IUserDao {

	/**
	 * 通过ID获取用户
	 * @param id
	 * @return
	 */
	UserEntity getUserById(Long id);
}
