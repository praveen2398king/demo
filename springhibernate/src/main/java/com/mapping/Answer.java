package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


//ONETOONE Mapping


@Entity
public class Answer {

	@Id
	private int answer_id;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answer_id, String answer) {
		super();
		this.answer_id = answer_id;
		Answer = answer;
	}
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	private String Answer;
	
	@OneToOne(mappedBy = "answer")
	@JoinColumn(name="q_id")
	private Question question;
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
}
