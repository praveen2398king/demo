package com.springcore;

public class Student {
	private String studentId;
	private String studentName;
	private String studentAddress;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		System.out.println("Setting studentId");
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting StudentName" );
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting StudentAddress");
		this.studentAddress = studentAddress;
	}

}
