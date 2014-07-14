/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午6:06:52 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.service;

import java.util.List;

import com.goldheaven.core.entity.AdminInfo;
import com.goldheaven.core.util.Page;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(管理员用户业务逻辑接口) 
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
	AdminInfo getAdminByNameAndPW(String userName, String passWord);
	
	/**
	 * 获取管理员列表（分页）
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	List<AdminInfo> getAdminList(Page page);
	
	/**
	 * 获取管理员记录总数
	 * @return
	 */
	Integer getAdminNum();
	
	/**
	 * 保存用户
	 * @param admin
	 * @return
	 */
	boolean saveAdmin(AdminInfo admin);
	
	/**
	 * 通过ID删除用户
	 * @param id
	 * @return
	 */
	boolean deleteAdmin(Long id);

}
