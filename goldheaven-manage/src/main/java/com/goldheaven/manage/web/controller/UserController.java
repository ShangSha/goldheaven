/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午6:13:58 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.manage.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldheaven.core.entity.UserInfo;
import com.goldheaven.core.service.IUserService;
import com.goldheaven.manage.web.vo.EasyUIVo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(用户控制器) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午6:13:58 
 * ***************************************************************
 * </p>
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping(value = "list")
	public EasyUIVo<UserInfo> list(Integer page, Integer pageSize) {
		List<UserInfo> list = userService.getUserListByParam();
		int total = userService.getUserNumByParam();
		return new EasyUIVo<UserInfo>(list, total);
	}

}
