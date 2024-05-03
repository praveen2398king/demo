package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started....." );
        
        //If you want to this way then watch JDBC Video-4
        
        //spring jdbc = JdbcTemplate    ->  JDbctemplate ki requirement hogi spring jdbc me...
		
		 ApplicationContext context = new
		 ClassPathXmlApplicationContext("com/spring/jdbc/config.xml"); //JdbcTemplate
		/* template = context.getBean("jdbcTemplate",JdbcTemplate.class);
		 * 
		 * //insert query chalane jaa rhe hai... String query =
		 * "insert into student(id,name,city) values(?,?,?)";
		 * 
		 * //fire query krne jaa rhe hai.. int result =
		 * template.update(query,326,"Uttam","Kota");
		 * 
		 * System.out.println("Number of record inserted : " + result);
		 */
        
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        Student student = new Student();
        
		/*insert
		 * student.setId(0); student.setName("John"); student.setCity("Delhi");
		 * 
		 * int result = studentDao.insert(student);
		 * System.out.println("Student added  "+result);
		 */
        
        
		/* update
		 * student.setId(0); student.setName("Shyam"); student.setCity("Noida");
		 * 
		 * int result = studentDao.change(student);
		 * System.out.println("Student update  "+result);
		 */
        
        //delete
		/*
		 * int result = studentDao.delete(0); System.out.println("Data deleted = " +
		 * result);
		 */
		/*
		 * Student student2 = studentDao.getStudent(326); System.out.println(student2);
		 */
        List<Student> students = studentDao.getAllStudents();
        for(Student s : students) {
        	System.out.println(s);
        }
    }

}
