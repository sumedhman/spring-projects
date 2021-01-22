package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springdemo.BaseballCoach;
import com.springdemo.Coach;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		//BaseballCoach theCoach =new BaseballCoach();
		//System.out.println(theCoach.getDailyWork());
	
		Coach theCoach =new BaseballCoach();
		System.out.println(theCoach.getDailyWork());
	
	}

}
