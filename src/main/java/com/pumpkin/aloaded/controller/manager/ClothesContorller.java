package com.pumpkin.aloaded.controller.manager;

import java.io.UnsupportedEncodingException;
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
import com.pumpkin.aloaded.dao.model.LoadedType;
import com.pumpkin.aloaded.dao.model.Maledayi;
import com.pumpkin.aloaded.dao.model.Maleshangyi;
import com.pumpkin.aloaded.dao.model.Malexiaku;
import com.pumpkin.aloaded.dao.model.Xiezi;
import com.pumpkin.aloaded.service.manager.IFemaledayiService;
import com.pumpkin.aloaded.service.manager.IFemaleshangyiService;
import com.pumpkin.aloaded.service.manager.IFemalexiakuService;
import com.pumpkin.aloaded.service.manager.IHatService;
import com.pumpkin.aloaded.service.manager.ILoadedTypeService;
import com.pumpkin.aloaded.service.manager.IMaledayiService;
import com.pumpkin.aloaded.service.manager.IMaleshangyiService;
import com.pumpkin.aloaded.service.manager.IMalexiakuService;
import com.pumpkin.aloaded.service.manager.IXieziService;

/**
 * 一级目录被装信息管理下的业务逻辑
 * @author WyFss
 *
 */
@Controller
@RequestMapping(value = "/clothesInfo")
public class ClothesContorller {

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
	@Autowired
	ILoadedTypeService loadedTypeService;	//被装类型服务

	/**
	 * 渲染stokInfo.jsp
	 * 
	 * @return
	 */
	@RequestMapping(value = "/stok")
	public String getStok() {
		return "manager/menu/clothesInfo/stokInfo";
	}

	/**
	 * 返回弹窗服装详情页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/stokEditor")
	public String getStokEditor(HttpServletRequest request) {
		String result = "";
		String sex = request.getParameter("sex");
		String type = request.getParameter("clothestype");
		try {
			sex = new String(sex.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		 int typeId = Integer.parseInt(type);
		System.out.println("性别：" + sex + "服装类型：" + typeId);
		if (sex.equals("男")) {
			switch (typeId) {
			// 帽子
			case 1:
				result = "manager/menu/clothesInfo/editor/maoziEditor";
				break;
			// 上衣
			case 2:
				result = "manager/menu/clothesInfo/editor/mshangyiEditor";
				break;
			// 下裤
			case 3:
				result = "manager/menu/clothesInfo/editor/mxiakuEditor";
				break;
			// 大衣
			case 4:
				result = "manager/menu/clothesInfo/editor/mdayiEditor";
				break;
			// 鞋子
			case 5:
				result = "manager/menu/clothesInfo/editor/xieziEditor";
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
		if (sex.equals("女")) {
			switch (typeId) {
			// 帽子
			case 1:
				result = "manager/menu/clothesInfo/editor/maoziEditor";
				break;
			// 上衣
			case 2:
				result = "manager/menu/clothesInfo/editor/fshangyiEditor";
				break;
			// 下裤
			case 3:
				result = "manager/menu/clothesInfo/editor/fxiakuEditor";
				break;
			// 大衣
			case 4:
				result = "manager/menu/clothesInfo/editor/fdayiEditor";
				break;
			// 鞋子
			case 5:
				result = "manager/menu/clothesInfo/editor/xieziEditor";
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

	@RequestMapping(value = "/stokInfo")
	@ResponseBody
	public String getStokData(@RequestBody ModelMap params) {
		String result = "";
		int page = (Integer) params.get("page");
		int rows = (Integer) params.get("rows");
		String sex = params.get("sex").toString().trim();
		String type = params.get("clothestype").toString().trim();
		int typeId = Integer.parseInt(type);
		System.out.println("=page:"+page+"=rows:"+rows+"=sex:"+sex+"=type:"+typeId);
		if (sex.equals("男")) {
			switch (typeId) {
			// 帽子
			case 1:
				Hat hat = new Hat();
				List<Hat> hats = hatService.findHat(hat, page, rows);
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("queryParam", hat);
				map.put("pageInfo", new PageInfo<Hat>(hats));
				result = JSON.toJSONString(map);
				break;
			// 上衣
			case 2:
				Maleshangyi maleshangyi = new Maleshangyi();
				List<Maleshangyi> mshangyilist = mshangyiService.findMaleshangyi(maleshangyi, page, rows);
				Map<String, Object> mshangyimap = new HashMap<String, Object>();
				mshangyimap.put("queryParam", maleshangyi);
				mshangyimap.put("pageInfo", new PageInfo<Maleshangyi>(mshangyilist));
				result = JSON.toJSONString(mshangyimap);
				break;
			// 下裤
			case 3:
				Malexiaku mxiaku = new Malexiaku();
				List<Malexiaku> mxiakulist = mxiakuService.findMalexiaku(mxiaku, page, rows);
				Map<String, Object> mxiakumap = new HashMap<String, Object>();
				mxiakumap.put("queryParam", mxiaku);
				mxiakumap.put("pageInfo", new PageInfo<Malexiaku>(mxiakulist));
				result = JSON.toJSONString(mxiakumap);
				break;
			// 大衣
			case 4:
				Maledayi mdayi = new Maledayi();
				List<Maledayi> mdayilist = mdayiService.findMaledayi(mdayi, page, rows);
				Map<String, Object> mdayimap = new HashMap<String, Object>();
				mdayimap.put("queryParam", mdayi);
				mdayimap.put("pageInfo", new PageInfo<Maledayi>(mdayilist));
				result = JSON.toJSONString(mdayimap);
				break;
			// 鞋子
			case 5:
				Xiezi xiezi = new Xiezi();
				List<Xiezi> xiezilist = xieziService.findXiezi(xiezi, page, rows);
				Map<String, Object> xiezimap = new HashMap<String, Object>();
				xiezimap.put("queryParam", xiezi);
				xiezimap.put("pageInfo", new PageInfo<Xiezi>(xiezilist));
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
		if (sex.equals("女")) {
			switch (typeId) {
			// 帽子
			case 1:
				Hat hat = new Hat();
				List<Hat> hats = hatService.findHat(hat, page, rows);
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("queryParam", hat);
				map.put("pageInfo", new PageInfo<Hat>(hats));
				result = JSON.toJSONString(map);
				break;
			// 上衣
			case 2:
				Femaleshangyi fshangyi = new Femaleshangyi();
				List<Femaleshangyi> fshangyilist = fshangyiService.findFemaleshangyi(fshangyi, page, rows);
				Map<String, Object> fshangyimap = new HashMap<String, Object>();
				fshangyimap.put("queryParam", fshangyi);
				fshangyimap.put("pageInfo", new PageInfo<Femaleshangyi>(fshangyilist));
				result = JSON.toJSONString(fshangyimap);
				break;
			// 下裤
			case 3:
				Femalexiaku fxiaku = new Femalexiaku();
				List<Femalexiaku> fxiakulist = fxiakuService.findFemalexiaku(fxiaku, page, rows);
				Map<String, Object> fxiakumap = new HashMap<String, Object>();
				fxiakumap.put("queryParam", fxiaku);
				fxiakumap.put("pageInfo", new PageInfo<Femalexiaku>(fxiakulist));
				result = JSON.toJSONString(fxiakumap);
				break;
			// 大衣
			case 4:
				Femaledayi fdayi = new Femaledayi();
				List<Femaledayi> fdayilist = fdayiService.findFemaledayi(fdayi, page, rows);
				Map<String, Object> fdayimap = new HashMap<String, Object>();
				fdayimap.put("queryParam", fdayi);
				fdayimap.put("pageInfo", new PageInfo<Femaledayi>(fdayilist));
				result = JSON.toJSONString(fdayimap);
				break;
			// 鞋子
			case 5:
				Xiezi xiezi = new Xiezi();
				List<Xiezi> xiezilist = xieziService.findXiezi(xiezi, page, rows);
				Map<String, Object> xiezimap = new HashMap<String, Object>();
				xiezimap.put("queryParam", xiezi);
				xiezimap.put("pageInfo", new PageInfo<Xiezi>(xiezilist));
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
	
	@RequestMapping(value="/hatInfo")
	@ResponseBody
	public Hat getHatClass(@RequestParam("id") String id){
		Hat hat = hatService.findOne(id);
		// System.out.println(result);
		return hat;
	}

	@RequestMapping(value="/xieziInfo")
	@ResponseBody
	public Xiezi getXieziClass(@RequestParam("id") String id){
		Xiezi xiezi = xieziService.findOne(id);
		// System.out.println(result);
		return xiezi;
	}
	
	@RequestMapping(value="/mdayiInfo")
	@ResponseBody
	public Maledayi getMaledayiClass(@RequestParam("id") String id){
		Maledayi maledayi = mdayiService.findOne(id);
		// System.out.println(result);
		return maledayi;
	}
	
	@RequestMapping(value="/mshangyiInfo")
	@ResponseBody
	public Maleshangyi getMaleshangyiClass(@RequestParam("id") String id){
		Maleshangyi maleshangyi = mshangyiService.findOne(id);
		// System.out.println(result);
		return maleshangyi;
	}
	
	@RequestMapping(value="/mxiakuInfo")
	@ResponseBody
	public Malexiaku getMalexiakuClass(@RequestParam("id") String id){
		Malexiaku malexiaku = mxiakuService.findOne(id);
		// System.out.println(result);
		return malexiaku;
	}
	
	@RequestMapping(value="/fdayiInfo")
	@ResponseBody
	public Femaledayi getFemaledayiClass(@RequestParam("id") String id){
		Femaledayi femaledayi = fdayiService.findOne(id);
		// System.out.println(result);
		return femaledayi;
	}
	
	@RequestMapping(value="/fshangyiInfo")
	@ResponseBody
	public Femaleshangyi getFemaleshangyiClass(@RequestParam("id") String id){
		Femaleshangyi fshangyi = fshangyiService.findOne(id);
		// System.out.println(result);
		return fshangyi;
	}
	
	@RequestMapping(value="/fxiakuInfo")
	@ResponseBody
	public Femalexiaku getFemalexiakuClass(@RequestParam("id") String id){
		Femalexiaku fxiaku = fxiakuService.findOne(id);
		// System.out.println(result);
		return fxiaku;
	}
	
	@RequestMapping(value = "/savehatInfo")
	@ResponseBody
	public String savehatInfo(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = "";
		String idS = params.get("id").toString().trim();
		String clothesname = params.get("clothesname").toString().trim();
		String a53Str = params.get("a53").toString().trim();
		String a54Str = params.get("a54").toString().trim();
		String a55Str = params.get("a55").toString().trim();
		String a56Str = params.get("a56").toString().trim();
		String a57Str = params.get("a57").toString().trim();
		String a58Str = params.get("a58").toString().trim();
		String a59Str = params.get("a59").toString().trim();
		String a60Str = params.get("a60").toString().trim();
		
		int id = Integer.parseInt(idS);
		int a53 = Integer.parseInt(a53Str);
		int a54 = Integer.parseInt(a54Str);
		int a55 = Integer.parseInt(a55Str);
		int a56 = Integer.parseInt(a56Str);
		int a57 = Integer.parseInt(a57Str);
		int a58 = Integer.parseInt(a58Str);
		int a59 = Integer.parseInt(a59Str);
		int a60= Integer.parseInt(a60Str);
		
		Hat item = new Hat();

		item = new Hat(id, clothesname, a53, a54, a55, a56, a57, a58, a59, a60);
		
		boolean s = hatService.updateOne(item);
		if (s) {
			result = "success";
		} else {
			result = "faild";
		}
		return result;
	}
	
	@RequestMapping(value = "/savemdayiInfo")
	@ResponseBody
	public String savemdayiInfo(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = "";
		String idS = params.get("id").toString().trim();
		String clothesname = params.get("clothesname").toString().trim();
		String a185b104c108Str = params.get("a185b104c108").toString().trim();
		String a185b100Str = params.get("a185b100").toString().trim();
		String a185b92c96Str = params.get("a185b92c96").toString().trim();
		String a180b104c108Str = params.get("a180b104c108").toString().trim();
		String a180b100Str = params.get("a180b100").toString().trim();
		String a180b92c96Str = params.get("a180b92c96").toString().trim();
		String a175b104c108Str = params.get("a175b104c108").toString().trim();
		String a175b100Str = params.get("a175b100").toString().trim();
		String a175b92c96Str = params.get("a175b92c96").toString().trim();
		String a175b88Str = params.get("a175b88").toString().trim();
		String a170b104c108Str = params.get("a170b104c108").toString().trim();
		String a170b100Str = params.get("a170b100").toString().trim();
		String a170b92c96Str = params.get("a170b92c96").toString().trim();
		String a170b88Str = params.get("a170b88").toString().trim();
		String a165b100Str = params.get("a165b100").toString().trim();
		String a165b92c96Str = params.get("a165b92c96").toString().trim();
		String a165b84c88Str = params.get("a165b84c88").toString().trim();
		
		int id = Integer.parseInt(idS);
		int a185b104c108 = Integer.parseInt(a185b104c108Str);
		int a185b100 = Integer.parseInt(a185b100Str);
		int a185b92c96 = Integer.parseInt(a185b92c96Str);
		int a180b104c108 = Integer.parseInt(a180b104c108Str);
		int a180b100 = Integer.parseInt(a180b100Str);
		int a180b92c96 = Integer.parseInt(a180b92c96Str);
		int a175b104c108 = Integer.parseInt(a175b104c108Str);
		int a175b100 = Integer.parseInt(a175b100Str);
		int a175b92c96 = Integer.parseInt(a175b92c96Str);
		int a175b88 = Integer.parseInt(a175b88Str);
		int a170b104c108 = Integer.parseInt(a170b104c108Str);
		int a170b100 = Integer.parseInt(a170b100Str);
		int a170b92c96 = Integer.parseInt(a170b92c96Str);
		int a170b88 = Integer.parseInt(a170b88Str);
		int a165b100 = Integer.parseInt(a165b100Str);
		int a165b92c96 = Integer.parseInt(a165b92c96Str);
		int a165b84c88 = Integer.parseInt(a165b84c88Str);
		
		Maledayi item = new Maledayi(id, clothesname, a185b104c108, a185b100, a185b92c96, a180b104c108, a180b100, a180b92c96, a175b104c108, a175b100, a175b92c96, a175b88, a170b104c108, a170b100, a170b92c96, a170b88, a165b100, a165b92c96, a165b84c88);

		boolean s = mdayiService.updateOne(item);
		if (s) {
			result = "success";
		} else {
			result = "faild";
		}
		return result;
	}
	
	@RequestMapping(value = "/savemshangyiInfo")
	@ResponseBody
	public String savemshangyiInfo(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = "";
		String idS = params.get("id").toString().trim();
		String clothesname = params.get("clothesname").toString().trim();
		String a185b104Str = params.get("a185b104").toString().trim();
		String a185b100Str = params.get("a185b100").toString().trim();
		String a185b96Str = params.get("a185b96").toString().trim();
		String a180b108Str = params.get("a180b108").toString().trim();
		String a180b104Str = params.get("a180b104").toString().trim();
		String a180b100Str = params.get("a180b100").toString().trim();
		String a180b96Str = params.get("a180b96").toString().trim();
		String a180b92Str = params.get("a180b92").toString().trim();
		String a175b108Str = params.get("a175b108").toString().trim();
		String a175b104Str = params.get("a175b104").toString().trim();
		String a175b100Str = params.get("a175b100").toString().trim();
		String a175b96Str = params.get("a175b96").toString().trim();
		String a175b92Str = params.get("a175b92").toString().trim();
		String a170b108Str = params.get("a170b108").toString().trim();
		String a170b104Str = params.get("a170b104").toString().trim();
		String a170b100Str = params.get("a170b100").toString().trim();
		String a170b96Str = params.get("a170b96").toString().trim();
		String a170b92Str = params.get("a170b92").toString().trim();
		String a170b88Str = params.get("a170b88").toString().trim();
		String a165b100Str = params.get("a165b100").toString().trim();
		String a165b96Str = params.get("a165b96").toString().trim();
		String a165b92Str = params.get("a165b92").toString().trim();
		String a165b88Str = params.get("a165b88").toString().trim();
		String a165b84Str = params.get("a165b84").toString().trim();
		
		int id = Integer.parseInt(idS);
		int a185b104 = Integer.parseInt(a185b104Str);
		int a185b100 = Integer.parseInt(a185b100Str);
		int a185b96 = Integer.parseInt(a185b96Str);
		int a180b108 = Integer.parseInt(a180b108Str);
		int a180b104 = Integer.parseInt(a180b104Str);
		int a180b100 = Integer.parseInt(a180b100Str);
		int a180b96 = Integer.parseInt(a180b96Str);
		int a180b92 = Integer.parseInt(a180b92Str);
		int a175b108 = Integer.parseInt(a175b108Str);
		int a175b104 = Integer.parseInt(a175b104Str);
		int a175b100 = Integer.parseInt(a175b100Str);
		int a175b96 = Integer.parseInt(a175b96Str);
		int a175b92 = Integer.parseInt(a175b92Str);
		int a170b108 = Integer.parseInt(a170b108Str);
		int a170b104 = Integer.parseInt(a170b104Str);
		int a170b100 = Integer.parseInt(a170b100Str);
		int a170b96 = Integer.parseInt(a170b96Str);
		int a170b92 = Integer.parseInt(a170b92Str);
		int a170b88 = Integer.parseInt(a170b88Str);
		int a165b100 = Integer.parseInt(a165b100Str);
		int a165b96 = Integer.parseInt(a165b96Str);
		int a165b92 = Integer.parseInt(a165b92Str);
		int a165b88 = Integer.parseInt(a165b88Str);
		int a165b84 = Integer.parseInt(a165b84Str);
		
		
		Maleshangyi item = new Maleshangyi(id, clothesname, a185b104, a185b100, a185b96, a180b108, a180b104, a180b100, a180b96, a180b92, a175b108, a175b104, a175b100, a175b96, a175b92, a170b108, a170b104, a170b100, a170b96, a170b92, a170b88, a165b100, a165b96, a165b92, a165b88, a165b84);

		boolean s = mshangyiService.updateOne(item);
		if (s) {
			result = "success";
		} else {
			result = "faild";
		}
		return result;
	}
	
	@RequestMapping(value = "/savemxiakuInfo")
	@ResponseBody
	public String savemxiakuInfo(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = "";
		String idS = params.get("id").toString().trim();
		String clothesname = params.get("clothesname").toString().trim();
		String a185b98Str = params.get("a185b98").toString().trim();
		String a185b92Str = params.get("a185b92").toString().trim();
		String a185b86Str = params.get("a185b86").toString().trim();
		String a180b104Str = params.get("a180b104").toString().trim();
		String a180b98Str = params.get("a180b98").toString().trim();
		String a180b92Str = params.get("a180b92").toString().trim();
		String a180b86Str = params.get("a180b86").toString().trim();
		String a180b80Str = params.get("a180b80").toString().trim();
		String a175b104Str = params.get("a175b104").toString().trim();
		String a175b98Str = params.get("a175b98").toString().trim();
		String a175b92Str = params.get("a175b92").toString().trim();
		String a175b86Str = params.get("a175b86").toString().trim();
		String a175b80Str = params.get("a175b80").toString().trim();
		String a175b74Str = params.get("a175b74").toString().trim();
		String a170b104Str = params.get("a170b104").toString().trim();
		String a170b98Str = params.get("a170b98").toString().trim();
		String a170b92Str = params.get("a170b92").toString().trim();
		String a170b86Str = params.get("a170b86").toString().trim();
		String a170b80Str = params.get("a170b80").toString().trim();
		String a170b74Str = params.get("a170b74").toString().trim();
		String a165b92Str = params.get("a165b92").toString().trim();
		String a165b86Str = params.get("a165b86").toString().trim();
		String a165b80Str = params.get("a165b80").toString().trim();
		String a165b74Str = params.get("a165b74").toString().trim();
		String a165b70Str = params.get("a165b70").toString().trim();
		
		int id = Integer.parseInt(idS);
		int a185b98 = Integer.parseInt(a185b98Str);
		int a185b92 = Integer.parseInt(a185b92Str);
		int a185b86 = Integer.parseInt(a185b86Str);
		int a180b104 = Integer.parseInt(a180b104Str);
		int a180b98 = Integer.parseInt(a180b98Str);
		int a180b92 = Integer.parseInt(a180b92Str);
		int a180b86 = Integer.parseInt(a180b86Str);
		int a180b80 = Integer.parseInt(a180b80Str);
		int a175b104 = Integer.parseInt(a175b104Str);
		int a175b98 = Integer.parseInt(a175b98Str);
		int a175b92 = Integer.parseInt(a175b92Str);
		int a175b86 = Integer.parseInt(a175b86Str);
		int a175b80 = Integer.parseInt(a175b80Str);
		int a175b74 = Integer.parseInt(a175b74Str);
		int a170b104 = Integer.parseInt(a170b104Str);
		int a170b98 = Integer.parseInt(a170b98Str);
		int a170b92 = Integer.parseInt(a170b92Str);
		int a170b86 = Integer.parseInt(a170b86Str);
		int a170b80 = Integer.parseInt(a170b80Str);
		int a170b74 = Integer.parseInt(a170b74Str);
		int a165b92 = Integer.parseInt(a165b92Str);
		int a165b86 = Integer.parseInt(a165b86Str);
		int a165b80 = Integer.parseInt(a165b80Str);
		int a165b74 = Integer.parseInt(a165b74Str);
		int a165b70 = Integer.parseInt(a165b70Str);
		
		
		Malexiaku item = new Malexiaku(id, clothesname, a185b98, a185b92, a185b86, a180b104, a180b98, a180b92, a180b86, a180b80, a175b104, a175b98, a175b92, a175b86, a175b80, a175b74, a170b104, a170b98, a170b92, a170b86, a170b80, a170b74, a165b92, a165b86, a165b80, a165b74, a165b70);
		

		boolean s = mxiakuService.updateOne(item);
		if (s) {
			result = "success";
		} else {
			result = "faild";
		}
		return result;
	}
	
	@RequestMapping(value = "/savefxiakuInfo")
	@ResponseBody
	public String savefxiakuInfo(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = "";
		String idS = params.get("id").toString().trim();
		String clothesname = params.get("clothesname").toString().trim();
		String a175b93Str = params.get("a175b93").toString().trim();
		String a175b83Str = params.get("a175b83").toString().trim();
		String a170b78Str = params.get("a170b78").toString().trim();
		String a170b73Str = params.get("a170b73").toString().trim();
		String a170b68Str = params.get("a170b68").toString().trim();
		String a170b64Str = params.get("a170b64").toString().trim();
		String a165b88Str = params.get("a165b88").toString().trim();
		String a165b83Str = params.get("a165b83").toString().trim();
		String a165b78Str = params.get("a165b78").toString().trim();
		String a165b73Str = params.get("a165b73").toString().trim();
		String a165b68Str = params.get("a165b68").toString().trim();
		String a165b64Str = params.get("a165b64").toString().trim();
		String a160b88Str = params.get("a160b88").toString().trim();
		String a160b83Str = params.get("a160b83").toString().trim();
		String a160b78Str = params.get("a160b78").toString().trim();
		String a160b73Str = params.get("a160b73").toString().trim();
		String a160b68Str = params.get("a160b68").toString().trim();
		String a160b64Str = params.get("a160b64").toString().trim();
		String a160b60Str = params.get("a160b60").toString().trim();
		String a155b83Str = params.get("a155b83").toString().trim();
		String a155b78Str = params.get("a155b78").toString().trim();
		String a155b68Str = params.get("a155b68").toString().trim();
		String a155b64Str = params.get("a155b64").toString().trim();
		String a155b60Str = params.get("a155b60").toString().trim();
		
		int id = Integer.parseInt(idS);
		int a175b93 = Integer.parseInt(a175b93Str);
		int a175b83 = Integer.parseInt(a175b83Str);
		int a170b78 = Integer.parseInt(a170b78Str);
		int a170b73 = Integer.parseInt(a170b73Str);
		int a170b68 = Integer.parseInt(a170b68Str);
		int a170b64 = Integer.parseInt(a170b64Str);
		int a165b88 = Integer.parseInt(a165b88Str);
		int a165b83 = Integer.parseInt(a165b83Str);
		int a165b78 = Integer.parseInt(a165b78Str);
		int a165b73 = Integer.parseInt(a165b73Str);
		int a165b68 = Integer.parseInt(a165b68Str);
		int a165b64 = Integer.parseInt(a165b64Str);
		int a160b88 = Integer.parseInt(a160b88Str);
		int a160b83 = Integer.parseInt(a160b83Str);
		int a160b78 = Integer.parseInt(a160b78Str);
		int a160b73 = Integer.parseInt(a160b73Str);
		int a160b68 = Integer.parseInt(a160b68Str);
		int a160b64 = Integer.parseInt(a160b64Str);
		int a160b60 = Integer.parseInt(a160b60Str);
		int a155b83 = Integer.parseInt(a155b83Str);
		int a155b78 = Integer.parseInt(a155b78Str);
		int a155b68 = Integer.parseInt(a155b68Str);
		int a155b64 = Integer.parseInt(a155b64Str);
		int a155b60 = Integer.parseInt(a155b60Str);
		
		
		Femalexiaku item = new Femalexiaku(id, clothesname, a175b93, a175b83, a170b78, a170b73, a170b68, a170b64, a165b88, a165b83, a165b78, a165b73, a165b68, a165b64, a160b88, a160b83, a160b78, a160b73, a160b68, a160b64, a160b60, a155b83, a155b78, a155b68, a155b64, a155b60);
		

		boolean s = fxiakuService.updateOne(item);
		if (s) {
			result = "success";
		} else {
			result = "faild";
		}
		return result;
	}
	
	@RequestMapping(value = "/savefshangyiInfo")
	@ResponseBody
	public String savefshangyiInfo(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = "";
		String idS = params.get("id").toString().trim();
		String clothesname = params.get("clothesname").toString().trim();
		String a175b88Str = params.get("a175b88").toString().trim();
		String a170b96Str = params.get("a170b96").toString().trim();
		String a170b92Str = params.get("a170b92").toString().trim();
		String a170b88Str = params.get("a170b88").toString().trim();
		String a170b84Str = params.get("a170b84").toString().trim();
		String a170b80Str = params.get("a170b80").toString().trim();
		String a165b100Str = params.get("a165b100").toString().trim();
		String a165b96Str = params.get("a165b96").toString().trim();
		String a165b92Str = params.get("a165b92").toString().trim();
		String a165b88Str = params.get("a165b88").toString().trim();
		String a165b84Str = params.get("a165b84").toString().trim();
		String a165b80Str = params.get("a165b80").toString().trim();
		String a160b100Str = params.get("a160b100").toString().trim();
		String a160b96Str = params.get("a160b96").toString().trim();
		String a160b92Str = params.get("a160b92").toString().trim();
		String a160b88Str = params.get("a160b88").toString().trim();
		String a160b84Str = params.get("a160b84").toString().trim();
		String a160b80Str = params.get("a160b80").toString().trim();
		String a160b76Str = params.get("a160b76").toString().trim();
		String a155b96Str = params.get("a155b96").toString().trim();
		String a155b92Str = params.get("a155b92").toString().trim();
		String a155b88Str = params.get("a155b88").toString().trim();
		String a155b84Str = params.get("a155b84").toString().trim();
		String a155b80Str = params.get("a155b80").toString().trim();
		String a155b76Str = params.get("a155b76").toString().trim();
		
		int id = Integer.parseInt(idS);
		int a175b88 = Integer.parseInt(a175b88Str);
		int a170b96 = Integer.parseInt(a170b96Str);
		int a170b92 = Integer.parseInt(a170b92Str);
		int a170b88 = Integer.parseInt(a170b88Str);
		int a170b84 = Integer.parseInt(a170b84Str);
		int a170b80 = Integer.parseInt(a170b80Str);
		int a165b100 = Integer.parseInt(a165b100Str);
		int a165b96 = Integer.parseInt(a165b96Str);
		int a165b92 = Integer.parseInt(a165b92Str);
		int a165b88 = Integer.parseInt(a165b88Str);
		int a165b84 = Integer.parseInt(a165b84Str);
		int a165b80 = Integer.parseInt(a165b80Str);
		int a160b100 = Integer.parseInt(a160b100Str);
		int a160b96 = Integer.parseInt(a160b96Str);
		int a160b92 = Integer.parseInt(a160b92Str);
		int a160b88 = Integer.parseInt(a160b88Str);
		int a160b84 = Integer.parseInt(a160b84Str);
		int a160b80 = Integer.parseInt(a160b80Str);
		int a160b76 = Integer.parseInt(a160b76Str);
		int a155b96 = Integer.parseInt(a155b96Str);
		int a155b92 = Integer.parseInt(a155b92Str);
		int a155b88 = Integer.parseInt(a155b88Str);
		int a155b84 = Integer.parseInt(a155b84Str);
		int a155b80 = Integer.parseInt(a155b80Str);
		int a155b76 = Integer.parseInt(a155b76Str);
		
		
		Femaleshangyi item =new Femaleshangyi(id, clothesname, a175b88, a170b96, a170b92, a170b88, a170b84, a170b80, a165b100, a165b96, a165b92, a165b88, a165b84, a165b80, a160b100, a160b96, a160b92, a160b88, a160b84, a160b80, a160b76, a155b96, a155b92, a155b88, a155b84, a155b80, a155b76);
		

		boolean s = fshangyiService.updateOne(item);
		if (s) {
			result = "success";
		} else {
			result = "faild";
		}
		return result;
	}
	
	@RequestMapping(value = "/savefdayiInfo")
	@ResponseBody
	public String savefdayiInfo(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = "";
		String idS = params.get("id").toString().trim();
		String clothesname = params.get("clothesname").toString().trim();
		String a175b88Str = params.get("a175b88").toString().trim();
		String a170b92c96Str = params.get("a170b92c96").toString().trim();
		String a170b88Str = params.get("a170b88").toString().trim();
		String a170b80c84Str = params.get("a170b80c84").toString().trim();
		String a165b100Str = params.get("a165b100").toString().trim();
		String a165b92c96Str = params.get("a165b92c96").toString().trim();
		String a165b88Str = params.get("a165b88").toString().trim();
		String a165b80c84Str = params.get("a165b80c84").toString().trim();
		String a160b100Str = params.get("a160b100").toString().trim();
		String a160b92c96Str = params.get("a160b92c96").toString().trim();
		String a160b88Str = params.get("a160b88").toString().trim();
		String a160b80c84Str = params.get("a160b80c84").toString().trim();
		String a160b76Str = params.get("a160b76").toString().trim();
		String a155b92c96Str = params.get("a155b92c96").toString().trim();
		String a155b88Str = params.get("a155b88").toString().trim();
		String a155b80c84Str = params.get("a155b80c84").toString().trim();
		String a155b76Str = params.get("a155b76").toString().trim();
		
		int id = Integer.parseInt(idS);
		int a175b88 = Integer.parseInt(a175b88Str);
		int a170b92c96 = Integer.parseInt(a170b92c96Str);
		int a170b88 = Integer.parseInt(a170b88Str);
		int a170b80c84 = Integer.parseInt(a170b80c84Str);
		int a165b100 = Integer.parseInt(a165b100Str);
		int a165b92c96 = Integer.parseInt(a165b92c96Str);
		int a165b88 = Integer.parseInt(a165b88Str);
		int a165b80c84 = Integer.parseInt(a165b80c84Str);
		int a160b100 = Integer.parseInt(a160b100Str);
		int a160b92c96 = Integer.parseInt(a160b92c96Str);
		int a160b88 = Integer.parseInt(a160b88Str);
		int a160b80c84 = Integer.parseInt(a160b80c84Str);
		int a160b76 = Integer.parseInt(a160b76Str);
		int a155b92c96 = Integer.parseInt(a155b92c96Str);
		int a155b88 = Integer.parseInt(a155b88Str);
		int a155b80c84 = Integer.parseInt(a155b80c84Str);
		int a155b76 = Integer.parseInt(a155b76Str);
		
		
		Femaledayi item = new Femaledayi(id, clothesname, a175b88, a170b92c96, a170b88, a170b80c84, a165b100, a165b92c96, a165b88, a165b80c84, a160b100, a160b92c96, a160b88, a160b80c84, a160b76, a155b92c96, a155b88, a155b80c84, a155b76);
		
		boolean s = fdayiService.updateOne(item);
		if (s) {
			result = "success";
		} else {
			result = "faild";
		}
		return result;
	}
	
	@RequestMapping(value = "/savexieziInfo")
	@ResponseBody
	public String savefxieziInfo(@RequestBody ModelMap params, HttpServletRequest request) {
		String result = "";
		String idS = params.get("id").toString().trim();
		String clothesname = params.get("clothesname").toString().trim();
		String a240Str = params.get("a240").toString().trim();
		String a245Str = params.get("a245").toString().trim();
		String a250Str = params.get("a250").toString().trim();
		String a255Str = params.get("a255").toString().trim();
		String a260Str = params.get("a260").toString().trim();
		String a265Str = params.get("a265").toString().trim();
		String a270Str = params.get("a270").toString().trim();
		String a275Str = params.get("a275").toString().trim();
		String a280Str = params.get("a280").toString().trim();
		String a285Str = params.get("a285").toString().trim();
		String a290Str = params.get("a290").toString().trim();
		
		int id = Integer.parseInt(idS);
		int a240 = Integer.parseInt(a240Str);
		int a245 = Integer.parseInt(a245Str);
		int a250 = Integer.parseInt(a250Str);
		int a255 = Integer.parseInt(a255Str);
		int a260 = Integer.parseInt(a260Str);
		int a265 = Integer.parseInt(a265Str);
		int a270 = Integer.parseInt(a270Str);
		int a275 = Integer.parseInt(a275Str);
		int a280 = Integer.parseInt(a280Str);
		int a285 = Integer.parseInt(a285Str);
		int a290 = Integer.parseInt(a290Str);
		
		Xiezi item = new Xiezi(id, clothesname, a240, a245, a250, a255, a260, a265, a270, a275, a280, a285, a290);
		
		boolean s = xieziService.updateOne(item);
		if (s) {
			result = "success";
		} else {
			result = "faild";
		}
		return result;
	}
	
	/**
	 * 渲染loadedType.jsp页面
	 * @return
	 */
	@RequestMapping(value = "/loadedtype")
	public String getLoadedType() {
		return "manager/menu/clothesInfo/loadedTypeList";
	}
	
	/**
	 * 被装类型列表显示
	 * @param params
	 * @return
	 */
	@RequestMapping(value="loadedtypeList")
	@ResponseBody
	public String getLoadedTypeList(@RequestBody ModelMap params){
		String result = "";
		int page = (Integer) params.get("page");
		int rows = (Integer) params.get("rows");
		
		LoadedType loadedType = new LoadedType();
		loadedType.setLoadedtypestate("0");	//当被装类型的状态是0时显示
		List<LoadedType> list = loadedTypeService.findLoadedType(loadedType, page, rows);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageInfo",new PageInfo<LoadedType>(list));
		result = JSON.toJSONString(map);
		System.out.println(result);
		return result;
	}
	
	/**
	 * 根据id删除该条数据,逻辑删除
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/deleteTypeById")
	@ResponseBody
	public String deleteTypeById(HttpServletRequest request){
		String result = "faild";
		String id = null;
		try {
			id = request.getParameter("id").toString().trim();
		} catch (Exception e) {
			System.out.println("clothesInfo/deleteTypeById传入参数错误："+e.getMessage());
			id = null;
		}
		if (id!=null) {
			LoadedType t = loadedTypeService.findOne(id);
			t.setLoadedtypestate("1");		//设置为1时，不显示
			boolean s = loadedTypeService.updateOne(t);
			if (s) {
				result = "success";
			}
		}
		return result;
	}
}
