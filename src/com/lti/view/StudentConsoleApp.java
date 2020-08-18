package com.lti.view;

import java.util.Scanner;

import com.lti.model.UserInterface;

public class StudentConsoleApp implements UserInterface {

	
	Scanner sc = new Scanner(System.in);
	@Override
	public void showFirstScreen() {
	
		System.out.println("******Welcome to the LTI SMS*********");
		System.out.println("Tell us who you are:");
		System.out.println("1.Student \n 2.Admin");
		int ch = sc.nextInt();
		
		switch(ch){
		
		
		case 1:
		     showStudentScreen();
		     break;
		     
		case 2:
			  showAdminScreen();
			  break;
			  
	    default: 
	    	System.out.println("Invalid choice");
	    	
		
		}
		
	}

	@Override
	public void showStudentScreen() {
		System.out.println("Select an option");
		System.out.println("1.Register  \n2.View all courses   \n3.Enroll for a course:");
		
		int ch= sc.nextInt();
		switch(ch){
		case 1:
			
			showStudentRegistrationScreen();
			break;
			
			
		case 2:
			
			 showAllCoursesScreen();
			 break;
			 
		case 3:
			 enrollForACourse();
			 break;
		}
	}

	@Override
	public void showAdminScreen() {
		// TODO Auto-generated method stub
		
		System.out.println("Select an option");
		System.out.println("1.Show all students  \n2.Introduce new courses   \n3.Show all course: \n4.Show all enrollments");
		
		int ch= sc.nextInt();
		switch(ch){
		case 1:
			
					showAllStudentsScreen();
					break;
		
		case 2:
			
					introduceNewCourseScreen();
					break;
					
		case 3:
			        showAllCoursesScreen();
			        break;
			        
		case 4:
			
			        showAllEnrollments();
			        break;
			        
	    
		}
		 
		 
	}

	@Override
	public void showAllStudentsScreen() {
		 
	}

	@Override
	public void showStudentRegistrationScreen() {
		 
	}

	@Override
	public void introduceNewCourseScreen() {
		
	}

	@Override
	public void showAllCoursesScreen() {
		
	}
	
		@Override
	public void enrollForACourse() {
		
		
	}

		@Override
		public void showAllEnrollments() {
			 
			
		}

}
