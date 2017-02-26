import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.pumpkin.aloaded.service.manager.IMessageService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class MessageTest {
		@Autowired
		IMessageService service;

		@Test
		public void testMessage(){
//			Message t = new Message();
//			List<Message> list = service.findMessage(t,1,10);
//			System.out.println(list.size());
//			t = service.findOne("1");
			
//			for (int i = 100; i <200; i++) {
//				Message t = new Message();
//				t.setUserid(i);
//				t.setUsername(AutoCreateName.createName());
//				t.setClothesname(AutoCreateName.getChinese()+AutoCreateName.getChinese());
//				t.setAdminid(i+100);
//				t.setAdminname(AutoCreateName.createName());
//				t.setAdminphone("156176965"+i);
//				t.setChangesize("170/"+i);
//				t.setCreatetime(GetTime.getCurrentDateTime());
//				t.setReplytime(GetTime.getCurrentDateTime());
//				t.setContext("这个是第"+i+"条信息");
//				t.setIsdo("0");
//				t.setReplycontext("这个是第"+i+"回复信息");
//				t.setUserphone("136726333"+i);
//				t.setSize("180/"+i);
//				service.insertOne(t);
//			}
			
			
//			Message message = new Message();
//			message = service.findOne("55");
//			message.setAdminname("高大上");
//			boolean s = service.updateOne(message);
//			System.out.println(s);
//			Message message = new Message();
//			message.setUserid(5);
//			List<Message> list = service.selectByDescList(message);
//			System.out.println(list.size());
		}
}