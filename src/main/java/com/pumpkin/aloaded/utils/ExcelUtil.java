package com.pumpkin.aloaded.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import com.pumpkin.aloaded.dao.model.Clothes_information;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelUtil {
	
	public List<Clothes_information> readEcxel(String filePath) {
		jxl.Workbook readxls = null;
		List<Clothes_information> list = new ArrayList<Clothes_information>();
		try {
			InputStream inputStream = new FileInputStream(filePath);
			readxls = Workbook.getWorkbook(inputStream);
			// 得到第一张表
			Sheet sheet = readxls.getSheet(0);
			// 得到总列数
//			int colsAll = sheet.getColumns();
			// 得到总行数
			int rowsAll = sheet.getRows();
			// 进行表格的单元格处理
			int s = 0;
			String cell = sheet.getCell(s, 0).getContents();
			System.out.println(cell);
			for (int i = 1; i < rowsAll; i++) {
				Clothes_information clothes_information = new Clothes_information(sheet.getCell(1,i).getContents(), sheet.getCell(2,i).getContents(), sheet.getCell(3,i).getContents(), sheet.getCell(4,i).getContents(), sheet.getCell(5,i).getContents(), sheet.getCell(21,i).getContents(), sheet.getCell(22,i).getContents(), sheet.getCell(23,i).getContents(),sheet.getCell(24,i).getContents());
//				 clothes_information.setTeam(sheet.getCell(1,i).getContents());
//				 clothes_information.setStudentId(sheet.getCell(2,i).getContents());
//				 clothes_information.setName(sheet.getCell(3,i).getContents());
//				 clothes_information.setIdentityId(sheet.getCell(4,i).getContents());
//				 clothes_information.setSex(sheet.getCell(5,i).getContents());
//				 clothes_information.setQihouqu(sheet.getCell(6,i).getContents());
//				 clothes_information.setJunbingzhong(sheet.getCell(7,i).getContents());
//				 clothes_information.setDanweiqufen(sheet.getCell(8,i).getContents());
//				 clothes_information.setDanweileixing(sheet.getCell(9,i).getContents());
//				 clothes_information.setZhiwujibie(sheet.getCell(10,i).getContents());
//				 clothes_information.setXianzhishijian(sheet.getCell(11,i).getContents());
//				 clothes_information.setJunxianjibie(sheet.getCell(12,i).getContents());
//				 clothes_information.setXianxianshijian(sheet.getCell(13,i).getContents());
//				 clothes_information.setGongzuogangwei(sheet.getCell(14,i).getContents());
//				 clothes_information.setGongzuoshijian(sheet.getCell(15,i).getContents());
//				 clothes_information.setRuwushijian(sheet.getCell(16,i).getContents());
//				 clothes_information.setTiganshijian(sheet.getCell(17,i).getContents());
//				 clothes_information.setGaixuanshijian(sheet.getCell(18,i).getContents());
//				 clothes_information.setZucema(sheet.getCell(19,i).getContents());
//				 clothes_information.setDengjibiaohao(sheet.getCell(20,i).getContents());
//				 clothes_information.setShengao(sheet.getCell(21,i).getContents());
//				 clothes_information.setXiongwei(sheet.getCell(22,i).getContents());
//				 clothes_information.setYaowei(sheet.getCell(23,i).getContents());
//				 clothes_information.setTouwei(sheet.getCell(24,i).getContents());
//				 clothes_information.setJiaochang(sheet.getCell(25,i).getContents());
//				 clothes_information.setTuochang(sheet.getCell(26,i).getContents());
//				 clothes_information.setDaima(sheet.getCell(27,i).getContents().toString());
//				 clothes_information.setPingming(sheet.getCell(28,i).getContents());
//				 clothes_information.setHaoxing(sheet.getCell(29,i).getContents());
//				 clothes_information.setBeidongleixing(sheet.getCell(30,i).getContents());
				 System.out.println(clothes_information.getName()+"  "+clothes_information.getTeam()+" "+clothes_information.getStudentId()+" " + clothes_information.getSex() + "　" +clothes_information.getShengao());
				 
				 list.add(clothes_information);
			}

		} catch (IOException e) {
			System.out.println("解析错误！"+e);
			list = null;
		} catch (BiffException e) {
			System.out.println("解析错误！"+e);
			list = null;
		}
		return list;

	}
}
