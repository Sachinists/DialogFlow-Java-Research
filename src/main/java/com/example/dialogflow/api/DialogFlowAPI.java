package com.example.dialogflow.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DialogFlowAPI {

	@GetMapping("/checkStatus")
	public String helloWorld() {
		return "You have successfully deployed your first Hello World Spring Boot Application";
	}
}
