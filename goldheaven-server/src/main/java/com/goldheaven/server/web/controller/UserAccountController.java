/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-16 下午4:57:09 
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
import com.goldheaven.core.entity.UserAccountInfo;
import com.goldheaven.core.service.IUserAccountService;
import com.goldheaven.core.util.JsonWrapper;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(用户账单) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-16 下午4:57:09 
 * ***************************************************************
 * </p>
 */
@Controller
@RequestMapping("account")
public class UserAccountController {
	
	private static final Logger LOG = Logger.getLogger(UserAccountController.class);
	
	@Autowired
	private IUserAccountService userAccountService;

	/**
	 * 获取用户账单
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "getAccount/{userId}")
	public @ResponseBody JsonWrapper getUserAccountByUserId(@PathVariable Long userId) {
		JsonWrapper json = new JsonWrapper(); // 默认成功

		try {
			UserAccountInfo userAccount = userAccountService.getUserAccountByUserId(userId);
			json.setData(userAccount);
			
			if(userAccount == null) {
				json.setErrorCode(ErrorCode.USER_NOTEXIST);
			}
		} catch (Exception e) {
			json.setErrorCode(ErrorCode.ERROR);
			LOG.error("Get user [" + userId + "]'s account exception. Cause by " + e.toString());
		}
		return json;
	}
	
}
