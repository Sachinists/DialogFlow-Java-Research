package com.example.dialogflow.service;

import org.springframework.stereotype.Service;

import com.example.dialogflow.beans.Issuer;
import com.example.dialogflow.beans.Policy;
import com.example.dialogflow.beans.PolicyType;

@Service
public class PolicyService {

	public Policy getPolicyByIdDOB(String pid,String dob) {
		Issuer issuer = new Issuer("Debjyoti", "10-09-1996", "Asansol", 8436476635l);
		Issuer issuer2 = new Issuer("Amay", "29-11-1996", "Kolkata", 8436476635l);
		Policy policy = new Policy("101", "Jeene k liye policy", "description", "10-09-1996", issuer,100000,1000,PolicyType.MONTHLY);
		Policy policy3 = new Policy("103", "Gadi k liye policy", "description", "10-09-1996", issuer,100000,3000,PolicyType.QUATERLY);
		Policy policy2 = new Policy("102", "Jeene k liye policy", "description", "29-11-1996", issuer2,100000,6000,PolicyType.HALFYEARLY);
		if(pid.equals(policy.getPolicyNumber()) && dob.equals(policy.getPolicyDate()))
			return policy;
		else if(pid.equals(policy2.getPolicyNumber()) && dob.equals(policy2.getPolicyDate()))
			return policy2;
		else if(pid.equals(policy3.getPolicyNumber()) && dob.equals(policy3.getPolicyDate()))
			return policy3;
		else {
			return null;
		}
	}
	
}
