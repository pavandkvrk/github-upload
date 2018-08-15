package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach thecoach = context.getBean("mycoach", Coach.class);
		Coach coach = context.getBean("myguru", Coach.class);
		System.out.println(coach.getdailydite());
		context.close();
		
	}

}
