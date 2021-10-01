package com.javaexample.oop;

import java.util.Scanner;

public class CNPartTime extends CN implements ICongNhan{

	private float gioLam;

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		System.out.println("\nNhap thong tin cong nhan PartTime: ");
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap ID cua cong nhan: ");
		ID = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap ho ten cong nhan: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap luong cong nhan: ");
		luong = Float.parseFloat(sc.nextLine());
		System.out.print("So gio lam cong nhan: ");
		gioLam = Float.parseFloat(sc.nextLine());
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.print("\nThong tin cong nhan PartTime: ");
		System.out.println("\nID cong nhan: " + this.ID);
		System.out.println("Ho ten cong nhan: " + this.hoTen);
		System.out.println("Luong cong nhan: " + this.luong);
		System.out.println("So gio lam cong nhan: " + this.gioLam);
	}

}
