package com.goldheaven.manage.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldheaven.core.entity.UserAccountInfo;
import com.goldheaven.core.service.IUserAccountService;
import com.goldheaven.manage.web.vo.EasyUIVo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(用户账单) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-11 下午2:17:57 
 * ***************************************************************
 * </p>
 */
@Controller
@RequestMapping("account")
public class UserAccountController {
	
	@Autowired
	private IUserAccountService userAccountService;
	
	@ResponseBody
	@RequestMapping(value = "list")
	public EasyUIVo<UserAccountInfo> list() {
		List<UserAccountInfo> list = userAccountService.getUserAccountListByParam();
		int total = userAccountService.getUserAccountNumByParam();
		return new EasyUIVo<UserAccountInfo>(list, total);
	}

}
