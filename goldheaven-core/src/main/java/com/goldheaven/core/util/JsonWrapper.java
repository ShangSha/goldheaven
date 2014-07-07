package com.goldheaven.core.util;

import java.io.Serializable;

/**
 * 
 * <p>
 * ************************************************************** 
 * @Description: TODO(JSON统一输出格式) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-6-18 上午10:00:39 
 * ***************************************************************
 * </p>
 */
public class JsonWrapper implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public final static int SUCCESS = 0;
    public final static int ERROR = -1;

    private int code;
    private String msg;
    private String errorCode;

    private Object data;

    public JsonWrapper() {
    	this(SUCCESS, "SUCCESS");
    }
    
	public JsonWrapper(int code, String msg) {
		this(code, msg, null, null);
	}

	/**
	 * 完全构造器
	 * @param code
	 * @param msg
	 * @param errorCode
	 * @param data
	 */
	public JsonWrapper(int code, String msg, String errorCode, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.errorCode = errorCode;
		this.data = data;
	}

	@Override
	public String toString() {
		return "JsonWrapper [code=" + code + ", msg=" + msg + ", errorCode="
				+ errorCode + ", data=" + data + "]";
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
}
