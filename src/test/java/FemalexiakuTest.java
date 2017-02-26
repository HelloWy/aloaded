import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.dao.model.Femalexiaku;
import com.pumpkin.aloaded.service.manager.IFemalexiakuService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class FemalexiakuTest {
		@Autowired
		IFemalexiakuService service;

		@Test
		public void testFemalexiaku(){
			Femalexiaku t = new Femalexiaku();
			List<Femalexiaku> list = service.findFemalexiaku(t,1,10);
			System.out.println(list.size());
			t = service.findOne("1");
		}
}