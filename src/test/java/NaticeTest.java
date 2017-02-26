import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.dao.model.Natice;
import com.pumpkin.aloaded.service.manager.INaticeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class NaticeTest {
		@Autowired
		INaticeService service;

		@Test
		public void testNatice(){
//			Natice t = new Natice();
//			List<Natice> list = service.findNatice(t,1,10);
//			System.out.println(list.size());
//			t = service.findOne("1");
//			t.setName("ss");
//			t.setTitle("sdf");
//			t.setAnnouncement("fsdfs");
//			boolean s = service.insertOne(t);
//			System.out.println(s);
			List<Natice> list = service.findAll();
			System.out.println(list.size());
		
		}
}