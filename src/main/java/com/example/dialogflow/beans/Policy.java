package com.example.dialogflow.beans;

import java.time.LocalDate;

public class Policy {

	private int policyNumber;
	private NewPolicy newPolicy;
	private Issuer isserDetails;
	private int policyAmount;
	private int premium;
	private LocalDate startDate;
	private LocalDate endDate;
	private int policyTerm; // how many years of policy
	private PolicyType policyType;

	public Policy(int policyNumber, NewPolicy newPolicy, Issuer isserDetails, int policyAmount, int premium,
			LocalDate startDate, LocalDate endDate, int policyTerm, PolicyType policyType) {
		this.policyNumber = policyNumber;
		this.newPolicy = newPolicy;
		this.isserDetails = isserDetails;
		this.policyAmount = policyAmount;
		this.premium = premium;
		this.startDate = startDate;
		this.endDate = endDate;
		this.policyTerm = policyTerm;
		this.policyType = policyType;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public NewPolicy getNewPolicy() {
		return newPolicy;
	}

	public void setNewPolicy(NewPolicy newPolicy) {
		this.newPolicy = newPolicy;
	}

	public Issuer getIsserDetails() {
		return isserDetails;
	}

	public void setIsserDetails(Issuer isserDetails) {
		this.isserDetails = isserDetails;
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

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getPolicyTerm() {
		return policyTerm;
	}

	public void setPolicyTerm(int policyTerm) {
		this.policyTerm = policyTerm;
	}

	public PolicyType getPolicyType() {
		return policyType;
	}

	public void setPolicyType(PolicyType policyType) {
		this.policyType = policyType;
	}

}
