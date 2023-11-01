package com.cg2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringBootProject4Application {
	

		@GetMapping("/get")
		public String  getDetails(){
			return "Hello";
		}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject4Application.class, args);
	}

}
