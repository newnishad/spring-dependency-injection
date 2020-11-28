package com.hellonishad.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		//SpringApplication.run(App.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Car obj = (Car) context.getBean("car");
		obj.drive();
	}
}
