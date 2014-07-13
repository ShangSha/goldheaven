package com.goldheaven.core.util;

import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.goldheaven.core.constants.enums.ErrorCode;

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

    private Object data;

    /**
     * 默认成功
     */
    public JsonWrapper() {
    	this(ErrorCode.SUCCESS, null);
    }
    
    /**
	 * ErrorCode构造器
	 * @param code
	 * @param msg
	 * @param errorCode
	 * @param data
	 */
	public JsonWrapper(ErrorCode errorCode) {
		this(errorCode, null);
	}

	public JsonWrapper(ErrorCode errorCode, Object data) {
		this(errorCode.getErrorCode(), errorCode.getErrorMsg(), data);
	}

	/**
	 * 完全构造器
	 * @param code
	 * @param msg
	 * @param errorCode
	 * @param data
	 */
	public JsonWrapper(int code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	/**
	 * 设置errorCode
	 * @param errorCode
	 */
	public void setErrorCode(ErrorCode errorCode) {
		this.setCode(errorCode.getErrorCode());
		this.setMsg(errorCode.getErrorMsg());
	}
	
	@Override
	public String toString() {
		return "JsonWrapper [code=" + code + ", msg=" + msg + ", data=" + data + "]";
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
	 * 为null不序列化
	 * @return the data
	 */
	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
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
