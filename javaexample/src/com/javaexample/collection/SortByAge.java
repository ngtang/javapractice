package com.javaexample.collection;

import java.util.Comparator;

import com.javaexample.oop.Student;

public class SortByAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}


}
