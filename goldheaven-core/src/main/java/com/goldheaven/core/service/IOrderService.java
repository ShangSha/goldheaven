package com.goldheaven.core.service;

import java.util.List;

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
	
	/**
	 * 多条件查询订单信息
	 * @return
	 */
	List<OrderInfo> getOrderListByParam();
	
	/**
	 * 多条件查询订单总数
	 * @return
	 */
	Integer getOrderNumByParam();
	
	/**
	 * 通过ID删除订单
	 * @param id
	 * @return
	 */
	boolean deleteOrder(Long id);
	
	/**
	 * 统计单个用户的总金币数量
	 * @param userId
	 * @return
	 */
	Integer countGoldcoinsByUserId(Long userId);

}
