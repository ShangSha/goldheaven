package com.goldheaven.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.goldheaven.core.entity.OrderInfo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(订单数据持久层) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:10:41 
 * ***************************************************************
 * </p>
 */
@Repository
public interface IOrderDao {
	
	/**
	 * 通过订单ID与渠道号判断订单是否存在
	 * @param orderId
	 * @param channelId
	 * @return
	 */
	Integer isOrderExist(@Param("orderId")String orderId, @Param("channelId")Integer channelId);
	
	/**
	 * 多条件查询订单列表
	 * @return
	 */
	List<OrderInfo> getOrderListByParam();
	
	/**
	 * 多条件查询订单总数
	 * @return
	 */
	Integer getOrderNumByParam();
	
	/**
	 * 保存订单
	 * @param order
	 * @return
	 */
	Integer saveOrder(OrderInfo order);
	
	/**
	 * 通过ID删除订单
	 * @param id
	 * @return
	 */
	Integer deleteOrder(Long id);
	
}
