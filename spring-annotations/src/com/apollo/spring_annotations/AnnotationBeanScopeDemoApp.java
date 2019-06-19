package com.apollo.spring_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//loading config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		
		//calling methods on beans
		boolean result=(theCoach==alphaCoach);
		System.out.println("Are they the same object "+result);
		
		System.out.println("Location: "+theCoach);
		System.out.println("Location: "+alphaCoach);
		
		//closing context
		context.close();
		}

}
