import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.service.manager.IFemaledayiService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class FemaledayiTest {
		@Autowired
		IFemaledayiService service;

		@Test
		public void testFemaledayi(){
//			Femaledayi t = new Femaledayi();
//			for (int j = 0; j < service.findFemaledayi(t, 1, 100).size(); j++) {
//			t.setId(j);
//			t.setA155b76(23);
//			t.setA155b80c84(12);
//			t.setA155b88(43);
//			t.setA155b92c96(43);
//			t.setA160b100(23);
//			t.setA160b76(52);
//			t.setA160b80c84(97);
//			t.setA160b88(25);
//			t.setA160b88(98);
//			t.setA160b92c96(23);
//			t.setA165b100(32);
//			t.setA165b80c84(87);
//			t.setA165b88(132);
//			t.setA165b92c96(64);
//			t.setA170b80c84(15);
//			t.setA170b88(92);
//			t.setA170b92c96(94);
//			t.setA175b88(98);
//			System.out.println(t.getClothesname());
//			boolean s = service.updateOne(t);
//			System.out.println(s);
//			}
//			t = service.findOne("3");
//			String clothesname = t.getClothesname();
//			t = new Femaledayi(3, clothesname, 0, 112, 332, 3, 23, 3, 4, 3, 2, 4, 2, 3,3, 4, 2, 4, 5, 5);
//			System.out.println(service.updateOne(t));
//			List<Femaledayi> list = service.findFemaledayi(t,1,10);
//			System.out.println(list.size());
//			t = service.findOne("1");
		}
}