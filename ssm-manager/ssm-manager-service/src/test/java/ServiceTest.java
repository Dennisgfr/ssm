import com.ssm.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-service.xml");
        //获取对象
        AccountService accountService = (AccountService) ac.getBean("accountService");

        accountService.checkLogin();
    }
}
