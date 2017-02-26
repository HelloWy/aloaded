import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.dao.model.Msgboard;
import com.pumpkin.aloaded.service.manager.IMsgboardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class MsgboardTest {
		@Autowired
		IMsgboardService service;

		@Test
		public void testMsgboard(){
			Msgboard t = new Msgboard();
			List<Msgboard> list = service.findMsgboard(t,1,10);
			System.out.println(list.size());
			t = service.findOne("1");
		}
}