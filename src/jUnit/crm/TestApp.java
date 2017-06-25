//package jUnit.crm;
//
//import jUnit.crm.service.AccountService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:jUnit/applicationContext.xml")
//public class TestApp {
//
//	@Autowired  //与junit整合，不需要在spring xml配置扫描
//	private AccountService accountService;
//
//	@Test
//	public void demo01(){
////		String xmlPath = "applicationContext.xml";
////		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
////		AccountService accountService =  (AccountService) applicationContext.getBean("accountService");
//		accountService.transfer("Jack", "Rose", 1000);
//	}
//
//}
