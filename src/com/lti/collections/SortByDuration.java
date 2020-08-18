package com.lti.collections;

import java.util.Comparator;

import com.lti.model.Course;


public class SortByDuration implements Comparator<Course> {

	@Override
	public int compare(Course arg0, Course arg1) {
		// TODO Auto-generated method stub
		
		if(arg0.getDuration()==arg1.getDuration())
			return 0;
		else if(arg0.getDuration()>arg1.getDuration())
			return 1;
		
		
		
		return -1;
	}
/*
	@Override
	public int compare(Course o1, Course o2) {
		// TODO Auto-generated method stub
		return 0;
	}


*/
}
