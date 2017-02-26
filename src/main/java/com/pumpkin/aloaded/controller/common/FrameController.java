package com.pumpkin.aloaded.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/frame")
public class FrameController {

	/**
	 * 管理员主页头部
	 * @return
	 */
	@RequestMapping(value = "/top")
	public String getTop(){
		return "manager/frame/top";
	}
	/**
	 * 管理员主页左侧导航
	 * @return
	 */
	@RequestMapping(value = "/left")
	public String getLeft(){
		return "manager/frame/left";
	}
	
	/**
	 * 用户主页头部
	 * @return
	 */
	@RequestMapping(value = "/utop")
	public String getUserTop(){
		return "user/frame/top";
	}
	/**
	 * 用户主页左侧导航
	 * @return
	 */
	@RequestMapping(value = "/uleft")
	public String getUserLeft(){
		return "user/frame/left";
	}
}
