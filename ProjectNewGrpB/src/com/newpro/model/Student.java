package com.newpro.model;

public class Student {
	
	//instance variables
	private Integer studentId;
	private String studentName;
	private Integer marks;
	
	//default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Student(Integer studentId, String studentName, Integer marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}


	public Student(String studentName, Integer marks) {
		super();
		this.studentName = studentName;
		this.marks = marks;
	}


	public Integer getStudentId() {
		return studentId;
	}


	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Integer getMarks() {
		return marks;
	}


	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	//to String
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", marks=" + marks + "]";
	}
	
	
	
	

}
