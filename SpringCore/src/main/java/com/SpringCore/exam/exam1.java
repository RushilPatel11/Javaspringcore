package com.SpringCore.exam;

import java.util.List;

public class exam1{
	private String question;
	private List<String> answer;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	public exam1(String question, List<String> answer) {
		super();
		this.question = question;
		this.answer = answer;
	}
	public exam1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "exam [question=" + question + ", answer=" + answer + "]";
	}
	

}
