package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// TODO Auto-generated method stub
		 //insert query chalane jaa rhe hai...
        String query = "insert into student(id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int change(Student student) {
		// updating data
        
		String query = "update student set name=?, city=? where id = ?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}

	public int delete(int studentId) {
		//delete operation
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}

	public Student getStudent(int studentId) {
		// Selecting sigle student data   For this watch JDBC VIDEO 8
		String query = " select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper , studentId);
		return student;
	}

	public List<Student> getAllStudents() {
		//Selecting multiple student data   FOR this watch JDBC VIDEO 9
		String query = " select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		
		return students;
	}

	
}
