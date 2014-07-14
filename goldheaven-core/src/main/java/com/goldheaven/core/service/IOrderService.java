package com.goldheaven.core.service;

import com.goldheaven.core.entity.OrderInfo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(订单业务逻辑接口) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:16:13 
 * ***************************************************************
 * </p>
 */

public interface IOrderService {
	
	/**
	 * 添加订单
	 * @param order
	 * @return 0:订单已存在;1:成功;2;失败
	 */
	int saveOrder(OrderInfo order);

}
