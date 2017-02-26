package com.pumpkin.aloaded.genarator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * mybatis配置文件生成工具
 * @author zhuxl
 * 2014年9月29日
 */
public class MybatisUtil {
	public static void main(String[] args) throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(
				MybatisUtil.class.getResourceAsStream("generator.xml"));
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		System.out.println("mybatis:生成结束!");
		CreatService.createServiceAndTest();
	}
}
