package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Student var = (Student) context.getBean("student");
//		Student var1 = (Student) context.getBean("student");
		System.out.println(var);
//
//		System.out.println(var.hashCode());
//		System.out.println(var1.hashCode());
	}

}
