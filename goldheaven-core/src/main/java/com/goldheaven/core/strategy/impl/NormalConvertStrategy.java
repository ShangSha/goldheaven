/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-17 上午11:52:07 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.strategy.impl;

import com.goldheaven.core.strategy.IConvertStrategy;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(普通的兑换策略  / 100金币=1元人民币) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-17 上午11:52:07 
 * ***************************************************************
 * </p>
 */

public class NormalConvertStrategy implements IConvertStrategy {

	@Override
	public Double convert(Integer convertGoldcoin) {
		
		if(convertGoldcoin == null || convertGoldcoin < 100) {
			 throw new IllegalArgumentException(  
	                 "The convertGoldcoin must be a number and bigger than one hundred.");
		}
		
		return convertGoldcoin / 100.0;
	}

}
