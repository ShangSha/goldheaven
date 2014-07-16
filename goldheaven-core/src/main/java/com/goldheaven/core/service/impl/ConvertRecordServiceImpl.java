package com.goldheaven.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goldheaven.core.dao.IConvertRecordDao;
import com.goldheaven.core.entity.ConvertRecordInfo;
import com.goldheaven.core.service.IConvertRecordService;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(兑换业务逻辑实现类) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:16:29 
 * ***************************************************************
 * </p>
 */

@Transactional
@Service("convertRecordService")
public class ConvertRecordServiceImpl implements IConvertRecordService {
	
	@Autowired
	private IConvertRecordDao convertRecordDao;

	@Override
	public List<ConvertRecordInfo> getConvertRecordListByParam() {
		return convertRecordDao.getConvertRecordListByParam();
	}

	@Override
	public Integer getConvertRecordNumByParam() {
		return convertRecordDao.getConvertRecordNumByParam();
	}

}
