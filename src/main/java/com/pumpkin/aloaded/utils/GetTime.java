package com.pumpkin.aloaded.utils;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * 获得服务器当前时间
 *
 */
public class GetTime {
	public static String getCurrentDateTime(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowTime = sdf.format(date);
		return nowTime;
	}
}
