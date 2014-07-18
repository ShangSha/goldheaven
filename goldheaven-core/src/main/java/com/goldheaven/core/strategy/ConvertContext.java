/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-17 下午12:07:57 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.strategy;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(兑换策略环境对象) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-17 下午12:07:57 
 * ***************************************************************
 * </p>
 */

public class ConvertContext {
	
	private IConvertStrategy convertStrategy;
	
	public ConvertContext(IConvertStrategy convertStrategy) {
		this.convertStrategy = convertStrategy;
	}
	
	public Double convert(Integer convertGoldcoin){  
        return convertStrategy.convert(convertGoldcoin);
    }
}
