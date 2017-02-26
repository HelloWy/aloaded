import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.dao.model.Clothes_information;
import com.pumpkin.aloaded.service.manager.IClothes_informationService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class Clothes_informationTest {
	@Autowired
	IClothes_informationService clothes_informationService;
	
	static final String mainPath = "E:/eclipse/tomcat7/wtpwebapps/aloaded/attached/";

	@Test
	public void testfindAll(){
		//测试表格导入、传入路径名 为服务器实体的路径地址加上xls的名字，返回的值为null时表示导入数据库成功，否则返回失败的student_id 且自该条后都不再插入数据库 需提示用户修改该条并删除该条以上条目并重新上传！
//		String strings = clothes_informationService.insertExcel("E:ssss.xls");
//		System.out.println(strings);
		
		//测试单个插入
//		Clothes_information clothes_information3 = new Clothes_information("九队", "20138110446", "吴洋洋", "320324199612143292", "male", "172", "80", "80", "78");
//		boolean s = clothes_informationService.insertOne(clothes_information3);
//		System.out.println(s);
		
		//测试数据插入
//		for (int i = 0; i < 100; i++) {
//			System.out.println(clothes_informationService.insertThrends());
//		}
//		
		
		//测试clothes_information更新，通过id查询实体并更改实体后更新
		Clothes_information clothes_information2 = new Clothes_information();
		clothes_information2 = clothes_informationService.findOne("260");
		System.out.println(clothes_information2.getName()+"________________________s");
		clothes_information2.setName("wuang");
		boolean s = clothes_informationService.updateOne(clothes_information2);
		System.out.println(s);
		
		//测试通过学号查询成员信息
//		Clothes_information clothes_information1 = new Clothes_information();
//		clothes_information1.setStudentId("101");
//		List<Clothes_information> list5 = clothes_informationService.findAll(clothes_information1, 1, 10);
//		for (int i = 0; i < list5.size(); i++) {
//			System.out.println(list5.get(i).getName());
//		}
		
		//测试Clothes_information查询
//		System.out.println("测试Clothes_information查询\n查询所有：\n");
//		Clothes_information clothes_information = new Clothes_information();
//		List<Clothes_information> list3 = clothes_informationService.findAll(clothes_information, 1, 10);
//		for (int i = 0; i < list3.size(); i++) {
//			System.out.println(list3.get(i).getTeam());
//		}
//		System.out.println("测试Clothes_information查询\n查询所有九队的成员信息：\n");
//		clothes_information.setTeam("九队");
//		List<Clothes_information> list = clothes_informationService.findAll(clothes_information,2, 10);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getName());
//		}
//		System.out.println("测试Clothes_information查询\n查询所有九队男的成员信息：\n");
//		clothes_information.setSex("male");
//		List<Clothes_information> list2 = clothes_informationService.findAll(clothes_information,1, 20);
//		for (int i = 0; i < list2.size() ; i++) {
//			System.out.println(list2.get(i).getName());
//		}
		
		//测试用户服装信息单位列表，返回为List<String>类型
//		System.out.println("测试用户服装信息单位列表，返回为List<String>类型");
//		List<String> list4 = clothes_informationService.findTeam();
//		for (int i = 0; i < list4.size(); i++) {
//			System.out.println(list4.get(i));
//		}
	}
}
