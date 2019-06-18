package com.apollo.spring_annotations;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data= {
			"Beware of the wolfs",
			"Someone is out to get you",
			"Keep your friends close"
	};
	private Random rand=new Random();	
	
	@Override
	public String getFortune() {
		int index=rand.nextInt(data.length);
		
		return data[index];
	}

}
