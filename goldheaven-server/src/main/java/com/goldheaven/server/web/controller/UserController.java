/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:25:25 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.server.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldheaven.core.constants.ErrorCode;
import com.goldheaven.core.entity.UserEntity;
import com.goldheaven.core.service.IUserService;
import com.goldheaven.core.util.JsonWrapper;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(用户控制器) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:25:25 
 * ***************************************************************
 * </p>
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	private static Logger LOG = Logger.getLogger(UserController.class);

	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping(value = "save")
	public JsonWrapper saveUser(UserEntity user) {
		
		// 默认成功
		ErrorCode errorCode = ErrorCode.SUCCESS;
		
		try {
			if(!userService.saveUser(user)) {
				errorCode = ErrorCode.ERROR;
				LOG.error("Save " + user.toString() + " error.");
			}
		} catch (Exception e) {
			errorCode = ErrorCode.ERROR;
			LOG.error("Save " + user.toString() + " exception. Cause by " + e.toString());
		}
		
		return new JsonWrapper(errorCode);
	}
	
	@ResponseBody
	@RequestMapping(value = "update")
	public JsonWrapper updateUser(UserEntity user) {
		
		// 默认成功
		ErrorCode errorCode = ErrorCode.SUCCESS;
		
		try {
			if(!userService.updateUser(user)) {
				errorCode = ErrorCode.ERROR;
				LOG.error("Update " + user.toString() + " error.");
			}
		} catch (Exception e) {
			errorCode = ErrorCode.ERROR;
			LOG.error("Update " + user.toString() + " exception. Cause by " + e.toString());
		}
		
		return new JsonWrapper(errorCode);
	}
	
}
