package com.apollo.spring_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		Coach gamer=context.getBean("gamerCoach",Coach.class);
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(gamer.getDailyFortune());

		
		//close context
		context.close();
	}

}
