package spring.service.domain.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import spring.service.domain.User;

public class UserTestApp01 {
	public static void main(String[] args) {
//		BeanFactory factory =
//				new XmlBeanFactory( new FileSystemResource("./src/main/resources/config/userservice01.xml") );
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/userservice01.xml");
		
		System.out.println("=================");
		User user01 = (User)factory.getBean("user01");
		System.out.println(user01);
		
		System.out.println("=================");
		User user02 = (User)factory.getBean("user02");
		System.out.println(user02);
		
		System.out.println("=================");
		User user03 = (User)factory.getBean("user03");
		System.out.println(user03);
		
		System.out.println("=================");
		User user04 = (User)factory.getBean("user04");
		System.out.println(user04);
		
		System.out.println("=================");
		User user05 = (User)factory.getBean("user05");
		System.out.println(user05);
	}

}
