package com.myjava.javagenericexample.basic;

public class Student{
	public int id;
	public String name;
	public String phone;

	public Student(int id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "id: "+this.id+" - name: "+this.name+" - phone: "+this.phone;
	}
}
