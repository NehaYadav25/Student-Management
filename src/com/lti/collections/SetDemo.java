package com.lti.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.lti.model.Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
	//Generic list 		
    	/*List <Integer> listNum = new ArrayList<>();
	    listNum.add(10);
	    listNum.add(40);
	    listNum.add(20);
	    listNum.add(new Integer(50));
	    Collections.sort(listNum);
	    System.out.println(listNum);
	
		
		
		Set<Course> courseList = new HashSet<>();
		courseList.add(new Course(3,"Java",2,3000));
		courseList.add(new Course(2,"c",1,1500));	
		courseList.add(new Course(1,"node.js",2,3800));
		
		//eCollections.sort(courseList, arg0);
		
		System.out.println(courseList);
		
		for(Course c:courseList){
			System.out.println(c.getID()+"  "+c.getName()+" "+c.getDuration());
		}
	*/	
		Set<Course> courseList1 = new TreeSet<>();
		courseList1.add(new Course(3,"Java",2,3000));
		courseList1.add(new Course(2,"c",1,1500));	
		courseList1.add(new Course(1,"node.js",2,3800));
		
		System.out.println(courseList1);
		
		for(Course c:courseList1){
			System.out.println(c.getID()+"  "+c.getName()+" "+c.getDuration());
		}
		
		Iterator<Course> courses = courseList1.iterator();
		
		while(courses.hasNext()){
			Course c = courses.next();
			System.out.println();
		}
		
	}

}
