package edu.handong.analysis.datamodel;

public class Student {
	
	private String name;

	
	public Student(String name) {
		this.name = name;
	}
	
	public Student() {
		name = "noname";
	}
	
	public String getName() {
		return name;
	}
	

}
