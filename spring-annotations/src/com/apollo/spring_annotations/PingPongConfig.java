package com.apollo.spring_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class PingPongConfig {

	//define bean for sad fortune
	@Bean
	public FortuneService mehFortuneService() {
		return new MehFortuneService();
	} 
	
	//define bean for swim coach and inject dependencies
	@Bean
	public Coach pingPongCoach() {
		return new PingPongCoach(mehFortuneService());
	}
}
