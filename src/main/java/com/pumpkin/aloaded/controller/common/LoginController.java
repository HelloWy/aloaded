package com.pumpkin.aloaded.controller.common;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pumpkin.aloaded.dao.model.Adminlendinformation;
import com.pumpkin.aloaded.dao.model.Clothes_information;
import com.pumpkin.aloaded.dao.model.User;
import com.pumpkin.aloaded.service.manager.IAdminlendinformationService;
import com.pumpkin.aloaded.service.manager.IClothes_informationService;
import com.pumpkin.aloaded.service.manager.IUserService;

@Controller
public class LoginController {
	@Autowired
	IAdminlendinformationService service;
	@Autowired
	IUserService uService;
	@Autowired
	IClothes_informationService cService;

	/**
	 * 登陆
	 * 
	 * @param params
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/login")
	@ResponseBody
	public String adminLogin(@RequestBody ModelMap params, HttpSession session) {
		String result = "";

		String username = params.get("username").toString().trim();
		String password = params.get("password").toString().trim();
		String typeS = params.get("type").toString().trim();
		int type = Integer.parseInt(typeS);
		System.out.println("name:==" + username + "==pass:==" + password);
		// 根据前台传入的type来判断是用户登录还是管理员登陆
		switch (type) {
		case 1:
			Adminlendinformation admin = new Adminlendinformation();
			admin.setUsername(username);
			List<Adminlendinformation> list = service.findAdminlendinformation(admin, 1, 1);

			if (list.size() == 0) {
				result = "null"; // 用户账户不正确
			} else {
				admin = list.get(0);
				String realpass = admin.getPassword();
				if (realpass.equals(password)) {
					result = "success";
					session.setAttribute("AdminSession", admin);
				} else {
					result = "fail"; // 用户密码不正确
				}
			}
			break;
		case 0:
			User user = new User();
			user.setUsername(username);
			List<User> ulist = uService.findUser(user, 1, 1);

			if (ulist.size() == 0) {
				result = "null"; // 用户账户不正确
			} else {
				user = ulist.get(0);
				String realpass = user.getPassword();
				if (realpass.equals(password)) {
					result = "success";
					session.setAttribute("UserSession", user);
				} else {
					result = "fail"; // 用户密码不正确
				}
			}
			break;
		default:
			break;
		}

		System.out.println(result);
		return result;
	}

	/**
	 * 管理员退出登录
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/logout")
	public String loadLogout(HttpSession session) {
		session.removeAttribute("AdminSession");
		session.removeAttribute("UserSession");
		return "redirect:/";
	}

	@RequestMapping("/userRegisterT")
	public String getRegister() {
		return "user/register";
	}

	@RequestMapping("/userRegister")
	@ResponseBody
	public String userRegister(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = "";
		String username = params.get("username").toString().trim();
		String identyid = params.get("identyid").toString().trim();
		String password = params.get("password").toString().trim();

		Clothes_information clothes_information = new Clothes_information();
		clothes_information.setIdentityId(identyid);

		List<Clothes_information> list = cService.findAll(clothes_information, 1, 1);
		User userT = new User();
		userT.setIdentyid(identyid);
		List<User> uList = uService.findUser(userT, 1, 1);
		System.out.println(uList.size() == 0);
		if (list != null && uList.size() == 0) {
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				user.setIdentyid(identyid);
				user.setIsaccess(0);
				boolean s = uService.insertOne(user);
				System.out.println(s);
				if (s) {
					result = "success";
				} else {
					result = "faild";
				}
			} else {
				result = "faild";
			}
		return result;
	}
}
