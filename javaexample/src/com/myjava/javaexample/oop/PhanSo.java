package com.myjava.javaexample.oop;

import java.util.Scanner;

/*
 * Object;
 * - properties/attribute -> thouc tinh; -> tinh chat tao nen doi tuong
 * - action/method/function->hanh dong; -> hanh dong cua doi tuong;
 * 
 * Car
 * ->banh xe, guong, dong co..
 * ->chay, xi nhanh, lui...
 * 
 * Dog
 * ->long, mau long, mo, tai, chan
 * ->an, di, ngu, sua, can
 * 
 * Phan so
 * ->tuSo, mauso
 * ->Cong, tru, nhan, chia
 * 
 * 4 tinh chat;
 * truu tuong -> done
 * ke thua
 * da hinh
 * bao dong -> 
 */
public class PhanSo {

	/*
	 * access modifier public -> everywhere private - > internal; protected - >
	 * internal package and inheritance
	 */
	public static int a=1;
	private int tuSo;
	protected int mauSo;

	public PhanSo() {
		this.tuSo = 1;
		this.mauSo = 2;
	}

	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	public PhanSo cong(PhanSo b) {
		PhanSo c = new PhanSo();
		c.tuSo = tuSo * b.mauSo + b.tuSo * mauSo;
		c.mauSo = mauSo * b.mauSo;
		return c;
	}

	public PhanSo tru(PhanSo b) {
		PhanSo c = new PhanSo();
		c.tuSo = tuSo * b.mauSo - b.tuSo * mauSo;
		c.mauSo = mauSo * b.mauSo;
		return c;
	}

	public PhanSo nhan(PhanSo b) {
		PhanSo c = new PhanSo();
		c.tuSo = tuSo * b.tuSo;
		c.mauSo = mauSo * b.mauSo;
		return c;
	}

	public PhanSo chia(PhanSo b) {
		PhanSo c = new PhanSo();
		c.tuSo = tuSo * b.mauSo;
		c.mauSo = mauSo * b.tuSo;
		return c;
	}

	public PhanSo rutGon() {
		PhanSo c = new PhanSo();
		c.tuSo = this.tuSo;
		c.mauSo = this.mauSo;
		int u = uocSoChung(c);
		if (u > 0) {
			c.tuSo /= u;
			c.mauSo /= u;
		}
		return c;
	}

	private int uocSoChung(PhanSo b) {
		for (int i = b.tuSo; i >= 1; i--) {
			if (b.tuSo % i == 0 && b.mauSo % i == 0) {
				return i;
			}

		}
		return 0;
	}

	public PhanSo soSanh(PhanSo b) {
		if (this.tuSo * b.mauSo > b.tuSo * this.mauSo) {
			return this;
		} else {
			return b;
		}

	}

	public void xuat() {
		System.out.print(tuSo + "/" + mauSo);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tuSo: ");
		this.tuSo = sc.nextInt();
		System.out.print("Nhap mauSo: ");
		this.mauSo = sc.nextInt();
	}

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}
}
