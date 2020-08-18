package com.lti.model;

public class Course implements Comparable<Course>{
	
	private int ID;
	private String name;
	private int duration;
	private double fees;
	
	
	public Course(int iD, String name, int duration, double fees) {
		super();
		this.ID = iD;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public double getFees() {
		return fees;
	}


	public void setFees(double fees) {
		this.fees = fees;
	}


	@Override
	public String toString() {
		return "Course [ID=" + ID + ", name=" + name + ", duration=" + duration + ", fees=" + fees + "]";
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + duration;
		long temp;
		temp = Double.doubleToLongBits(fees);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (ID != other.ID)
			return false;
		if (duration != other.duration)
			return false;
		if (Double.doubleToLongBits(fees) != Double.doubleToLongBits(other.fees))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public int compareTo(Course toCourse) {

		if(this.ID==toCourse.ID)
			  return 0;
		else if(this.ID>toCourse.ID)
			   return 1;
		
		
		return -1;
	}


	
	
	

}
