package com.example.dialogflow.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dialogflow.beans.QuesAns;

@Service
public class TempQuesAns {

	public List<QuesAns> getALLQuestion() {
		List<QuesAns> allQuestion = new ArrayList<>();
		List<String> one = new ArrayList<>();
		one.add("Hufflepuff");
		one.add("Ravenclaw");
		one.add("Gryffindor");
		QuesAns q1 = new QuesAns("Which house was Colin Creevey sorted into?",one,"Gryffindor");
		List<String> two = new ArrayList<>();
		two.add("Slice");
		two.add("Burn");
		two.add("Choke");
		QuesAns q2 = new QuesAns("What does the Sectumsempra do to an opponent?",two,"It's slices and maims the target as if they are being cut by an invisible sword");
//		QuesAns q3 = new QuesAns();
//		QuesAns q4 = new QuesAns();
//		QuesAns q5 = new QuesAns();
		allQuestion.add(q1);
		allQuestion.add(q2);
		return allQuestion;
		
	}
}
