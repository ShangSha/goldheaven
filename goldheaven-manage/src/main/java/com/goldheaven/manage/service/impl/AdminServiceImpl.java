/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午6:07:37 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.manage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goldheaven.manage.dao.IAdminDao;
import com.goldheaven.manage.entity.AdminEntity;
import com.goldheaven.manage.service.IAdminService;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午6:07:37 
 * ***************************************************************
 * </p>
 */
@Transactional
@Service("adminService")
public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	private IAdminDao adminDao;

	@Override
	public AdminEntity getUserByNameAndPW(String userName, String passWord) {
		return adminDao.getUserByNameAndPW(userName, passWord);
	}

}
