package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

//Inserting data to database using spring jdbc WATCH VIDEO - 4 13:00

public interface StudentDao {
	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(int studentId);
	
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudents();
	

}
