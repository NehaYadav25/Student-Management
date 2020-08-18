package com.lti.collections;

import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

import com.lti.model.Course;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
	//Generic list 		
    	/*List <Integer> listNum = new ArrayList<>();
	    listNum.add(10);
	    listNum.add(40);
	    listNum.add(20);
	    listNum.add(new Integer(50));
	    Collections.sort(listNum);
	    System.out.println(listNum);
	*/
		
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(new Course(3,"Java",2,3000));
		courseList.add(new Course(2,"java",1,1500));	
		courseList.add(new Course(1,"Kotlin",2,3800));
		Collections.sort(courseList);
		//eCollections.sort(courseList, arg0);
		Collections.sort(courseList, new SortByCourseName());
		System.out.println(courseList);
		
		
		Iterator<Course> courses =courseList.iterator();
		while(courses.hasNext()){
			Course c = courses.next();
			System.out.println(c.getID()+"  "+c.getName()+" "+c.getDuration());
		}
		
		ListIterator<Course> courseLists =courseList.listIterator();
		while(courseLists.hasNext()){
			Course c = courses.next();
			System.out.println(c.getID()+"  "+c.getName()+" "+c.getDuration());
		}
		while(courseLists.hasPrevious()){
            Course c=courseLists.previous();
            System.out.println(c.getName()+" "+c.getID());
        }
		
	}

}
