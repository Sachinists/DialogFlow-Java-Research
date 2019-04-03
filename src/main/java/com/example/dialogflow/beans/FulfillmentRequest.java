package com.example.dialogflow.beans;

public class FulfillmentRequest {

	private String responseId;
	private Object queryResult;
	private Object webhookStatus;
	private String outputAudio;
	private Object outputAudioConfig;
	public String getResponseId() {
		return responseId;
	}
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	public Object getQueryResult() {
		return queryResult;
	}
	public void setQueryResult(Object queryResult) {
		this.queryResult = queryResult;
	}
	public Object getWebhookStatus() {
		return webhookStatus;
	}
	public void setWebhookStatus(Object webhookStatus) {
		this.webhookStatus = webhookStatus;
	}
	public String getOutputAudio() {
		return outputAudio;
	}
	public void setOutputAudio(String outputAudio) {
		this.outputAudio = outputAudio;
	}
	public Object getOutputAudioConfig() {
		return outputAudioConfig;
	}
	public void setOutputAudioConfig(Object outputAudioConfig) {
		this.outputAudioConfig = outputAudioConfig;
	}
	
	
	
}
