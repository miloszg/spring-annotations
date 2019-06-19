package com.apollo.spring_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class); 
		
		//get bean from container
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		
	
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("email: "+theCoach.getEmail());
		System.out.println("team: "+theCoach.getTeam());
		//close context
		context.close();
	}

}
