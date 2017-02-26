import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.dao.model.User;
import com.pumpkin.aloaded.service.manager.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class UserTest {
		@Autowired
		IUserService service;

		@Test
		public void testUser(){
			User t = new User();
			List<User> list = service.findUser(t,1,10);
			System.out.println(list.size());
			t = service.findOne("1");
		}
}