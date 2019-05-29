package com.example.dialogflow.beans;

import org.springframework.stereotype.Component;

@Component
public class Response {

	Object response;

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}
	
}
