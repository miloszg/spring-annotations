package com.apollo.spring_annotations;

public class MehFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "it's not that BAD I guess";
	}

}
