/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-16 下午3:39:36 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.dao;

import java.util.List;

import com.goldheaven.core.entity.AppVersionInfo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(APP版本信息数据持久层接口) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-16 下午3:39:36 
 * ***************************************************************
 * </p>
 */

public interface IAppVersionDao {
	
	/**
	 * 多条件查询版本信息列表
	 * @return
	 */
	List<AppVersionInfo> getVersionListByParam();
	
	/**
	 * 获取版本信息总数（多条件）
	 * @return
	 */
	Integer getVersionNumByParam();

}
