package com.example.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
	
	   @Bean 
	   public HelloWorld helloWorld(){
	      return new HelloWorld();
	   }
	   
	   
	   @Bean 
	   public HelloCapgemini helloCapgemini(){
	      return new HelloCapgemini();
	   }
	   
	   
	   
	   
	}
	
	
	

