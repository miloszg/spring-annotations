package com.apollo.spring_annotations;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class gamerCoach implements Coach {
	@Value("${foo.fortune1}")
	private String fort1;
	
	@Value("${foo.fortune2}")
	private String fort2;
	
	@Value("${foo.fortune3}")
	private String fort3;
	
	@Override
	public String getDailyWorkout() {
		return "git gud and drink mount&dew";
	}

	@PostConstruct
	@Override
	public String getDailyFortune() {
		String[] data={
			fort1,fort2,fort3
		};
		
		Random rand=new Random();
		
		int count=rand.nextInt(data.length);
		return data[count];
	}

}
