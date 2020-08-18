package com.lti.collections;

import java.util.Comparator;

import com.lti.model.Course;

public class SortByFees implements Comparator<Course> {


	@Override
	public int compare(Course arg0, Course arg1) {
		// TODO Auto-generated method stub
		
		if(arg0.getFees()==arg1.getFees())
			return 0;
		else if(arg0.getFees()>arg1.getFees())
			return 1;
		
		return 0;
	}

}
