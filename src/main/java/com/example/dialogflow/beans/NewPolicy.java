package com.example.dialogflow.beans;

public class NewPolicy {
	private String policyName;
	private String policyDesc;
		
	public NewPolicy(String policyName, String policyDesc) {
		super();
		this.policyName = policyName;
		this.policyDesc = policyDesc;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyDesc() {
		return policyDesc;
	}
	public void setPolicyDesc(String policyDesc) {
		this.policyDesc = policyDesc;
	}
	
	
}
