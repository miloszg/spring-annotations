package com.apollo.spring_annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	

	public TennisCoach() {
		System.out.println("Created tennis coach");
	}

	//define init method
	
	@PostConstruct
	public void doStartUp() {
		System.out.println("do strartUp()");
	}
	
	//define detroy method
	@PreDestroy
	public void doCleanUp() {
		System.out.println("do cleanUp()");
	}
	
	
	
	
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("Tennis coach setFortune method"); this.fortuneService =
	 * fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practise backhand for 15 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
