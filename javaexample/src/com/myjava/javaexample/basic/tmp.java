package com.myjava.javaexample.basic;

import java.util.Date;


public class tmp {
	String name;
	int age;

	tmp() {
	}

	tmp(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
//		tmp t = new tmp();
//		// t.in();
//		// t.convert();
//		// System.out.print(t.dequigiaithua(0));
//		t.Fibo(10);
		String email = "abc@123";
		String emailPart1 = email.substring(0, email.indexOf("@"));
		String emailPart2 = email.substring(email.indexOf("@") + 1, email.length());
		System.out.println(emailPart1+ "----"+emailPart2);
	}

	int dequigiaithua(int a) {
		int d = 1;
		if (a <= 1) {
			return a == 1 ? 1 : 0;
		} else {
			d *= a * dequigiaithua(a - 1);
		}
		return d;
	}

	/* 1 1 2 3 5 */
	void dequiFibo(int n) {
		
	}
	void Fibo(int n) {
		if (n == 1) {
			System.out.print(1);
		} else {
			int f1 = 0;
			int f2 = 0;
			for (int i = 1; i <= n; i++) {
				f2 = i == 1 ? 1 : f1 + f2;
				f1 = i <= 1 ? 0 : f2-f1;
				

				System.out.print(" " + f2);
			}
		}
	}

	void convert() {
		// char[] a = this.arrData[0].toCharArray();
		String c = "";
		int len = this.arrData[0].length();
		for (int i = len - 1; i >= 0; i--) {
			c += this.arrData[0].charAt(i);
			// System.out.print(this.arrData[i]);
		}
		System.out.print(c);
	}

	String[] arrData = { "Alpha", "Beta", "Gamma", "Delta", "Sigma" };

	public void a() {
		for (String strTemp : arrData) {

			System.out.println(strTemp);

		}
	}

	public void in() {
		Date d = new Date();
		System.out.println(d);
	}

}
