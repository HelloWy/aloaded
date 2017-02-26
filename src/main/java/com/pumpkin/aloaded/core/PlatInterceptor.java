package com.pumpkin.aloaded.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.pumpkin.aloaded.dao.model.Adminlendinformation;
import com.pumpkin.aloaded.dao.model.User;


public class PlatInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object obj) throws Exception {
		String[] noFilters = new String[] { "login.do","userRegister.do","userRegisterT.do"};
		String uri = request.getRequestURI();
		System.out.println("--->>>" + uri);
		boolean beFilter = true;
		for (String str : noFilters) {
			if (uri.indexOf(str) != -1) {
				beFilter = false;
				break;
			}
		}
		if (beFilter) {
			Adminlendinformation admin =  (Adminlendinformation) request.getSession().getAttribute(
					"AdminSession");
			User user = (User) request.getSession().getAttribute("UserSession");
			if (admin == null && user == null) {
				response.sendRedirect("http://localhost:8080/aloaded/");
				return false;
			}
		}
		return true;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object obj, ModelAndView mav)
			throws Exception {
	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj, Exception ex)
			throws Exception {
	}

}
