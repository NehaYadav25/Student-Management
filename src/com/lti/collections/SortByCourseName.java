package com.lti.collections;

import java.util.Comparator;

import com.lti.model.Course;

public class SortByCourseName implements Comparator<Course> {

	@Override
	public int compare(Course fromCourse, Course toCourse) {
		// TODO Auto-generated method stub
		return fromCourse.getName().compareTo(toCourse.getName());
	}

}
