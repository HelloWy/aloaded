import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.service.manager.ILoadedTypeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class LoadedTypeTest {
		@Autowired
		ILoadedTypeService service;

		@Test
		public void testLoadedType(){
//			LoadedType t = new LoadedType();
//			List<LoadedType> list = service.findLoadedType(t,1,10);
//			System.out.println(list.size());
//			t = service.findOne("1");
//			LoadedType loadedType = service.getTypeSizeById(1);
//			System.out.println(loadedType.getLoadedSize().getLoadedsizename());
//			System.out.println("品茗数量："+loadedType.getLoadedNames().size());
		}
}