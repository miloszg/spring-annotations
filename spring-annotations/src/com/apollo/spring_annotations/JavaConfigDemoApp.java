package com.apollo.spring_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class); 
		
		//get bean from container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
	
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	
		//close context
		context.close();
	}

}
