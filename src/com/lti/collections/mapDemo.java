package com.lti.collections;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.lti.model.Course;
import com.lti.model.Student;

public class mapDemo {
	
	public static void main(String[] args) {
		Map<Integer,String> studentInfo
		= new TreeMap<>();
		Map <Integer, String> credentials 
		= new HashMap<>();
		
		Map<Student,Course> enroll
		=  new HashMap<Student, Course>();
		  
		  
		  enroll.put(new Student(1,"John",LocalDate.now()),
				  new Course(3,"C++",3,4500));
		  enroll.put(new Student(2,"Johnny",LocalDate.now()),
				  new Course(3,"C++",3,4500));
		  enroll.put(new Student(3,"James",LocalDate.now()),
				  new Course(3,"C++",1,4100));
		 /* 
		  for(Map.Entry<Student, Course>   entry:enroll.entrySet()){
			  Student st = entry.getKey();
			  Course cs= entry.getValue();
			  System.out.println(st.getStudentName()+" "+cs.getName());
		  }*/
		  
		  Iterator<Map.Entry<Student,Course>>
		   			items = enroll.entrySet().iterator();
		  while(items.hasNext()){
			  Map.Entry<Student, Course> entry
			  		=items.next();
			  
			  Student st = entry.getKey();
			  Course cs= entry.getValue();
			  System.out.println(st.getStudentName()+" "+cs.getName());
	
			  System.out.println(entry.getKey());
			  System.out.println(entry.getValue());
		  
		  }
		
	}

}
