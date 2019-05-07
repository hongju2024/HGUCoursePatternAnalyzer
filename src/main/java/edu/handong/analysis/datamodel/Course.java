package edu.handong.analysis.datamodel;

public class Course {
	
	private String courseName;

	public Course(String name){
		courseName = name;
	}
	
	public Course() {
		courseName = "noname";
	}
	
	public String getCourseName() {
		return courseName;
	}

}
