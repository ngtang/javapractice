package com.javaexample.oop;

import java.util.Scanner;

//Sub-class
public class CongNhanFullTime extends CongNhan implements ICongNhan, IDongVat{
	
	private float thuong;


	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		System.out.println("Nhap thong tin cong nhan FullTime: ");
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap ID cua cong nhan: ");
		ID = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap ho ten cong nhan: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap luong cong nhan: ");
		luong = Float.parseFloat(sc.nextLine());
		
		System.out.print("Nhap thuong cong nhan: ");
		thuong = Float.parseFloat(sc.nextLine());
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.print("\nThong tin cong nhan FullTime: ");
		System.out.println("\nID cong nhan: " + this.ID);
		System.out.println("Ho ten cong nhan: " + this.hoTen);
		System.out.println("Luong cong nhan: " + this.luong);
		System.out.println("Thuong cong nhan: " + this.thuong);
	}

	@Override
	public void keu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diChuyen(String type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void an() {
		// TODO Auto-generated method stub
		
	}
}
