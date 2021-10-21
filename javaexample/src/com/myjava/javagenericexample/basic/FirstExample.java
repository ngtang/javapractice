package com.myjava.javagenericexample.basic;

public class FirstExample {
	public Object a;

	public void set(Object o) {
		a = o;
	}

	public Object get() {
		return a;
	}
	public static void main(String arg[]) {
		FirstExample f = new FirstExample();
		f.set(10);
		System.out.println("First time is Interger: " + f.get());
		
		f.set("Text");
		System.out.println("Second time is String: " + f.get());
	}
}
