/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午6:06:52 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.manage.service;

import com.goldheaven.manage.entity.AdminEntity;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午6:06:52 
 * ***************************************************************
 * </p>
 */

public interface IAdminService {
	
	/**
	 * 通过用户名和密码获取用户
	 * @return
	 */
	AdminEntity getUserByNameAndPW(String userName, String passWord);

}
