package com.example.demo.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		  ApplicationContext ctx = 
			         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
			   
			      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
			      
			      HelloCapgemini hcapgemini=ctx.getBean(HelloCapgemini.class);
			      
			      helloWorld.setMessage("Hello World!");
			      helloWorld.getMessage();

			      
			      hcapgemini.setMessage("hello capgemini");
			      
			      hcapgemini.getMessage();
	}

}
