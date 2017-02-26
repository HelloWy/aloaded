package com.pumpkin.aloaded.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.pumpkin.aloaded.dao.model.Msgboard;
import com.pumpkin.aloaded.dao.model.User;
import com.pumpkin.aloaded.service.manager.IMsgboardService;

@Controller
@RequestMapping("/uSpeak")
public class SpeakBackController {
	
	@Autowired
	IMsgboardService mService;
	
	@RequestMapping("/speak")
	public String getSpeak(){
		return "user/menu/speak";
	}
	
	@RequestMapping(value="/msgBoard")
	public String getMsgBoard(){
		return "manager/menu/system/msgBoard";
	}
	
	@RequestMapping(value="/msgBoradList")
	@ResponseBody
	public String getMsgBoradList(Msgboard msgBoard,@RequestBody ModelMap params,HttpServletRequest request){
		String result = "";
		int page = (Integer) params.get("page");
		int rows = (Integer) params.get("rows");
		User user = (User) request.getSession().getAttribute("UserSession");
		int userid = user.getId();
		
		msgBoard.setUserid(userid);
		List<Msgboard> list = mService.findMsgboard(msgBoard, page, rows);
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("pageInfo", new PageInfo<Msgboard>(list));
		
		result = JSON.toJSONString(map);
		return result;
	}
	
	@RequestMapping("/addSpeakEditor")
	public String getSpeakE(){
		return "user/menu/editor/addSpeak";
	}

	@RequestMapping("/saveSpaekInfo")
	@ResponseBody
	public String saveSpeakInfo(@RequestBody ModelMap params,HttpServletRequest request){
		String result = "";
		User user  = (User) request.getSession().getAttribute("UserSession");
		int userid = user.getId();
		String username = user.getUsername();
		String clothesname = params.get("clothesname").toString().trim();
		String size = params.get("size").toString().trim();
		String changesize = params.get("changesize").toString().trim();
		String context = params.get("context").toString().trim();
		String userphone = params.get("userphone").toString().trim();
		
		Msgboard msgboard = new Msgboard();
		msgboard.setUserid(userid);
		msgboard.setUsername(username);
		msgboard.setClothesname(clothesname);
		msgboard.setSize(size);
		msgboard.setChangesize(changesize);
		msgboard.setContext("我的被装类型是："+clothesname+",号码是："+size+"，想要调换的号码是："+changesize+",备注："+context);
		msgboard.setUserphone(userphone);
		msgboard.setIsactive("0");
		
		boolean s = mService.insertOne(msgboard);
		if (s) {
			result = "success";
		}else{
			result = "faild";
		}
		return result;
	}
	
	@RequestMapping("/allSpeak")
	public String getAllSpeak(){
		return "user/menu/allSpeak";
	}
	
	@RequestMapping(value="/allMsgBoradList")
	@ResponseBody
	public String getAllMsgBoradList(Msgboard msgBoard,@RequestBody ModelMap params,HttpServletRequest request){
		String result = "";
		int page = (Integer) params.get("page");
		int rows = (Integer) params.get("rows");
		
		List<Msgboard> list = mService.findMsgboard(msgBoard, page, rows);
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("pageInfo", new PageInfo<Msgboard>(list));
		
		result = JSON.toJSONString(map);
		return result;
	}
}
