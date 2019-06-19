package com.apollo.spring_annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "swim for 15min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}
	
	

}
