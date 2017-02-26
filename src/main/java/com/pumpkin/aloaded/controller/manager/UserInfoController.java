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
import com.pumpkin.aloaded.dao.model.Clothes_information;
import com.pumpkin.aloaded.service.manager.IClothes_informationService;

/**
 * 一级目录用户信息管理下的业务逻辑
 * 
 * @author WyFss
 *
 */
@Controller
@RequestMapping(value = "/userInfo")
public class UserInfoController {
	@Autowired
	IClothes_informationService service;

	@RequestMapping(value = "/stu")
	public String getStu(HttpServletRequest request) {
		List<String> unit = service.findTeam();
		request.setAttribute("unit", unit);
		return "manager/menu/userInfo/student";
	}
	
	@RequestMapping(value = "/stuEditor")
	public String getStuEditor(HttpServletRequest request) {
		return "manager/menu/userInfo/studentEditor";
	}

	/**
	 * student.jsp内的分页方法
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/student")
	@ResponseBody
	public String getStudent(Clothes_information clothes, @RequestBody ModelMap params, HttpServletRequest request) {
		// String company = request.getParameter("company");
		// String sex = request.getParameter("sex");
//		String studentId = params.get("studentId").toString().trim();
		int page = (Integer) params.get("page");
		int rows = (Integer) params.get("rows");

		String company = params.get("company").toString().trim();
		String sex = params.get("sex").toString().trim();

		int i=Integer.parseInt(sex);
		System.out.println("page===" + page + "rows====" + rows +"sexid====="+i);
		// 判断sex与company是否为空，若为空，则将clothes对应的制空
		if (sex.equals("1")) {
			clothes.setSex(null);
		}
		if (company.equals("1")) {
			clothes.setTeam(null);
		}
		System.out.println(company==null);
		// 若不为空，进行相关处理
		if (!company.equals("1")) {
				clothes.setTeam(company);
		}
		if (!sex.equals("1")) {
				if (sex.equals("2")) {
					sex = "male";
				}
				if (sex.equals("3")) {
					sex = "female";
				}
				clothes.setSex(sex);
		}
//		if (studentId != null && studentId != "") {
//			try {
//				studentId = new String(studentId.getBytes("iso-8859-1"), "UTF-8");
//				clothes.setStudentId(studentId.trim());
//				clothes.setSex(null);
//				clothes.setTeam(null);
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		// 得到分页信息
		List<Clothes_information> countryList = service.findAll(clothes, page, rows);
		
		// 生成json数据
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("queryParam", clothes);
		map.put("pageInfo", new PageInfo<Clothes_information>(countryList));
		String jsonStr = JSON.toJSONString(map);
		return jsonStr;
		/*
		 * result.addObject("unit", unit); result.addObject("pageInfo", new
		 * PageInfo<Clothes_information>(countryList));
		 * result.addObject("queryParam", clothes); result.addObject("page",
		 * page); result.addObject("rows", rows); return result;
		 */
	}

	/**
	 * 根据student页面表格中修改操作传来的用户id，查询用户信息
	 * 
	 * @param params
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/stuInfo")
	@ResponseBody
	public Clothes_information getStuInfoById(@RequestParam("id") String userId) {
		Clothes_information clothes = service.findOne(userId);
		// System.out.println(result);
		return clothes;
	}

	@RequestMapping(value = "/saveInfo")
	@ResponseBody
	public String saveStuInfo(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = "";
		String id = params.get("id").toString().trim();
		String studentId = params.get("studentId").toString().trim();
		String sex = params.get("sex").toString().trim();
		String name = params.get("name").toString().trim();
		String team = params.get("team").toString().trim();
		String shengao = params.get("shengao").toString().trim();
		String xiongwei = params.get("xiongwei").toString().trim();
		String yaowei = params.get("yaowei").toString().trim();
		String jiaochang = params.get("jiaochang").toString().trim();

		Clothes_information clothes = service.findOne(id);
		clothes.setName(name);
		clothes.setSex(sex);
		clothes.setStudentId(studentId);
		clothes.setTeam(team);
		clothes.setShengao(shengao);
		clothes.setXiongwei(xiongwei);
		clothes.setYaowei(yaowei);
		clothes.setJiaochang(jiaochang);

		boolean s = service.updateOne(clothes);
		if (s) {
			result = "success";
		} else {
			result = "faild";
		}
		return result;
	}

	/**
	 * 跳转入学院信息上传页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/stuUpload")
	public String getStuUpload() {
		return "manager/menu/userInfo/stuUpload";
	}
}
