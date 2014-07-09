/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 上午11:03:01 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.manage.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(管理员登录拦截器) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 上午11:03:01 
 * ***************************************************************
 * </p>
 */

public class AuthInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, 
			Object handler, ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, 
			HttpServletResponse response, Object handler, Exception ex) throws Exception {
		
	}

}
