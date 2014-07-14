/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午6:07:37 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goldheaven.core.dao.IAdminDao;
import com.goldheaven.core.entity.AdminInfo;
import com.goldheaven.core.service.IAdminService;
import com.goldheaven.core.util.Page;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(管理员用户业务逻辑实现类) 
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
	public List<AdminInfo> getAdminList(Page page) {
		return adminDao.getAdminList(page.getFirstRow(), page.getPageSize());
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
