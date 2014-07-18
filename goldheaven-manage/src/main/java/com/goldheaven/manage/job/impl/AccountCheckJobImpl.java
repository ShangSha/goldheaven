/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-17 上午11:28:26 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.manage.job.impl;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.goldheaven.manage.job.AccountCheckJob;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(对账信息) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-17 上午11:28:26 
 * ***************************************************************
 * </p>
 */
@Component("accountCheckJob")
public class AccountCheckJobImpl implements AccountCheckJob {
	
	@Override
	public void accountCheckUserByTime(Long userId, 
			Date startTime, Date endTime, String operator) {
		
	}
	
	@Override
	public void accountCheck() {
		
	}
	
}
