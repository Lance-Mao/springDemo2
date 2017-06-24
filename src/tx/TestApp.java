package tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tx.service.AccountService;

/**
 * Created by admin on 2017/6/24.
 */
public class TestApp {

    @Test
    public void demo1() {
        String xmlPath = "tx/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.transfer("Jack","Rose",1000);
    }
}
