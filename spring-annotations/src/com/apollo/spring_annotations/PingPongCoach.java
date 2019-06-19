package com.apollo.spring_annotations;

public class PingPongCoach implements Coach {

	private FortuneService fortuneService;
	
	public PingPongCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "bounce the ball for quite some time";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
