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
//		Vehicle obj = (Vehicle) context.getBean("bike");
//		obj.drive();

		Tire tire = (Tire)context.getBean("tire");
		System.out.println(tire);
	}
}
