/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-17 上午11:27:58 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.manage.job;

import java.util.Date;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(对账业务任务接口) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-17 上午11:27:58 
 * ***************************************************************
 * </p>
 */

public interface IAccountCheckJob {
	
	/**
	 * 对账（单个用户某天的账单）
	 * @param userId 用户ID
	 * @param operator 操作人
	 * @param date 对账时间
	 */
	void accountCheckUserByTime(Long userId, Date startTime, Date endTime, String operator);
	
	/**
	 * 对总账
	 */
	void accountCheck();
	
}
