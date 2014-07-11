/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午6:06:34 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.manage.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.goldheaven.manage.entity.AdminEntity;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午6:06:34 
 * ***************************************************************
 * </p>
 */
@Repository
public interface IAdminDao {

	/**
	 * 通过用户名和密码获取用户
	 * @param userName
	 * @param passWord
	 */
	AdminEntity getUserByNameAndPW(@Param("userName")String userName, @Param("passWord")String passWord);
}
