package com.apollo.spring_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.apollo.spring_annotations")
@PropertySource("classpath:coach.properties")
public class SportConfig {

	//define bean for sad fortune
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	} 
	
	//define bean for swim coach and inject dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
