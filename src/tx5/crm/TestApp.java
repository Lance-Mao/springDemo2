package tx5.crm;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tx5.crm.service.AccountService;


public class TestApp {
	
	@Test
	public void demo01(){
		String xmlPath = "tx5/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		AccountService accountService =  (AccountService) applicationContext.getBean("accountService");
		accountService.transfer("Jack", "Rose", 1000);
	}

}
