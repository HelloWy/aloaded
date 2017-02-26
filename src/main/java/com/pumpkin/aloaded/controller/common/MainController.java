package com.pumpkin.aloaded.controller.common;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pumpkin.aloaded.dao.model.Adminlendinformation;
import com.pumpkin.aloaded.dao.model.User;

@Controller
public class MainController {

	/**
	 * 管理员主页
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/main")
	public String getIndex(HttpSession session){
		Adminlendinformation admin = (Adminlendinformation) session.getAttribute("AdminSession");
		if(admin != null){
		}
		return "manager/main";
	}
	
	/**
	 * 用户主页
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/uMain")
	public String getuIndex(HttpSession session){
		User user = (User) session.getAttribute("UserSession");
		if(user != null){
		}
		return "user/main";
	}
}
