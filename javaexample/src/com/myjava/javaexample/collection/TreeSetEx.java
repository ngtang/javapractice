package com.myjava.javaexample.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TreeSetEx {
	private Set<HocSinh> set = new HashSet<HocSinh>();

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua HashSet:");
		int size = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < size; i++) {
			System.out.print("Hoc Sinh " + i + ", nhap ho ten HS: ");
			String hoten = sc.nextLine();

			System.out.print("Hoc Sinh " + i + ", nhap tuoi HS: ");
			int tuoi = Integer.parseInt(sc.nextLine());

			HocSinh hs = new HocSinh(hoten, tuoi);
			set.add(hs);

		}

	}
	public void nhapERR() {
		HocSinh hs = new HocSinh("tran a", 20);
		set.add(hs);
		set.add(hs);
	}
	public void xuat() {
		for (HocSinh hs : set) {
			hs.xuat();
		}
	}
}
