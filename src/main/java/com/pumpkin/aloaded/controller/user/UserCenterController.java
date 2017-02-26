package com.pumpkin.aloaded.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.pumpkin.aloaded.dao.model.Clothes_information;
import com.pumpkin.aloaded.service.manager.IClothes_informationService;

@Controller
@RequestMapping("/uCenter")
public class UserCenterController {
	@Autowired
	IClothes_informationService service;
	
	@RequestMapping("/center")
	public String personalCenter() {
		return "user/menu/userCenter";
	}

	/**
	 * 得到用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/userInfo")
	@ResponseBody
	public Clothes_information getAdmin(@RequestParam("id") String id) {
		Clothes_information clothes_information = new Clothes_information();
		clothes_information = service.findAll(clothes_information, 1, 1).get(0);
		return clothes_information;
	}
	
	/**
	 * 根据管理员id修改管理员密码
	 * 
	 * @param params
	 * @param request
	 * @return
	 */
	@RequestMapping("/saveUserInfo")
	@ResponseBody
	public String saveAdmin(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = "";
		String id = params.get("id").toString().trim();

		Clothes_information cInformation = service.findOne(id);

		boolean s = service.updateOne(cInformation);
		if (s) {
			result = "success";
		} else {
			result = "faild";
		}
		return result;
	}
}
