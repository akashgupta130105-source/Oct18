package com.School;

public class Person1 {

	public Person1() {
		System.out.println(" Person1 of constructor called");
	}
}
	


public class Employee extends Person1{

	public Employee() {
		System.out.println("Employee of constructor called");
	}
	
	
}
public class Manger extends Employee{

	public Manger() {
		System.out.println("Manger of constructor called");
	}
	
}

