package com.myjava.javaexample.oop;

import java.util.Scanner;
//java collection
public class MangPhanSo {
	PhanSo[] mangPhanSo;
	int l;

	public MangPhanSo() {
		l = 1;
		mangPhanSo = new PhanSo[l];
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang phan so: ");
		this.l = sc.nextInt();
		mangPhanSo = new PhanSo[l];
		System.out.print("\nNhap phan tu cua mang phan so: ");
		for (int i = 0; i < l; i++) {
			System.out.print("\nNhap phan tu thu " + i + " :\n");
			mangPhanSo[i] = new PhanSo();
			mangPhanSo[i].nhap();
		}
	}

	public void phanTuLonNhat() {
		PhanSo max = mangPhanSo[0];
		for (int i = 0; i < l; i++) {
			max = max.soSanh(mangPhanSo[i]);
		}
		System.out.print("\n\nPhan so lon nhat trong mang:");
		max.xuat();
	}

	public void xuat() {

		for (int i = 0; i < l; i++) {
			System.out.print("\nPhan tu thu " + i + " :");
			mangPhanSo[i].xuat();
		}
	}
}
