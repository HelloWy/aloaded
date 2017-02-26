import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.dao.model.Maleshangyi;
import com.pumpkin.aloaded.service.manager.IMaleshangyiService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class MaleshangyiTest {
		@Autowired
		IMaleshangyiService service;

		@Test
		public void testMaleshangyi(){
			Maleshangyi t = new Maleshangyi();
			List<Maleshangyi> list = service.findMaleshangyi(t,1,10);
			System.out.println(list.size());
			t = service.findOne("1");
		}
}