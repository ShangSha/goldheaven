/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-7 下午6:26:00 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.manage.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldheaven.core.constants.enums.ErrorCode;
import com.goldheaven.core.entity.AdminInfo;
import com.goldheaven.core.service.IAdminService;
import com.goldheaven.core.util.JsonWrapper;
import com.goldheaven.core.util.Page;
import com.goldheaven.manage.web.vo.EasyUIVo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(管理员控制器) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-7 下午6:26:00 
 * ***************************************************************
 * </p>
 */
@Controller
@RequestMapping("admin")
public class AdminController {
	
	private static final Logger LOG = Logger.getLogger(AdminController.class);
	
	@Autowired
	private IAdminService adminService;
	
	@ResponseBody
	@RequestMapping(value = "list")
	public EasyUIVo<AdminInfo> list(Page page) {
		List<AdminInfo> list = adminService.getAdminList(page);
		int total = adminService.getAdminNum();
		return new EasyUIVo<AdminInfo>(list, total);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "save")
	public JsonWrapper saveAdmin(AdminInfo admin, String passWord2) {
		ErrorCode errorCode = ErrorCode.SUCCESS;
		
		// 确定密码一致
		if(admin.getPassWord().equals(passWord2)) {
			try {
				if(!adminService.saveAdmin(admin)) {
					errorCode = ErrorCode.ERROR;
				}
			} catch (Exception e) {
				errorCode = ErrorCode.ERROR;
				LOG.error("Save " + admin + " error.Cause by " + e.toString());
			}
		} else {
			errorCode = ErrorCode.PASSWORD_TWICE_DIFFER;
		}
		
		return new JsonWrapper(errorCode);
	}
	
	@ResponseBody
	@RequestMapping(value = "delete")
	public JsonWrapper deleteAdmin(Long id) {
		ErrorCode errorCode = ErrorCode.SUCCESS;
		
		try {
			if(!adminService.deleteAdmin(id)) {
				errorCode = ErrorCode.ERROR;
			}
		} catch (Exception e) {
			errorCode = ErrorCode.ERROR;
			LOG.error("Delete admin [" + id + "] error.Cause by " + e.toString());
		}
		
		return new JsonWrapper(errorCode);
	}
	
}
