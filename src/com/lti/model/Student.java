package com.lti.model;

import java.time.LocalDate;
import com.lti.controller.Info;

public class Student {
	
	// TODO Auto-generated method stub
			private int studentID;
			private String studentName;
			private LocalDate dateOfBirth;
			public Student(int studentID, String studentName, LocalDate dateOfBirth) {
				super();
				this.studentID = studentID;
				this.studentName = studentName;
				this.dateOfBirth = dateOfBirth;
			}
			public int getStudentID() {
				return studentID;
			}
			public void setStudentID(int studentID) {
				this.studentID = studentID;
			}
			public String getStudentName() {
				return studentName;
			}
			public void setStudentName(String studentName) {
				this.studentName = studentName;
			}
			public LocalDate getDateOfBirth() {
				return dateOfBirth;
			}
			public void setDateOfBirth(LocalDate dateOfBirth) {
				this.dateOfBirth = dateOfBirth;
			}
			
			

}
