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
import com.pumpkin.aloaded.dao.model.Message;
import com.pumpkin.aloaded.service.manager.IMessageService;

/**
 * 一级目录消息管理下的业务逻辑
 * @author WyFss
 *
 */
@Controller
@RequestMapping(value="/msg")
public class MessageContorller {

	@Autowired
	IMessageService service;
	/**
	 * 返回未处理页面
	 * @return
	 */
	@RequestMapping(value="/unDispost")
	public String getUnRead(){
		return "manager/menu/msgManage/unDispost";
	}
	
	/**
	 * 返回管理员回复页面
	 * @return
	 */
	@RequestMapping(value="/msgReplyEditor")
	public String getMsgReplyEditor(){
		return "manager/menu/msgManage/editor/saveReplyEditor";
	}
	/**
	 * 返回已处理页面
	 * @return
	 */
	@RequestMapping(value="/processed")
	public String getProcessed(){
		return "manager/menu/msgManage/processed";
	}
	/**
	 * 展示未处理信息
	 * @return
	 */
	@RequestMapping(value="/unDispostList")
	@ResponseBody
	public String getUnReadList(Message message,@RequestBody ModelMap params){
		String result = null;
		int page = (Integer) params.get("page");
		int rows = (Integer) params.get("rows");
		message.setIsdo("0");
		//得到分页信息
		List<Message> messagesList = service.findAll(message,page, rows);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageInfo", new PageInfo<Message>(messagesList));
		result = JSON.toJSONString(map);
		return result;
	}
	/**
	 * 根据消息id查询当前消息
	 * @param msgId
	 * @return
	 */
	@RequestMapping(value="/msgReply")
	@ResponseBody
	public Message getMsgById(@RequestParam("id") String msgId){
		Message message = service.findOne(msgId);
		return message;
	}
	/**
	 * 保存回复消息
	 * @param params
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/saveMsg")
	@ResponseBody
	public String saveMsg(@RequestBody ModelMap params,HttpServletRequest request){
		String result = null;
		Adminlendinformation admin = (Adminlendinformation) request.getSession().getAttribute("AdminSession");
		String userId = params.get("id").toString().trim();
		int adminId = admin.getId();
		String adminName = admin.getUsername();
		String replyContext = params.get("replycontext").toString().trim();
		
		Message message = service.findOne(userId);
		//设置message中的属性
		message.setAdminid(adminId);
		message.setAdminname(adminName);
		message.setReplycontext(replyContext);
		message.setIsdo("1");
		boolean s = service.adminUpdateOne(message);
		if (s) {
			result = "success";
		}else{
			result = "faild";
		}
		return result;
	}
	
	/**
	 * 返回已处理消息页面
	 * @param message
	 * @param params
	 * @return
	 */
	@RequestMapping(value="/processedList")
	@ResponseBody
	public String getProcessedList(Message message,@RequestBody ModelMap params){
		String result = null;
		int page = (Integer) params.get("page");
		int rows = (Integer) params.get("rows");
		message.setIsdo("1");
		//得到分页信息
		List<Message> messagesList = service.findAll(message,page, rows);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageInfo", new PageInfo<Message>(messagesList));
		result = JSON.toJSONString(map);
		return result;
	}
}
