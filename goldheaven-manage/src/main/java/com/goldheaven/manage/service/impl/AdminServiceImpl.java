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

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goldheaven.manage.dao.IAdminDao;
import com.goldheaven.manage.entity.AdminInfo;
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
	public AdminInfo getAdminByNameAndPW(String userName, String passWord) {
		return adminDao.getUserByNameAndPW(userName, passWord);
	}
	
	@Override
	public List<AdminInfo> getAdminList(Integer pageNo, Integer pageSize) {
		
		if(pageNo == null || pageNo < 1) {
			pageNo = 1;
		}
		
		if(pageSize == null || pageSize < 1) {
			pageSize = 20;
		}
		
		return adminDao.getAdminList((pageNo - 1) * pageSize, pageSize);
	}
	
	@Override
	public Integer getAdminNum() {
		return adminDao.getAdminNum();
	}
	
	@Override
	public boolean saveAdmin(AdminInfo admin) {
		admin.setCreateTime(new Date());
		return adminDao.saveAdmin(admin) > 0;
	}

	@Override
	public boolean deleteAdmin(Long id) {
		return adminDao.deleteAdmin(id) > 0;
	}

}
