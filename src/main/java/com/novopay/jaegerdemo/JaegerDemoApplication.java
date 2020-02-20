package com.novopay.jaegerdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.jaegertracing.Configuration;

@SpringBootApplication
public class JaegerDemoApplication {
	
	@Bean
	public io.opentracing.Tracer jaegerTracer(){
	    return new Configuration("spring-boot")
	            .getTracer();
	}

	public static void main(String[] args) {
		SpringApplication.run(JaegerDemoApplication.class, args);
	}

}
