package com.goldheaven.server.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldheaven.core.constants.enums.ErrorCode;
import com.goldheaven.core.entity.ConvertRecordInfo;
import com.goldheaven.core.service.IConvertRecordService;
import com.goldheaven.core.util.JsonWrapper;
import com.goldheaven.core.util.Page;

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
	
	private static final Logger LOG = Logger.getLogger(ConvertRecordController.class);
	
	@Autowired
	private IConvertRecordService convertRecordService;
	
	/**
	 * 获取单个用户兑换记录
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "list/${userId}")
	public @ResponseBody JsonWrapper list(@PathVariable Long userId, Page page) {
		JsonWrapper json = new JsonWrapper();
		
		try {
			List<ConvertRecordInfo> list = convertRecordService.getConvertRecordListByParam();
			page.setTotal(convertRecordService.getConvertRecordNumByParam());
			json.setData(list);
			json.setPage(page);
		} catch (Exception e) {
			json.setErrorCode(ErrorCode.ERROR);
			LOG.error("Get user [" + userId + "]'s convert record exception. Cause by " + e.toString());
		}
		return json;
	}
	
	/**
	 * 用户申请金币兑换
	 * @return
	 */
	@RequestMapping(value = "convert")
	public @ResponseBody JsonWrapper convert(ConvertRecordInfo convertRecord) {
		JsonWrapper json = new JsonWrapper();
		
		try {
			if(!convertRecordService.saveConvertRecord(convertRecord)) {
				json.setErrorCode(ErrorCode.ERROR);
			}
		} catch (Exception e) {
			json.setErrorCode(ErrorCode.ERROR);
			LOG.error("Convert user [" + convertRecord + "]'s exception. Cause by " + e.toString());
		}
		return json;
	}

}
