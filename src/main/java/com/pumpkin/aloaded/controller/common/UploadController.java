package com.pumpkin.aloaded.controller.common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.pumpkin.aloaded.utils.ConverterUtil;
import com.pumpkin.aloaded.utils.SHA1;

@Controller
public class UploadController {
	
	@RequestMapping("/uploads")
	@ResponseBody
	public Map<String, Object> doUploads(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		// 文件保存目录路径
		String savePath = request.getSession().getServletContext().getRealPath("/") + "attached/";
		// 文件保存目录URL
		String saveUrl = request.getContextPath() + "/attached/";
		// 定义允许上传的文件扩展名
		
		HashMap<String, String> extMap = new HashMap<String, String>();
		extMap.put("image", "gif,jpg,jpeg,png,bmp");
		extMap.put("flash", "swf,flv");
		extMap.put("media", "swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");
		extMap.put("file", "doc,docx,xls,xlsx,ppt,htm,html,txt,zip,rar,gz,bz2");
		// 最大文件大小
		long maxSize = 5242880;
		String dirName = request.getParameter("dir");
		System.out.println(dirName + "========");
		savePath += dirName + "/";
		saveUrl += dirName + "/";
		File saveDirFile = new File(savePath);
		if (!saveDirFile.exists()) {
			saveDirFile.mkdirs();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String ymd = sdf.format(new Date());
		savePath += ymd + "/";
		saveUrl += ymd + "/";
		File dirFile = new File(savePath);
		if (!dirFile.exists()) {
			dirFile.mkdirs();
		}
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		String fileName = "";
		String newFileName = "";
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile mf = entity.getValue();
			fileName = mf.getOriginalFilename();
			String suffix = fileName.indexOf(".") != -1
					? fileName.substring(fileName.lastIndexOf("."), fileName.length()) : "";
			String ext = suffix.substring(1, suffix.length()).toLowerCase();
			System.out.println(ext+"==============");
			if (!Arrays.<String> asList(extMap.get(dirName).split(",")).contains(ext)) {
				modelMap.put("error", "1");
				modelMap.put("message", "上传文件扩展名是不允许的扩展名。\n只允许" + extMap.get(dirName) + "格式。");
				return modelMap;
			}
			// 检查文件大小
			if (mf.getSize() > maxSize) {
				modelMap.put("error", "1");
				modelMap.put("message", "上传文件大小超过限制。");
				return modelMap;
			}
			try {
				String key = SHA1.getDigestOfString(mf.getBytes()).toUpperCase();
				newFileName = key + (suffix != null ? suffix : "");
				String newFilePath = savePath + newFileName;
				File uploadFile = new File(newFilePath);
				FileCopyUtils.copy(mf.getBytes(), uploadFile);
				if (dirName.equals("image")) {
					String formatFilePath = savePath + key + "_MOBILE." + ConverterUtil.PNG;
					ConverterUtil.converterAndScale(uploadFile, ConverterUtil.PNG, new File(formatFilePath), 640, 320);
				}
				System.out.println("--->>>" + saveUrl + newFileName);
				modelMap.put("error", "0");
				modelMap.put("url", saveUrl + newFileName);
				modelMap.put("title", fileName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return modelMap;
	}

}
