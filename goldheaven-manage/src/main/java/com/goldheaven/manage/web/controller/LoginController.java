/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-11 下午2:17:57 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.manage.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldheaven.core.constants.enums.ErrorCode;
import com.goldheaven.core.util.JsonWrapper;
import com.goldheaven.manage.entity.AdminInfo;
import com.goldheaven.manage.service.IAdminService;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(后台运营系统登录) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-11 下午2:17:57 
 * ***************************************************************
 * </p>
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	private static Logger LOG = Logger.getLogger(LoginController.class);
	
	@Autowired
	private IAdminService adminService;
	
	@ResponseBody
	@RequestMapping(value = "check")
	public JsonWrapper check(String userName, String passWord, HttpServletRequest request) {
		
		// 默认登录失败
		ErrorCode errorCode = ErrorCode.LOGINFAIL;
		
		try {
			AdminInfo admin = adminService.getAdminByNameAndPW(userName, passWord);
			
			if(admin != null) { 
				// 存入session中
				request.getSession().setAttribute("admin", admin);
				errorCode = ErrorCode.SUCCESS;
			}
		} catch (Exception e) {
			errorCode = ErrorCode.ERROR;
			LOG.error(userName + " login exception. Cause by " + e.toString());
		}
		
		return new JsonWrapper(errorCode);
	}
	
	/**
	 * 退出登录
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "logout")
	public JsonWrapper logout(HttpServletRequest request) {
		request.getSession().removeAttribute("admin");
		return new JsonWrapper();
	}

}
