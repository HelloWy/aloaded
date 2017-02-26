package com.pumpkin.aloaded.genarator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class CreatService {
	public static String path = "E:\\WorkSpace\\eclipseWorkspace\\javaweb\\aloaded\\src\\main\\java\\com\\pumpkin\\aloaded";
	public static List<String> className = new ArrayList<String>();
	public static String[] classId;
	public static String pageName = "com.pumpkin.aloaded";


	public static void createServiceAndTest() throws DocumentException {
		getClassinfo();
		if (className!=null) {
			for (int i = 0; i < className.size(); i++) {
				writeIservcie(i);
				writeService(i);
				writeTest(i);
			}
			
		}
		
	}
	public static void writeTest(int i) {
		String testcontext ="package "+ pageName+".test;\n\n"
				+"import java.util.List;\n"
				+"import org.junit.Test;\n"
				+"import org.junit.runner.RunWith;\n"
				+"import org.springframework.beans.factory.annotation.Autowired;\n"
				+"import org.springframework.test.context.ContextConfiguration;\n"
				+"import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;\n"
				+"import "+pageName+".dao.model."+className.get(i)+";\n"
				+"import "+pageName+".service.manager.I"+className.get(i)+"Service;\n\n"
				+"@RunWith(SpringJUnit4ClassRunner.class)\n"
				+"@ContextConfiguration(locations={\"classpath:spring-mvc.xml\",\"classpath:applicationContext.xml\"})\n"
				+"public class "+className.get(i)+"Test {\n"
				+"\t\t@Autowired\n"
				+"\t\tI"+className.get(i)+"Service service;\n\n"
				+"\t\t@Test\n"
				+ "\t\tpublic void test"+className.get(i)+"(){\n"
				+ "\t\t\t"+className.get(i)+" t = new "+className.get(i)+"();\n"
				+"\t\t\tList<"+className.get(i)+"> list = service.find"+className.get(i)+"(t,1,10);\n"
				+"\t\t\tSystem.out.println(list.size());\n"
				+"\t\t\tt = service.findOne(\"1\");\n"
				+ "\t\t}\n"
				+"}";
		File file = new File(path + "//test//", className.get(i) + "Test.java");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println(className.get(i)+"Test.java创建失败");
			}
		}
		try {
			StringBuffer sb = new StringBuffer(testcontext);
			FileWriter writer = new FileWriter(path + "//test//" + className.get(i) + "Test.java");
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(sb.toString());
			bw.close();
			writer.close();
			System.out.println(className.get(i)+"Test.java创建成功");
		} catch (FileNotFoundException e) {
			System.out.println(className.get(i)+"Test.java创建失败");
		} catch (IOException e) {
			System.out.println(className.get(i)+"Test.java创建失败");
		}
	}
	public static void writeService(int i) {
		String servicecontext ="package "+ pageName+".service.manager.impl;\n\n"
				+"import java.util.List;\n"
				+"import org.springframework.stereotype.Service;"
				+"import "+pageName+".service.BaseService;\n"
				+"import "+pageName+".dao.model."+className.get(i)+";\n"
				+"import com.github.pagehelper.PageHelper;\n"
				+"import "+pageName+".service.manager.I"+className.get(i)+"Service;\n\n"
				+"@Service\n"
				+ "public class "+className.get(i)+"Service extends BaseService<"
				+className.get(i)+"> implements I"+className.get(i)+"Service {\n\n" 
				+ "\tpublic List<"+className.get(i)+"> find"+className.get(i)+"("+className.get(i)+" t , int pageNum , int pageSize) { \n"
				+ "\t\ttry {\n"
				+ "\t\t\tPageHelper.startPage(pageNum, pageSize);\n"
				+ "\t\t\treturn selectByList(t);\n"
				+ "\t\t} catch (Exception e) {\n"
				+ "\t\t\treturn null;\n"
				+ "\t\t}\n"
				+ "\t}\n"
				+ "\tpublic boolean updateOne("+className.get(i)+" t) {\n"
				+ "\t\ttry {\n"
				+ "\t\t\tupdateByPrimaryKey(t);\n"
				+ "\t\t\treturn true;\n"
				+ "\t\t} catch (Exception e) {\n"
				+ "\t\t\treturn false;\n"
				+ "\t\t}\n"
				+ "\t}\n"
				+ "\tpublic boolean deleteOne(String id) {\n"
				+ "\t\ttry {\n"
				+ "\t\t\tdeleteByPrimaryKey(id);\n"
				+ "\t\t\treturn true;\n"
				+ "\t\t} catch (Exception e) {\n"
				+ "\t\t\treturn false;\n"
				+ "\t\t}\n"
				+ "\t}\n"
				+ "\tpublic boolean insertOne("+className.get(i)+" t) {\n\n"
				+ "\t\ttry {\n"
				+ "\t\t\tinsert(t);\n"
				+ "\t\t\treturn true;\n"
				+ "\t\t} catch (Exception e) {\n"
				+ "\t\t\treturn false;\n"
				+ "\t\t}\n"
				+ "\t}\n"
				+ "\tpublic "+className.get(i)+" findOne(String id) {\n\n"
				+ "\t\ttry {\n"
				+ "\t\t\t"+className.get(i)+" t = new "+className.get(i)+"();\n"
				+ "\t\t\tt.setId(Integer.parseInt(id));\n"
				+ "\t\t\treturn selectByEntity(t);\n"
				+ "\t\t} catch (Exception e) {\n"
				+ "\t\t\tSystem.out.println(e);\n"
				+ "\t\t\treturn null;\n"
				+ "\t\t}\n"
				+ "\t}\n"
				+"}";
		
		File file = new File(path + "//service//manager//impl//", className.get(i) + "Service.java");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println(className.get(i)+"Service.java创建失败");
			}
		}
		try {
			StringBuffer sb = new StringBuffer(servicecontext);
			FileWriter writer = new FileWriter(path + "//service//manager//impl//" + className.get(i) + "Service.java");
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(sb.toString());
			bw.close();
			writer.close();
			System.out.println(className.get(i)+"Service.java创建成功");
		} catch (FileNotFoundException e) {
			System.out.println(className.get(i)+"Service.java创建失败");
		} catch (IOException e) {
			System.out.println(className.get(i)+"Service.java创建失败");
		}
	}
	public static void getClassinfo(){
		try {
			// 创建saxReader对象
			String xmlpath = "\\genarator\\generator.xml";
			System.out.println(path+xmlpath);
			SAXReader reader = new SAXReader();
			// 通过read方法读取一个文件 转换成Document对象
			Document document = reader.read(new File(path + xmlpath));
			// 获取根节点元素对象
			Element node = document.getRootElement();
			Element element = node.element("context");
			Element xxElement = element.element("table");
			System.out.println(xxElement.attribute("domainObjectName").getText());
			@SuppressWarnings("unchecked")
			List<Element> xElement = element.elements("table");
			System.out.println(xElement.size());
			for(int i = 0 ; i < xElement.size() ; i++){
				System.out.println(xElement.get(i).attribute("domainObjectName").getText());
				className.add((String)xElement.get(i).attribute("domainObjectName").getText());
				
			}
		
		} catch (Exception e) {
			System.out.println("在mybatis配置文件中找不到相应的包信息"+e);
		}
	}
	public static void writeIservcie(int i) {
		String iservicecontext ="package "+ pageName+".service.manager;\n\n"
				+"import java.util.List;\n"
				+ "import "+pageName+".dao.model."+className.get(i)+";\n\n"
				+ "public interface I" + className.get(i)+"Service {\n\n"
				+ "\tpublic List<"+className.get(i)+"> find"+className.get(i)+"("+className.get(i)+" t , int currPage , int pageSize); \n"
				+ "\tpublic boolean updateOne("+className.get(i)+" t);\n"
				+ "\tpublic boolean deleteOne(String id);\n"
				+ "\tpublic boolean insertOne("+className.get(i)+" t);\n\n"
				+ "\tpublic "+className.get(i)+" findOne(String id);\n\n"
				+"}";
		
		File file = new File(path + "//service//manager//", "I" + className.get(i) + "Service.java");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("I"+className.get(i)+"Service.java创建失败");
			}
		}
		try {
			StringBuffer sb = new StringBuffer(iservicecontext);
			FileWriter writer = new FileWriter(path + "//service//manager//I" + className.get(i) + "Service.java");
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(sb.toString());
			bw.close();
			writer.close();
			System.out.println("I"+className.get(i)+"Service.java创建成功");
		} catch (FileNotFoundException e) {
			System.out.println("I"+className.get(i)+"Service.java创建失败");
		} catch (IOException e) {
			System.out.println("I"+className.get(i)+"Service.java创建失败");
		}
	}

}
