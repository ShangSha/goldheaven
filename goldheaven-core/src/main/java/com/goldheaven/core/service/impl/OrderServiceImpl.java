package com.goldheaven.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goldheaven.core.dao.IOrderDao;
import com.goldheaven.core.entity.OrderInfo;
import com.goldheaven.core.service.IOrderService;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(订单业务逻辑实现类) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午12:16:29 
 * ***************************************************************
 * </p>
 */

@Transactional
@Service("orderService")
public class OrderServiceImpl implements IOrderService {
	
	@Autowired
	private IOrderDao orderDao;
	
	@Override
	public int saveOrder(OrderInfo order) {
		
		// 判断订单是否存在
		if(orderDao.isOrderExist(order.getOrderId(), order.getChannelId()) > 0) {
			return 0;
		}
		
		return orderDao.saveOrder(order) > 0 ? 1 : 2;
	}

	@Override
	public List<OrderInfo> getOrderListByParam() {
		return orderDao.getOrderListByParam();
	}

	@Override
	public Integer getOrderNumByParam() {
		return orderDao.getOrderNumByParam();
	}

	@Override
	public boolean deleteOrder(Long id) {
		return orderDao.deleteOrder(id) > 0;
	}

}
