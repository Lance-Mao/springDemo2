package tx2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tx2.service.AccountService;

/**
 * Created by admin on 2017/6/24.
 */
public class TestApp {

    @Test
    public void demo1() {
        String xmlPath = "tx2/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.transfer("Jack","Rose",1000);
    }
}
