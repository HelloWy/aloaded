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
import com.pumpkin.aloaded.dao.model.Femaledayi;
import com.pumpkin.aloaded.dao.model.Femaleshangyi;
import com.pumpkin.aloaded.dao.model.Femalexiaku;
import com.pumpkin.aloaded.dao.model.Hat;
import com.pumpkin.aloaded.dao.model.Maledayi;
import com.pumpkin.aloaded.dao.model.Maleshangyi;
import com.pumpkin.aloaded.dao.model.Malexiaku;
import com.pumpkin.aloaded.dao.model.Message;
import com.pumpkin.aloaded.dao.model.User;
import com.pumpkin.aloaded.dao.model.Xiezi;
import com.pumpkin.aloaded.service.manager.IFemaledayiService;
import com.pumpkin.aloaded.service.manager.IFemaleshangyiService;
import com.pumpkin.aloaded.service.manager.IFemalexiakuService;
import com.pumpkin.aloaded.service.manager.IHatService;
import com.pumpkin.aloaded.service.manager.IMaledayiService;
import com.pumpkin.aloaded.service.manager.IMaleshangyiService;
import com.pumpkin.aloaded.service.manager.IMalexiakuService;
import com.pumpkin.aloaded.service.manager.IMessageService;
import com.pumpkin.aloaded.service.manager.IXieziService;

@Controller
@RequestMapping(value = "/uMsgBoard")
public class MsgBoardController {
	@Autowired
	IMessageService service;
	@Autowired
	IFemaledayiService fdayiService; // 女大衣
	@Autowired
	IFemaleshangyiService fshangyiService; // 女上衣
	@Autowired
	IFemalexiakuService fxiakuService; // 女下裤
	@Autowired
	IMaledayiService mdayiService; // 男大衣
	@Autowired
	IMaleshangyiService mshangyiService; // 男上衣
	@Autowired
	IMalexiakuService mxiakuService; // 男下裤
	@Autowired
	IHatService hatService; // 帽子
	@Autowired
	IXieziService xieziService; // 鞋子

	@RequestMapping(value = "/msg")
	public String getMsg() {
		return "user/menu/msgBoard";
	}

	/**
	 * 展示用户发送信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/msgList")
	@ResponseBody
	public String getUnReadList(Message message, @RequestBody ModelMap params, HttpServletRequest request) {
		String result = null;
		int page = (Integer) params.get("page");
		int rows = (Integer) params.get("rows");
		User user = (User) request.getSession().getAttribute("UserSession");
		int userid = user.getId();
		message.setUserid(userid);
		// 得到分页信息
		List<Message> messagesList = service.findAll(message, page, rows);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageInfo", new PageInfo<Message>(messagesList));
		result = JSON.toJSONString(map);
		return result;
	}

	@RequestMapping(value = "addMsgEditor")
	public String getNaticeEditor() {
		return "user/menu/editor/addMsgEditor";
	}

	@RequestMapping(value = "/getPinming")
	@ResponseBody
	public String getPinming(@RequestBody ModelMap params) {
		String result = "";
		String sex = params.get("sex").toString().trim();
		String clothesType = params.get("clothestype").toString().trim();
		int typeId = Integer.parseInt(clothesType);
		System.out.println("sex:" + sex + ",clothesType:" + clothesType);

		if (sex.equals("1")) {
			switch (typeId) {
			// 帽子
			case 1:
				List<Hat> hats = hatService.findAll();
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("queryParam", hats);
				result = JSON.toJSONString(map);
				break;
			// 上衣
			case 2:
				List<Maleshangyi> mshangyilist = mshangyiService.findAll();
				Map<String, Object> mshangyimap = new HashMap<String, Object>();
				mshangyimap.put("queryParam", mshangyilist);
				result = JSON.toJSONString(mshangyimap);
				break;
			// 下裤
			case 3:
				List<Malexiaku> mxiakulist = mxiakuService.findAll();
				Map<String, Object> mxiakumap = new HashMap<String, Object>();
				mxiakumap.put("queryParam", mxiakulist);
				result = JSON.toJSONString(mxiakumap);
				break;
			// 大衣
			case 4:
				List<Maledayi> mdayilist = mdayiService.findAll();
				Map<String, Object> mdayimap = new HashMap<String, Object>();
				mdayimap.put("queryParam", mdayilist);
				result = JSON.toJSONString(mdayimap);
				break;
			// 鞋子
			case 5:
				List<Xiezi> xiezilist = xieziService.findAll();
				Map<String, Object> xiezimap = new HashMap<String, Object>();
				xiezimap.put("queryParam", xiezilist);
				result = JSON.toJSONString(xiezimap);
				break;
			// 杂物
			case 6:
				break;
			// 配饰
			case 7:
				break;
			default:
				break;
			}
		}
		if (sex.equals("2")) {
			switch (typeId) {
			// 帽子
			case 1:
				List<Hat> hats = hatService.findAll();
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("queryParam", hats);
				result = JSON.toJSONString(map);
				break;
			// 上衣
			case 2:
				List<Femaleshangyi> fshangyilist = fshangyiService.findAll();
				Map<String, Object> fshangyimap = new HashMap<String, Object>();
				fshangyimap.put("queryParam", fshangyilist);
				result = JSON.toJSONString(fshangyimap);
				break;
			// 下裤
			case 3:
				List<Femalexiaku> fxiakulist = fxiakuService.findAll();
				Map<String, Object> fxiakumap = new HashMap<String, Object>();
				fxiakumap.put("queryParam", fxiakulist);
				result = JSON.toJSONString(fxiakumap);
				break;
			// 大衣
			case 4:
				List<Femaledayi> fdayilist = fdayiService.findAll();
				Map<String, Object> fdayimap = new HashMap<String, Object>();
				fdayimap.put("queryParam", fdayilist);
				result = JSON.toJSONString(fdayimap);
				break;
			// 鞋子
			case 5:
				List<Xiezi> xiezilist = xieziService.findAll();
				Map<String, Object> xiezimap = new HashMap<String, Object>();
				xiezimap.put("queryParam", xiezilist);
				result = JSON.toJSONString(xiezimap);
				break;
			// 杂物
			case 6:

				break;
			// 配饰
			case 7:

				break;

			default:
				break;
			}
		}

		return result;
	}

	@RequestMapping(value = "/addMsg")
	@ResponseBody
	public String saveMsg(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = null;
		User user = (User) request.getSession().getAttribute("UserSession");
		int userId = user.getId();
		String username = user.getUsername();
		String clothesname = params.get("clothesname").toString().trim();
		String size = params.get("size").toString().trim();
		String changesize = params.get("changesize").toString().trim();
		String context = params.get("context").toString().trim();
		String userphone = params.get("userphone").toString().trim();
		System.out.println(clothesname+";"+size);

		Message message = new Message();
		// 设置message中的属性
		message.setUserid(userId);
		message.setUsername(username);
		message.setClothesname(clothesname);
		message.setChangesize(changesize);
		message.setSize(size);
		message.setContext("我的被装类型是：" + clothesname + ",号码是：" + size + "，想要调换的号码是：" + changesize + ",备注：" + context);
		message.setUserphone(userphone);
		message.setIsdo("0");
		boolean s = service.userInsertOne(message);
		if (s) {
			result = "success";
		} else {
			result = "faild";
		}
		return result;
	}

	@RequestMapping("/msgInfoEditor")
	public String getMsgInfoE() {
		return "user/menu/editor/msgInfoEditor";
	}

	/**
	 * 根据消息id查询当前消息
	 * 
	 * @param msgId
	 * @return
	 */
	@RequestMapping(value = "/msgReply")
	@ResponseBody
	public Message getMsgById(@RequestParam("id") String msgId) {
		Message message = service.findOne(msgId);
		String i = message.getIsdo();
		if (i.equals("0")) {
			message.setIsdo("未回复");
		} else {
			message.setIsdo("已回复");
		}
		return message;
	}

}
