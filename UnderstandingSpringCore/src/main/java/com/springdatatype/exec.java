package com.springdatatype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springdatatype/cconfig.xml");
		Emp emp=(Emp) context.getBean("emp1");
		System.out.print(emp);

	}

}
