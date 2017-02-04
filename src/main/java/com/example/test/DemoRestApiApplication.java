package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApiApplication.class, args);
	}
	
	@RestController
	public class FirstCloudAPI{
		
		@RequestMapping("/")
		public String getGreeted(){
			return "Welcome buddy, you are seeing me on cloud!!!!!!!!!!!!!";
		}
		
	}
}
