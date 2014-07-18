/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-3 下午6:24:03 
 * ***************************************************************
 * </p>
 */

package com.goldheaven.core.exception;

/**
 * 
 * <p>
 * ************************************************************** 
 * @Description: TODO(异常基类) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-18 上午11:01:59 
 * ***************************************************************
 * </p>
 */

public class BaseException extends RuntimeException {

	private static final long serialVersionUID = -3524186773265529559L;

	public BaseException() {
	}

	public BaseException(String message) {
		super(message);
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseException(Throwable cause) {
		super(cause);
	}

}
