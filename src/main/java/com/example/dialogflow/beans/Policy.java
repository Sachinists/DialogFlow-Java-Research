package com.example.dialogflow.beans;

public class Policy {

	private String policyNumber;
	private String policyName;
	private String policyDesc;
	private String policyDate;
	private Issuer isserDetails;
	private int policyAmount;
	private int premium;
	private PolicyType policyType;
	
	
	
	public Policy(String policyNumber, String policyName, String policyDesc, String policyDate, Issuer isserDetails,
			int policyAmount, int premium, PolicyType policyType) {
		this.policyNumber = policyNumber;
		this.policyName = policyName;
		this.policyDesc = policyDesc;
		this.policyDate = policyDate;
		this.isserDetails = isserDetails;
		this.policyAmount = policyAmount;
		this.premium = premium;
		this.policyType = policyType;
	}
	public int getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	public PolicyType getPolicyType() {
		return policyType;
	}
	public void setPolicyType(PolicyType policyType) {
		this.policyType = policyType;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
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
	public String getPolicyDate() {
		return policyDate;
	}
	public void setPolicyDate(String policyDate) {
		this.policyDate = policyDate;
	}
	public Issuer getIsserDetails() {
		return isserDetails;
	}
	public void setIsserDetails(Issuer isserDetails) {
		this.isserDetails = isserDetails;
	}
	
	
}
