//Create a Student class with private field name, age, and marks,Add validation so that age cannot be negative and marks must be between 0 to 100;

package com.School;

public class Student {
	private String name;
	private int age;
	private int  marks;
	public Student(String name, int age, int marks) {
		super();
		this.name = name;
		setAge(age);
		setMarks(marks);
	}
	
	

	public int getAge() {
		return age;
	}
	
	

	public void setAge(int age) {
		
		if(age <0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		
		if(marks<0 || marks >100){
			throw new IllegalArgumentException("Marks is in between 0 to 100");
			
		}
		this.marks = marks;
	}

	

}
