package main.java.demo;


import main.java.services.ISpringDemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;




@Controller("appController")
public class App {
	
	@Autowired(required = true)
	private ISpringDemoService iSpringDemoService;
	
	public void updateUserInfo(){
		iSpringDemoService.updateUserInfo();
	} 
	
	public void getUserInfo(){
		iSpringDemoService.getUserInfo();
	}
	
	public void getUserList(){
		iSpringDemoService.getUserList();
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		/*
		 * This API loads configuration file and based on that it creates Object.
		 * */

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
		
		/*ISpringDemoService service=(ISpringDemoService) context.getBean("springDemoService");
		service.springDemoMessage();*/
	
		App a1=(App) context.getBean("appController");
		a1.updateUserInfo();
		
		a1.getUserInfo();
		
		a1.getUserList();
		
	}
	 
}
