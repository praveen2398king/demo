package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
             ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
             StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
             
				/*
				 * Student student = new Student(23453,"Praveen","Mirzapur");
				 * 
				 * int r = studentDao.insert(student); System.out.println("Done : "+r );
				 */
             
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             
             boolean go =true;
             while(go) {
            	 System.out.println("Press 1 for add new student");
                 System.out.println("Press 2 for display all student");
                 System.out.println("Press 3 for get detail of single student");
                 System.out.println("Press 4 for delete student");
                 System.out.println("Press 5 for update student");
                 System.out.println("Press 6 for exit");
                 
                 try {
                	 
                	 int input = Integer.parseInt(br.readLine());
						/*
						 * if(input==1) { //add a new student } else if(intput==2) { //display all
						 * Student }
						 */
                          
                	 //Switch case
                	 switch(input) {
                	 
                	 case 1:
                		 //add a new student
                		 //taking input from user
                		 System.out.println("Enter user id : ");
                		 int uId = Integer.parseInt(br.readLine());
                		 System.out.println("Enter user name : ");
                		 String uName = br.readLine();
                		 System.out.println("Enter user city : ");
                		 String uCity = br.readLine();
                		 
                		 //creating student object and setting value
                		 Student s = new Student();
                		 s.setStudentId(uId);
                		 s.setName(uName);
                		 s.setCity(uCity);
                		 
                		 //saving object into database by calling studentdao insert
                		 int r = studentDao.insert(s);
                		 System.out.println(r + " Student added");
                		 System.out.println("**********************");
                		 System.out.println();
                		 
                		 break;
                	 
                	 case 2:
                	 //display all stduent
            			 System.out.println("*****************");

                		 List<Student> allStudent = studentDao.getAllStudent();
                		 for(Student st : allStudent) {
                			 System.out.println("Id : " + st.getStudentId());
                			 System.out.println("Name : " + st.getName());
                			 System.out.println("City : " + st.getCity());
                			 System.out.println("____________________________");

                		 }
            			 System.out.println("*****************");

                	 break;
                	 
                	 case 3:
                		 //detail of single student
                		 System.out.println("Enter user id : ");
                		 int userId = Integer.parseInt(br.readLine());
                		 Student student = studentDao.getStudent(userId);
                		 System.out.println("Id : " + student.getStudentId());
            			 System.out.println("Name : " + student.getName());
            			 System.out.println("City : " + student.getCity());
            			 System.out.println("____________________________");
                		 
                		 break;
                		 
                	 case 4:
                		 //delete a student
                		 System.out.println("Enter user id : ");
                		 int usId = Integer.parseInt(br.readLine());
                		 studentDao.deleteStudent(usId);
                		 System.out.println("That student deleted ");
                		 break;
                	 
                	 case 5:
                		 //update a student
                		 System.out.println("Enter user id : ");
                		 int Id = Integer.parseInt(br.readLine());
                		 Student sd = new Student();
                		 System.out.println("Enter new student name: ");
                		 String name = br.readLine();
                		 System.out.println("Enter new student city : ");
                		 String city = br.readLine();
                		 sd.setStudentId(Id);
                		 sd.setName(name);
                		 sd.setCity(city);
                		 studentDao.updateStudent(sd);
                		 System.out.println("Student data is updated ");
                		 System.out.println("______________________");
                		 break;
                	 
                	 case 6:
                		 //exit
                		 go=false;
                		 break;
                	 
                	 }
                 }
                 catch(Exception e) {
                	 System.out.println("Invalid Input : Try with another one!!");
                	 System.out.println(e.getMessage());
                 }
             }
             System.out.println("Thank you for learning me :-)");
    }
}
