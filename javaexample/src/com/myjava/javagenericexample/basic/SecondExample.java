package com.myjava.javagenericexample.basic;

public class SecondExample {

	public static void main(String[] args) {
		Student st = new Student(1, "Ngoc", "999");
		Response<Student> rs1  = new Response<Student>();
		rs1.setData(st);
		System.out.println("RS1: "+rs1.getData());
		
		User us = new User(2, "Admin", "admin@admin.com");
		Response<User> rs2 = new Response<User>();
		rs2.setData(us);
		System.out.println("RS2: "+rs2.getData());
		
	}

}
