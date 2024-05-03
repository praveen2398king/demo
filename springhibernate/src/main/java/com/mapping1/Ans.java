package com.mapping1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


//MANYTOONE Mapping


@Entity
public class Ans {
	@Id
	private int answerId;
	private String answer;
	
	@ManyToOne
	private Quest questions;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Ans() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ans(int answerId, String answer, Quest questions) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.questions = questions;
	}

	public Quest getQuestions() {
		return questions;
	}

	public void setQuestions(Quest questions) {
		this.questions = questions;
	}
	

}
