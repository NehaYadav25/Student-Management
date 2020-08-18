package com.lti.controller;


import com.lti.model.Course;
import com.lti.model.Enroll;
import com.lti.model.Student;


//import com.lti.controller.Studentmang;

public class Info {
	/*public void display(Student s)
	{
		//Student sc = new Student(1,"Neha",LocalDate.now());
		System.out.println(s.getStudentID()+ " "+ s.getStudentName()+ " "+ s.getDateOfBirth());
	}
	*/
	public void display(Course course){
		
		
		System.out.println(course.getID()+" "+course.getName()+" "+ course.getDuration()+" "+course.getFees());		
		
	}
	
	public void display(Student students){
		
		System.out.println(students.getStudentID()+" "+ students.getStudentName()+" "+students.getClass()+" "+ students.getDateOfBirth());
		
	}
	
	public void display(Enroll enroll){
		Student student = enroll.getStudent();
		Course course = enroll.getCourse();
		System.out.println(student.getStudentID()+ " "+ student.getStudentName()+ " "+ student.getClass()+" "+ student.getDateOfBirth());
	}
}
