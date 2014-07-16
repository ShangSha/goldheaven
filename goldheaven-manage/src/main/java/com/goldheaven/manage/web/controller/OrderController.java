package com.goldheaven.manage.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldheaven.core.entity.OrderInfo;
import com.goldheaven.core.service.IOrderService;
import com.goldheaven.core.util.JsonWrapper;
import com.goldheaven.core.util.Page;
import com.goldheaven.manage.web.vo.EasyUIVo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(订单) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-11 下午2:17:57 
 * ***************************************************************
 * </p>
 */
@Controller
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	private IOrderService orderService;
	
	@ResponseBody
	@RequestMapping(value = "list")
	public EasyUIVo<OrderInfo> list(Page page) {
		List<OrderInfo> list = orderService.getOrderListByParam();
		int total = orderService.getOrderNumByParam();
		return new EasyUIVo<OrderInfo>(list, total);
	}
	
	@ResponseBody
	@RequestMapping(value = "update")
	public JsonWrapper updateOrder(OrderInfo order) {
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value = "delete")
	public JsonWrapper deleteOrder(Long id) {
		return null;
	}

}
