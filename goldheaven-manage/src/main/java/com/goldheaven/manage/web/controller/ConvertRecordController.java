package com.goldheaven.manage.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldheaven.core.entity.ConvertRecordInfo;
import com.goldheaven.core.service.IConvertRecordService;
import com.goldheaven.manage.web.vo.EasyUIVo;

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
	
	@Autowired
	private IConvertRecordService convertRecordService;
	
	@ResponseBody
	@RequestMapping(value = "list")
	public EasyUIVo<ConvertRecordInfo> list() {
		List<ConvertRecordInfo> list = convertRecordService.getConvertRecordListByParam();
		int total = convertRecordService.getConvertRecordNumByParam();
		return new EasyUIVo<ConvertRecordInfo>(list, total);
	}

}
