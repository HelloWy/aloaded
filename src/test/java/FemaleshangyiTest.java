import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.service.manager.IFemaleshangyiService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class FemaleshangyiTest {
		@Autowired
		IFemaleshangyiService service;

		@Test
		public void testFemaleshangyi(){
			
//			Femaleshangyi t = new Femaleshangyi();
//			for (int i = 0; i < service.findFemaleshangyi(t, 1, 100).size(); i++) {
//				t = new Femaleshangyi(i, service.findOne(i+1+"").getClothesname(), 0, 78, 98, 6, 7, 67, 7, 23, 7, 8, 7, 6, 8, 7, 8, 7, 8, 7, 89, 7, 8, 7, 68, 7, 8, 7);
//				boolean s = service.updateOne(t);
//				System.out.println(s);
//			}
//			System.out.println(service.findFemaleshangyi(t, 1, 100).size());
//			for (int i = 1; i < 23; i++) {
//				t = service.findOne(i+"");
//				System.out.println(t.getClothesname());
//			}
//			
			
//			List<Femaleshangyi> list = service.findFemaleshangyi(t,1,10);
//			System.out.println(list.size());
//			t = service.findOne("1");
		}
}