package tx3;

import tx3.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2017/6/24.
 */
public class TestApp {

    @Test
    public void demo1() {
        String xmlPath = "tx3/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService = (AccountService) applicationContext.getBean("proxyAccountService");
        accountService.transfer("Jack","Rose",1000);
    }
}
