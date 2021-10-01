package com.javaexample.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx {

	private List<Integer> al = new ArrayList<Integer>();

	private int size;

	public void nhap() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap do dai Arraylist: ");
		size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Nhap gia tri phan tu " + i + ": ");
			al.add(sc.nextInt());
		}
	}

	public void xuat() {
		System.out.print("Noi dung cua ArrayList la: ");
		for (int i = 0; i < size; i++) {
			System.out.print(this.al.get(i));
			if (i < (size - 1)) {
				System.out.print(", ");
			}
		}

	}

	public void xoa(int i) {
		this.al.remove(i);
		this.size = this.al.size();

	}

	public void them(int i, int j) {
		this.al.add(i, j);
		this.size = this.al.size();

	}

	public void themSubList(List<Integer> al1) {
		this.al.addAll(al1);
		this.size = this.al.size();

	}

	public void sua(int i, int j) {
		this.al.set(i, j);

	}

	public int viTriCuoiCung(int i) {
		return this.al.lastIndexOf(i);

	}

	public int viTriDauTien(int i) {
		return this.al.indexOf(i);

	}

	public List<Integer> traVeSubList(int i, int j) {
		return this.al.subList(i, j);
	}

	public List<Integer> getAL() {
		return al;

	}

	public void setAL(List<Integer> i) {
		this.al=i;
		this.size = this.al.size();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
