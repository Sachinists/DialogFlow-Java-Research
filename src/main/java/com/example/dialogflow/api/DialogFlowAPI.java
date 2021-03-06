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
import com.example.dialogflow.beans.Response;
import com.example.dialogflow.service.PolicyService;
import com.example.dialogflow.service.TempQuesAns;

@RestController
public class DialogFlowAPI {
	
	@Autowired
	private TempQuesAns temp;
	
	@Autowired
	private PolicyService policyService;

	@Autowired
	private Response response;
	
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
	public ResponseEntity<Object> getAllQuestions() {
		System.out.println("inside get all questions");
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type","application/json");
		response.setResponse(temp.getALLQuestion());
		return new ResponseEntity<Object>(response, headers, HttpStatus.OK);
	}
	
	@GetMapping("/getPolicyByID")
	@ResponseBody
	public ResponseEntity<String> getPolicyByIdDOBGet() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type","application/json");
		return new ResponseEntity<String>("You made a GET request, but we were looking for some POST.", headers, HttpStatus.OK);
	}
	
	@PostMapping("/getPolicyByIDDOB")
	@ResponseBody
	public ResponseEntity<Object> getPolicyByIdDOB(@RequestParam String pid,String dob) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type","application/json");
		response.setResponse(policyService.getPolicyByIdDOB(pid, dob));
		return new ResponseEntity<Object>(response, headers, HttpStatus.OK);
	}
	
	@GetMapping("/getAllPolicy")
	@ResponseBody
	public ResponseEntity<Object> getAllPolicy() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type","application/json");
		response.setResponse(policyService.getAllPolicy());
		return new ResponseEntity<Object>(response, headers, HttpStatus.OK);
	}
	@PostMapping("/getPolicyByID")
	@ResponseBody
	public ResponseEntity<Object> getPolicyById(@RequestParam int pid) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type","application/json");
		response.setResponse(policyService.getPolicyById(pid));
		return new ResponseEntity<Object>(response, headers, HttpStatus.OK);
	}
	
	@PostMapping("/getPoliciesByName")
	@ResponseBody
	public ResponseEntity<Object> getPolicyById(@RequestParam String name,String dob) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type","application/json");
		response.setResponse(policyService.getPoliciesByName(name, dob));
		return new ResponseEntity<Object>(response, headers, HttpStatus.OK);
	}
	
}
