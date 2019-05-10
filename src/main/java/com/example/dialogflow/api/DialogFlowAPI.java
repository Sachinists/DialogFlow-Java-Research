package com.example.dialogflow.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dialogflow.beans.FulfillmentRequest;
import com.example.dialogflow.beans.FulfillmentResponse;
import com.example.dialogflow.beans.Policy;
import com.example.dialogflow.beans.RetResponse;
import com.example.dialogflow.service.PolicyService;
import com.example.dialogflow.service.TempQuesAns;

@RestController
public class DialogFlowAPI {
	
	@Autowired
	private TempQuesAns temp;
	
	@Autowired
	private PolicyService policyService;

	@GetMapping("/checkStatus")
	public String helloWorld() {
		return "You have successfully deployed your first Hello World Spring Boot Application";
	}
	
	@GetMapping("/webhook")
	public String getWebhook() {
		System.out.println("IN GET REQUEST");
		return "GET WEBHOOK CALLED";
	}
	
	@PostMapping("/webhook")
	@ResponseBody
	public ResponseEntity<FulfillmentResponse> postWebhook(@RequestBody FulfillmentRequest fulfillmentRequest) {
		System.out.println("Printing the fulfillment request came by post request");
		System.out.println(fulfillmentRequest.getResponseId());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type","application/json");
		FulfillmentResponse fulfillmentResponse = new FulfillmentResponse();
		fulfillmentResponse.setFulfillmentText("Fulfillment set succesfully");
		return new ResponseEntity<FulfillmentResponse>(fulfillmentResponse, headers, HttpStatus.OK);
	}
	
	@GetMapping("/getAllQuestions")
	@ResponseBody
	public ResponseEntity<RetResponse> getAllQuestions() {
		System.out.println("inside get all questions");
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type","application/json");
		RetResponse response = new RetResponse();
		response.setResponse(temp.getALLQuestion());
		return new ResponseEntity<RetResponse>(response, headers, HttpStatus.OK);
	}
	
	@GetMapping("/getPolicyByID")
	@ResponseBody
	public ResponseEntity<String> getPolicyByIdDOBGet() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type","application/json");
		return new ResponseEntity<String>("You made a GET request, but we were looking for some POST.", headers, HttpStatus.OK);
	}
	
	@PostMapping("/getPolicyByID")
	@ResponseBody
	public ResponseEntity<Policy> getPolicyByIdDOB(@RequestParam String pid,String dob) {
		System.out.println("inside get policy"+pid + dob);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type","application/json");
		return new ResponseEntity<Policy>(policyService.getPolicyByIdDOB(pid, dob), headers, HttpStatus.OK);
	}
}
