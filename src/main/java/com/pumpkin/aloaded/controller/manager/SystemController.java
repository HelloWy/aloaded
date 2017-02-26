package com.pumpkin.aloaded.controller.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.pumpkin.aloaded.dao.model.Adminlendinformation;
import com.pumpkin.aloaded.dao.model.Msgboard;
import com.pumpkin.aloaded.dao.model.Natice;
import com.pumpkin.aloaded.service.manager.IAdminlendinformationService;
import com.pumpkin.aloaded.service.manager.IMsgboardService;
import com.pumpkin.aloaded.service.manager.INaticeService;

/**
 * 一级目录系统管理下的业务逻辑
 * 
 * @author WyFss
 *
 */
@Controller
@RequestMapping(value = "/system")
public class SystemController {

	@Autowired
	IAdminlendinformationService service;
	@Autowired
	INaticeService nService;
	@Autowired
	IMsgboardService mService;

	/**
	 * 返回个人中心页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/personal")
	public String personalCenter() {
		return "manager/menu/system/personal";
	}

	/**
	 * 得到管理员
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/adminInfo")
	@ResponseBody
	public Adminlendinformation getAdmin(@RequestParam("id") String id) {
		Adminlendinformation admin = service.findOne(id);
		return admin;
	}

	/**
	 * 根据管理员id修改管理员密码
	 * 
	 * @param params
	 * @param request
	 * @return
	 */
	@RequestMapping("/saveAdminInfo")
	@ResponseBody
	public String saveAdmin(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = "";
		String id = params.get("id").toString().trim();
		String username = params.get("username").toString().trim();
		String password = params.get("password").toString().trim();

		Adminlendinformation admin = service.findOne(id);
		admin.setUsername(username);
		admin.setPassword(password);

		boolean s = service.updateOne(admin);
		if (s) {
			result = "success";
		} else {
			result = "faild";
		}
		return result;
	}

	/**
	 * 返回notice页面，公告栏管理
	 * 
	 * @return
	 */
	@RequestMapping(value = "/notice")
	public String getNotice() {
		return "manager/menu/system/notice";
	}

	/**
	 * 返回公告栏内信息列表，实现分页
	 * 
	 * @return
	 */
	@RequestMapping(value = "/noticeList")
	@ResponseBody
	public String getNoticeList(Natice natice, @RequestBody ModelMap params, HttpServletRequest request) {
		String result = null;
		int page = (Integer) params.get("page");
		int rows = (Integer) params.get("rows");
		System.out.println(page+"    "+rows);
		List<Natice> list = nService.findNatice(natice, page, rows);

		// 生成json数据
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageInfo", new PageInfo<Natice>(list));
		result = JSON.toJSONString(map);
		System.out.println(result);
		return result;
	}
	
	/**
	 * 返回发布公告页面
	 * @return
	 */
	@RequestMapping(value="addNaticeEditor")
	public String getNaticeEditor(){
		return "manager/menu/system/editor/addNoticeEditor";
	}
	
	/**
	 * 保存发布的公告
	 * @param params
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/addNotice")
	@ResponseBody
	public String addNotice(@RequestBody ModelMap params,HttpServletRequest request){
		String result = "";
		String title = params.get("title").toString().trim();
		String context = params.get("announcement").toString().trim();
		
		Adminlendinformation admin = (Adminlendinformation) request.getSession().getAttribute("AdminSession");
		String adminName = admin.getUsername();
		Natice natice = new Natice();
		natice.setAnnouncement(context);
		natice.setTitle(title);
		natice.setCreatename(adminName);
		natice.setName("2131");
		
		boolean s = nService.insertOne(natice);
		if (s) {
			result = "success";
		}else{
			result = "faild";
		}
		
		return result;
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
		
		List<Msgboard> list = mService.findMsgboard(msgBoard, page, rows);
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("pageInfo", new PageInfo<Msgboard>(list));
		
		result = JSON.toJSONString(map);
		return result;
	}
}
