import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.dao.model.LoadedSize;
import com.pumpkin.aloaded.service.manager.ILoadedSizeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class LoadedSizeTest {
		@Autowired
		ILoadedSizeService service;

		@Test
		public void testLoadedSize(){
			LoadedSize t = new LoadedSize();
			List<LoadedSize> list = service.findLoadedSize(t,1,10);
			System.out.println(list.size());
			t = service.findOne("1");
		}
}