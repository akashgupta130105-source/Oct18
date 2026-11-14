package com.School;

class Person {
    Person() {
        System.out.println("Person constructor called");
    }
}

class Employee extends Person {
    Employee() {
        System.out.println("Employee constructor called");
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  b                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
class Manager extends Employee {
    Manager() {
        System.out.println("Manager constructor called");
    }
}

public class void  Main {
    public static void main(String[] args) {
        new Manager();
    }
}
	

