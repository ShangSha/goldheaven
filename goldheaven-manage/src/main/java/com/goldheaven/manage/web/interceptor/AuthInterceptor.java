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
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(管理员登录拦截器) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 上午11:03:01 
 * ***************************************************************
 * </p>
 */

public class AuthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession(true);  

		Object obj = session.getAttribute("admin");

		if (obj == null || "".equals(obj.toString())) {  
			response.sendRedirect("/login.jsp");  
        }
		
        return true;
	}
	
	

}
