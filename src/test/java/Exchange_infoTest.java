import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.dao.model.Exchange_info;
import com.pumpkin.aloaded.service.manager.IExchange_infoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class Exchange_infoTest {
		@Autowired
		IExchange_infoService service;

		@Test
		public void testExchange_info(){
			Exchange_info t = new Exchange_info();
			List<Exchange_info> list = service.findExchange_info(t,1,10);
			System.out.println(list.size());
			t = service.findOne("1");
		}
}