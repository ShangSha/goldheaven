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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldheaven.core.constants.enums.ErrorCode;
import com.goldheaven.core.entity.UserInfo;
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
	@RequestMapping(value = "getUser/{userId}")
	public JsonWrapper getUserByUserId(@PathVariable Long userId) {
		JsonWrapper json = new JsonWrapper();
		
		try {
			UserInfo user = userService.getUserById(userId);
			json.setData(user);
			
			if(user == null) {
				json.setErrorCode(ErrorCode.USER_NOTEXIST);
			}
		} catch (Exception e) {
			json.setErrorCode(ErrorCode.ERROR);
			LOG.error("Get user " + userId + "'s info exception. Cause by " + e.toString());
		}
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value = "save")
	public JsonWrapper saveUser(UserInfo user) {
		ErrorCode errorCode = ErrorCode.SUCCESS; // 默认成功
		
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
	public JsonWrapper updateUser(UserInfo user) {
		ErrorCode errorCode = ErrorCode.SUCCESS; // 默认成功
		
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
