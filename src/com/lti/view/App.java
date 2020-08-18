package com.lti.view;
import java.time.LocalDate;
import java.util.Scanner;

import com.lti.controller.AppEngine;
import com.lti.controller.Info;
import com.lti.model.Course;
import com.lti.model.Enroll;
//import com.lti.model.Customer;
import com.lti.model.Student;

public class App {
	
	public static void main(String args[]){
		
		AppEngine appEngine = new AppEngine();
	
		
		//getStudentDetails1();
		//getCourseDetails();
		//getCourseDetails1();
		
		//1.Add a new course
		//2.Add a student
		//3.enrollments
		
		
		//create 5 courses.
		//create 5 students
		//add 5 enrollments
		//display all the enrollments, courses and students
		
		Course c1 =  new Course(1,"Java",1,2100);
		Course c2 =  new Course(2,"C#",2,2200);
		Course c3 =  new Course(3,"C",8,2008);
		Course c4 =  new Course(4,"C++",6,3000);
		Course c5 =  new Course(5,"PHP",4,8000);
		
		appEngine.introduce(c1);
		appEngine.introduce(c2);
		appEngine.introduce(c3);
        appEngine.introduce(c4);
        appEngine.introduce(c5);
		
		
		
		Student st1 = new Student(101, "John", LocalDate.of(1999, 2, 16));
		Student st2 = new Student(102, "Sheldon", LocalDate.of(1995, 8, 16));
		Student st3 = new Student(103, "Amy", LocalDate.of(1993, 2, 6));
		Student st4 = new Student(104, "Penny", LocalDate.of(1994, 12, 31));
		Student st5 = new Student(105, "Leonard", LocalDate.of(1996, 2, 16));
		
		appEngine.register(st1);
		appEngine.register(st2);
		appEngine.register(st3);
		appEngine.register(st4);
		appEngine.register(st5);
		
		appEngine.enroll(st1, c1);
		appEngine.enroll(st2, c2);
		appEngine.enroll(st3, c3);
		appEngine.enroll(st4, c5);
		appEngine.enroll(st5, c4);
		
		
		System.out.println("List of courses");
		Course[] course = appEngine.listOfCourses();
		
		Info info = new Info();
		
		for(int i= 0; i<course.length;i++){
			info.display(course[i]);
		}
		
		System.out.println("List of students");
		Student[] students = appEngine.listOfStudent();
		
		for(Student st:students){
			info.display(st);
			
			
		}
		
		Enroll[] enrollments = appEngine.listOfEnrollments();
		for(Enroll enroll:enrollments){
			info.display(enroll);
		}
	}
	
	
	/*public static void getStudentDetails(){
		Student s1 =  new Student(1,"Neha", LocalDate.of(1998,6,20));
		Student s2 =  new Student(2,"John", LocalDate.of(1993,5,23));
		Student s3 =  new Student(3,"Mike", LocalDate.of(1993,6,12));
		
		
		Info info = new Info();
		info.display(s1);
		info.display(s2);
		info.display(s3);
	}
*/
	
	
	public static void getCourseDetails(){
		
		Course c = new Course(1,"Neha", 6, 1000.1 );
		Course c1 = new Course(2,"Moira", 6, 1000.2 );
		Course c2 = new Course(3,"John", 6, 1005.1 );
		
		Info info =  new Info();
		info.display(c);
		info.display(c1);
		info.display(c2);
	}
	
	public static void getStudentDetails1(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
	  
		int size = sc.nextInt();
		Student[] student = new Student[size];
		
		for(int i=0;i< student.length;i++){
			System.out.println("enter student id,student name, Date");
			int studentId = sc.nextInt();     //1
			String studentName = sc.next();    //2
			int dd = sc.nextInt();
			int mm = sc.nextInt();
			int yy = sc.nextInt();
			student[i]  = new Student(studentId, studentName, LocalDate.of(yy,mm,dd) );
	        
		 }
		
		
		for(int i=0;i<student.length;i++){
			 System.out.println(student[i].getStudentID() + " " + student[i].getStudentName()+ " " + student[i].getDateOfBirth());
		 }
		 
		
	}
	
	
public static void getCourseDetails1(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
	  
		int size1 = sc.nextInt();
		Course[] c = new Course[size1];
		
		for(int i=0;i< c.length;i++){
			System.out.println("enter student id,student name, Duration and fees");
			int ID = sc.nextInt();     //1
			String name = sc.next();    //2
			int duration = sc.nextInt(); //3
			double fees= sc.nextDouble();
			
			c[i]  = new Course(ID, name, duration, fees );
	        
		 }
		
		
		for(int i=0;i<c.length;i++){
			 System.out.println(c[i].getID() + " " + c[i].getName()+ " " + c[i].getDuration()+ " "+c[i].getFees());;
		 }
		 
		
		
	}
	
	
	
	
	
	
}
