package com.apollo.spring_annotations;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is not your lucky day";
	}

}
