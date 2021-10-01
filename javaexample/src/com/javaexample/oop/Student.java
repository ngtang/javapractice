package com.javaexample.oop;

public class Student {//implements Comparable<Student>{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String email;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, String email, int age)
	{
		this.name= name;
		this.email= email;
		this.age= age;
	}
	public void changeInfo(String name, String email, int age)
	{
		this.name= name;
		this.email= email;
		this.age= age;
		System.out.println("Change student infor successfully.");
	}
	
	@Override
	public boolean equals(Object o){
		if (o == this) { 
            return true; 
        }
		if (!(o instanceof Student || o==null)) { 
            return false; 
        }
		Student b = (Student) o;
	    if (b.name == name && b.email == email && b.age == age) return true;
	    return false;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public String toString() {
		String studentInfo= "Student's information:" + "\n"
				+ "-->Name: " + this.name + "\n"
				+ "-->Email: " + this.email + "\n"
				+ "-->Age: " + this.age;
		return studentInfo;
	}
//	@Override
//    public int compareTo(Student student) {
//        // sort student's name by ASC
//        return this.age-student.age;
//    }
}
