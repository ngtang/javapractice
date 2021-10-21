package com.myjava.javaexample.oop;

import java.util.Scanner;

public class DuongTron {
	private ToaDoDiem center;
	private float radius;

	public DuongTron() {
		center = new ToaDoDiem();
		this.radius = 1;
	}

	public double getCircumference() {

		return this.radius * 2 * Math.PI;
	}

	public double getArea() {

		return Math.pow(this.radius, 2) * Math.PI;
	}

	public ToaDoDiem getcenter() {
		return center;
	}

	public void setcenter(ToaDoDiem center) {
		this.center = center;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void nhap() {
		this.center.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ban kinh duong tron: ");
		this.radius = sc.nextFloat();
	}

	public void xuat() {
		System.out.print("center duong tron: ");
		this.center.xuat();
		System.out.print("Ban kinh duong tron: " + this.radius);
	}
}
