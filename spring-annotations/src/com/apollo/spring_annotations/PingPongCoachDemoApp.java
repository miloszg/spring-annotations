package com.apollo.spring_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PingPongCoachDemoApp {

	public static void main(String[] args) {
		//load config
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PingPongConfig.class); 
		
		//retieve bean
		PingPongCoach coach=context.getBean("pingPongCoach",PingPongCoach.class);
		
		
		//call methods
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		
		//close context
		context.close();
	}

}
