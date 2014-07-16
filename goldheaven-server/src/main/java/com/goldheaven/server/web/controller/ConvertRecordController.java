package com.goldheaven.server.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldheaven.core.entity.ConvertRecordInfo;
import com.goldheaven.core.util.JsonWrapper;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(兑换记录控制器) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-7 下午6:26:00 
 * ***************************************************************
 * </p>
 */
@Controller
@RequestMapping("convert")
public class ConvertRecordController {
	
	/**
	 * 获取单个用户兑换记录
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "list/${userId}")
	public @ResponseBody JsonWrapper list(@PathVariable Long userId) {
		return null;
	}
	
	/**
	 * 用户申请金币兑换
	 * @return
	 */
	@RequestMapping(value = "convert")
	public @ResponseBody JsonWrapper convert(ConvertRecordInfo convertRecord) {
		return null;
	}

}
