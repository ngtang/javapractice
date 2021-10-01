package com.javaexample.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import com.javaexample.oop.Student;

public class HashSetStud {
	private List<Student> students = new ArrayList<Student>();
	
	public void create() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of student(s): ");
		int size = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < size; i++) {
			System.out.println("Input Student " + (i + 1) + " : ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Age: ");
			int age = Integer.parseInt(sc.nextLine());
			Student student = new Student(name, email, age);
			students.add(student);
		}

	}
	public void initial() {
		Student student1 = new Student("Tran An", "taan@gmail.com", 26);
		Student student2 = new Student("Nguyen Tu", "nytu@gmail.com", 25);
		Student student3 = new Student("Nguyen Tu", "nytu@gmail.com", 25);
		Student student4 = new Student("Khanh Ta", "kta@gmail.com", 24);
		Student student5 = new Student("Pham Thuong", "patu@gmail.com", 27);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
	}
	public void print() {
		
		Collections.sort(students, new SortByName());
		
		System.out.println("Students list: ");
		int index = 1;
		for (Student student : this.students) {
			System.out.println("Student " + index + ": ");
			System.out.println(student);
			System.out.println("-----------------");
			index++;
		}
		
	}
	
}
