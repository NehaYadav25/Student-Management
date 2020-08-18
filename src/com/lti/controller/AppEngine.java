package com.lti.controller;

import java.time.LocalDate;

import com.lti.model.Course;
import com.lti.model.Enroll;
import com.lti.model.Student;

public class AppEngine {
	Course[] courses = new Course[5];
	Student[] students = new Student[5];
	Enroll[] enrollments = new Enroll[5];
	
	int courseIndex = 0, studentIndex = 0, enrollIndex = 0;
	
		public void introduce(Course course){
			if(courseIndex < courses.length){
				courses[courseIndex] = course;	//Receive course from Course class and put in courses's array
				courseIndex++;
			}
		}
		public void register(Student student){
			if(studentIndex < students.length){
				students[studentIndex] = student;	//Receive student and store in student's object array
				studentIndex++;
				
			}
			
			else 
				System.out.println("No more students to add");
		}
		
		public Student[] listOfStudent(){
			return students;		//
		}
		
		public Course[] listOfCourses(){
			return courses;
		}
		
		public void enroll(Student student, Course course){
			
			if(enrollIndex <  enrollments.length){
			enrollments[enrollIndex] = new Enroll(student,course,LocalDate.now());
			enrollIndex++;
			}
			else{
				System.out.println("No ore enrollment allowed");
			}
			
		}
		
		public Enroll[] listOfEnrollments(){
			return enrollments;
		}
		
		
}
