package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import brave.sampler.Sampler;

@EnableJpaRepositories(basePackages="com.java.dao")
@EntityScan(basePackages="com.java.dto")
@SpringBootApplication
@EnableEurekaClient
public class Starter {

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
