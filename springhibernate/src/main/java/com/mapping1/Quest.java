package com.mapping1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// ONETOMANY Mapping


@Entity
public class Quest {
	@Id
	private int questionId;
	private String questions;
	
	@OneToMany(mappedBy = "questions")
	private List<Ans> answers;
	public Quest(int questionId, String questions, List<Ans> answers) {
		super();
		this.questionId = questionId;
		this.questions = questions;
		this.answers = answers;
	}
	public Quest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public List<Ans> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Ans> answers) {
		this.answers = answers;
	}

}
