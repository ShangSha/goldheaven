package com.goldheaven.core.util;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONPObject;

/**
 * 
 * <p>
 * ************************************************************** 
 * @Description: TODO(JSON转换工具类) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-6-18 上午10:00:39 
 * ***************************************************************
 * </p>
 */
public class JsonUtil {
	
	private static final Logger LOG = Logger.getLogger(JsonUtil.class);

	private static ObjectMapper om = null;
	
	static{
		om = new ObjectMapper();
	}
	
	/**
	 * Json转对象 (若JSON为Null或"null"字符串, 返回Null;若JSON字符串为"[]", 返回空集合)
	 */
	public static <T> T fromJson(String jsonString, Class<T> clazz) {
		
		if (StringUtils.isEmpty(jsonString)) {
			return null;
		}

		try {
			return om.readValue(jsonString, clazz);
		} catch (IOException e) {
			LOG.warn("Parse json to Object error:" + jsonString, e);
			return null;
		}
	}
	
	/**
	 * 对象转Json(对象为null, 返回"null".集合为空，返回"[]")
	 */
	public static String toJson(Object object) {

		try {
			return om.writeValueAsString(object);
		} catch (IOException e) {
			LOG.warn("pase object to json error:" + object, e);
			return null;
		}
	}

	/**
	 * 输出JSONP格式
	 */
	public static String toJsonP(String functionName, Object object) {
		return toJson(new JSONPObject(functionName, object));
	}
	
}
