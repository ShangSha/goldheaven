/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-16 下午3:58:02 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.server.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldheaven.core.constants.enums.ErrorCode;
import com.goldheaven.core.entity.OrderInfo;
import com.goldheaven.core.service.IOrderService;
import com.goldheaven.core.util.JsonWrapper;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(订单控制器) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-16 下午3:58:02 
 * ***************************************************************
 * </p>
 */

@Controller
@RequestMapping("order")
public class OrderController {
	
	private static final Logger LOG = Logger.getLogger(OrderController.class);
	
	@Autowired
	private IOrderService orderService;
	
	/**
	 * 创建订单
	 * @param order
	 * @return
	 */
	@RequestMapping(value = "create")
	public @ResponseBody JsonWrapper createOrder(OrderInfo order) {
		JsonWrapper json = new JsonWrapper();
		try {
			int result = orderService.saveOrder(order);
			
			if(result == 0) {
				json.setErrorCode(ErrorCode.ORDER_EXIST);
			} else if(result == 2) {
				json.setErrorCode(ErrorCode.ERROR);
			}
		} catch (Exception e) {
			json.setErrorCode(ErrorCode.ERROR);
			LOG.error("Create " + order + " exception. Cause by " + e.toString());
		}
		return json;
	}

}
