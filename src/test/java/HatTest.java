import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.dao.model.Hat;
import com.pumpkin.aloaded.service.manager.IHatService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class HatTest {
		@Autowired
		IHatService service;

		@Test
		public void testHat(){
			Hat t = new Hat();
//			List<Hat> list = service.findHat(t,1,10);
//			System.out.println(list.size());
//			t = service.findOne("1");
//			t.setClothesname("军帽");
//			boolean s = service.insertOne(t);
//			System.out.println(s);
			t=service.findOne("1");
			t.setA53(101);
			System.out.println(service.updateOne(t));
		}
}