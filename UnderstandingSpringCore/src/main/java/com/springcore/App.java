package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    Students var=(Students) context.getBean("Student1");
    System.out.println(var);
  }
}
