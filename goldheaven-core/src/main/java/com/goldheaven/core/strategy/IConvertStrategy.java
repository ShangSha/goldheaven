/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-17 上午11:42:01 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.strategy;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(金币兑换策略接口) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-17 上午11:42:01 
 * ***************************************************************
 * </p>
 */

public interface IConvertStrategy {
	
	/**
	 * 兑换金币
	 * @param convertGoldcoin 
	 *         兑换的金币数量
	 * @return 兑换金额
	 */
	Double convert(Integer convertGoldcoin);

}
