package com.javaexample.oop;

import java.util.Scanner;

public class ToaDoDiem {
	private int x, y;

	public ToaDoDiem() {
		x = 0;
		y = 0;
	}

	public ToaDoDiem(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void xuat() {
		System.out.println("Toa do x la: " + this.x + ", toa do y la: " + this.y);

	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap toa do x: ");
		this.x = sc.nextInt();
		System.out.print("Nhap toa do y: ");
		this.y = sc.nextInt();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}
