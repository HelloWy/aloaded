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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.pumpkin.aloaded.dao.model.Natice;
import com.pumpkin.aloaded.service.manager.INaticeService;

@Controller
@RequestMapping("/uNotice")
public class NoticeController {

	@Autowired
	INaticeService nService;
	
	@RequestMapping("/notice")
	public String getNotice(HttpServletRequest request){
		Natice naticeOne  = new Natice();
		List<Natice> list = nService.findAll();
		int i = list.size()-1;
		if(i < 0){
			naticeOne = list.get(0);
		}else{
			naticeOne = list.get(i);
		}
		request.setAttribute("natice", naticeOne);
		return "user/menu/notice";
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
	@RequestMapping(value="naticeEditor")
	public String getNaticeEditor(){
		return "user/menu/editor/noticeEditor";
	}
	
	@RequestMapping(value="/noticInfo")
	@ResponseBody
	public Natice getNaticeInfo(@RequestParam("id") String id){
		Natice natice = nService.findOne(id);
		return natice;
	}
}
