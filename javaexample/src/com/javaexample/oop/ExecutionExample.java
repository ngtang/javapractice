package com.javaexample.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExecutionExample {
	/*
	 * Phan So tru, nhan, chia, rut gon, nhap, so sanh TDD nhap, xuat.
	 * 
	 * Note: 2 contructor private get/set this
	 */

	public static void main(String[] agrs) {
		Student a = new Student("Tran","A",25);
		Student b = new Student("Nguyen","B",27);
		System.out.println("Check if a=b: "+ a.equals(b));
		b.changeInfo("Tran","A",25);
		System.out.println("Check if a=b: "+ a.equals(b));
		System.out.print(b);
//		IDongVat conCa = new ConCa();
//		IDongVat conCho = new ConCho();
//		conCa.diChuyen(null);
//		conCho.diChuyen(null);
		// PhanSo a = new PhanSo(); //a is an instance
		//
		// PhanSo b = new PhanSo(4, 8);
		//
		// PhanSo c = b.cong(a);
		// c.xuat();
		// PhanSo d = new PhanSo();
		// d.nhap();
		// d=d.rutGon();
		// System.out.println("Rut gon phan so: ");
		// d.xuat();
		// ToaDoDiem a = new ToaDoDiem();
		// a.nhap();
		// a.xuat();
		// DuongTron c = new DuongTron();
		// c.nhap();
		// c.xuat();
		// System.out.print("\nChu Vi hinh tron la: " + c.getCircumference());
		// System.out.print("\nDien tich hinh tron la: " + c.getArea());
		// TamGiac d = new TamGiac();
		// d.nhap();
		// d.xuat();
		// System.out.print("\nChu Vi hinh tam giac la: " + d.getCircumference());
		// System.out.print("\nDien tich hinh tam giac la: " + d.getArea());
		// MangPhanSo e = new MangPhanSo();
		// e.nhap();
		// e.xuat();
		// e.phanTuLonNhat();
		// CongNhan CNFT = new CongNhanFullTime();
		// CNFT.nhap();
		// CongNhan CNPT = new CongNhanPartTime();
		// CNPT.nhap();
		// CNFT.xuat();
		// CNPT.xuat();
		// List<CongNhan> DSCN = new ArrayList<CongNhan>();
		// CongNhan CN;
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Nhap so cong nhan: ");
		// int size= Integer.parseInt(sc.nextLine());
		// for (int i=0; i<size;i++)
		// {
		// System.out.print("\nCong nhan FullTime nhap F, PartTime nhap P: ");
		// String str = sc.nextLine().toLowerCase();
		// if(str.equals("f"))
		// {
		// CN = new CongNhanFullTime();
		// CN.nhap();
		// }
		// else
		// {
		// CN = new CongNhanPartTime();
		// CN.nhap();
		// }
		// DSCN.add(CN);
		// }
		//
		// for(CongNhan ele:DSCN)
		// {
		// ele.xuat();
		// }
		
		
//		List<ICongNhan> DSCongNhan = new ArrayList<ICongNhan>();
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhap so cong nhan: ");
//		int size = Integer.parseInt(sc.nextLine());
//		ICongNhan congNhan;
//		for (int i = 0; i < size; i++) {
//			System.out.print("\nCong nhan FullTime nhap F, PartTime nhap P: ");
//			String str = sc.nextLine().toLowerCase();
//			if (str.equals("f")) {
//				congNhan = new CNFullTime();
//			} else {
//				congNhan = new CNPartTime();
//			}
//			congNhan.nhap();
//			DSCongNhan.add(congNhan);
//		}
//
//		for (ICongNhan ele : DSCongNhan) {
//			ele.xuat();
//		}
	}
}
