package com.encapsulation.Student;

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setName("Adesh");
		System.out.println(s.getName());
		
		s.setAge(20);
		System.out.println(s.getAge());
		
		s.setGarde('A');
		System.out.println(s.getGrade());
	}

}
