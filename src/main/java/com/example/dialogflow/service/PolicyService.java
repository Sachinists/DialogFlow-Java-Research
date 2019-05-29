package com.example.dialogflow.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dialogflow.beans.Issuer;
import com.example.dialogflow.beans.NewPolicy;
import com.example.dialogflow.beans.Policy;
import com.example.dialogflow.beans.PolicyType;

@Service
public class PolicyService {

	NewPolicy one = new NewPolicy("Health Insurance Policy",
			"This is a health insurance policy for living a happy healty life");
	NewPolicy two = new NewPolicy("Car Insurance Policy",
			"This is a Car insurance policy for living a happy healty life away from garage.");
	NewPolicy three = new NewPolicy("Education Policy", "This is a insurance policy for the future plan of children");

	Issuer issuer = new Issuer("Debjyoti", "10-09-1996", "Asansol", 8436476635l);
	Issuer issuer2 = new Issuer("Amay", "29-11-1996", "Kolkata", 8436476635l);
	
	Policy policy = new Policy(101, one, issuer, 10000000, 20833, 
			LocalDate.parse("2014-08-10"), LocalDate.parse("2054-08-10"), 40, PolicyType.MONTHLY);
	
	Policy policy2 = new Policy(102, two, issuer2, 1000000, 25000, 
			LocalDate.parse("2018-08-10"), LocalDate.parse("2028-08-10"), 10, PolicyType.QUATERLY);
	
	Policy policy3 = new Policy(103, three, issuer, 2500000, 83333, 
			LocalDate.parse("2019-08-10"), LocalDate.parse("2034-08-10"), 15, PolicyType.HALFYEARLY);
	
	public Policy getPolicyByIdDOB(String pid,String dob) {
		if(Integer.parseInt(pid) == policy.getPolicyNumber() && dob.equals(policy.getIsserDetails().getDob())) {
			return policy;
		}else if (Integer.parseInt(pid) == policy2.getPolicyNumber() && dob.equals(policy2.getIsserDetails().getDob())) {
			return policy2;
		}else if (Integer.parseInt(pid) == policy3.getPolicyNumber() && dob.equals(policy3.getIsserDetails().getDob())) {
			return policy3;
		}
		return null;
	}

	public List<NewPolicy> getAllPolicy(){
		List<NewPolicy> list = new ArrayList<>();
		list.add(one);
		list.add(two);
		list.add(three);
		return list;
	}
}
