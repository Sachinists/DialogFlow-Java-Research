package com.example.dialogflow.beans;

import java.util.List;

public class FulfillmentResponse {
	
	private String fulfillmentText;
	private List<Object> outputContexts;
	public String getFulfillmentText() {
		return fulfillmentText;
	}
	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
	public List<Object> getOutputContexts() {
		return outputContexts;
	}
	public void setOutputContexts(List<Object> outputContexts) {
		this.outputContexts = outputContexts;
	}

}
