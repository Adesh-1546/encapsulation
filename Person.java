package com.encapsulation.assgn;

/*
 * Write a Java program to create a class called Person with private instance variables name, age. and country.
 *  Provide public getter and setter methods to access and modify these variables.
 */

public class Person {
	
	private String name;
	private int age;
	private String country;
	
	// Public method to get the name of the person
	  public String getName() {
	    return name;
	  }
	  
	// Public method to set the name of the person
	  public void setName(String name) {
	    this.name = name;
	  }
	  
	// Public method to get the age of the person
	  public int getAge() {
	    return age;
	  }

	// Public method to set the age of the person
	  public void setAge(int age) {
	    this.age = age;
	  }
	  
	// Public method to get the country of the person
	  public String getCountry() {
	    return country;
	  }

	  // Public method to set the country of the person
	  public void setCountry(String country) {
	    this.country = country;
	  }
}
