package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


//ONETOONE Mapping

@Entity
public class Question {
	
	@Id
	private int question_id;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	private String question;
	
	@OneToOne
	@JoinColumn(name="a_id")
	private Answer answer;
	public Answer getAnswer() {
		return answer;
	}
	public Question(int question_id, String question, Answer answer) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answer = answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	

}
