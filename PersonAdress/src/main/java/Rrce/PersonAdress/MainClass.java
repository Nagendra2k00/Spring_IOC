package Rrce.PersonAdress;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Person p1 =(Person)ac.getBean("person");
	
		Address a1 = (Address)ac.getBean("address");
		
		System.out.println(a1);
		System.out.println(p1);
		
		
	}

}
