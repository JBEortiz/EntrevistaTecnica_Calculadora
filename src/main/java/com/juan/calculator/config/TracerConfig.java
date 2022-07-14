package com.juan.calculator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import io.corp.calculator.TracerImpl;

@Component
public class TracerConfig {
	
	@Bean
	public TracerImpl restTracer() {
		return new TracerImpl();
	}

}
