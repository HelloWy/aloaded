import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.dao.model.Maledayi;
import com.pumpkin.aloaded.service.manager.IMaledayiService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class MaledayiTest {
		@Autowired
		IMaledayiService service;

		@Test
		public void testMaledayi(){
			Maledayi t = new Maledayi();
			List<Maledayi> list = service.findMaledayi(t,1,10);
			System.out.println(list.size());
			t = service.findOne("1");
		}
}