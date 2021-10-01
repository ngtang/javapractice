package com.javaexample.basic;

import java.util.Scanner;

public class MangHaiChieu {

	public static int[][] a = { { 1, 3, 3 }, { 3, 7, -2 }, { 2, 6, 8 } };
	public static int h = a.length;
	public static int c = a[0].length;
	public static int[][] tgt = { { 1, 3, 5 }, { 0, 6, 8 }, { 0, 0, 8 } };

	public static void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so hang:");
		h = sc.nextInt();
		System.out.print("Nhap so cot:");
		c = sc.nextInt();
		a = new int[h][c];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print("Nhap a[" + i + "][" + j + "]: ");
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}

	public static void xuat(int[][] b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int bai154(int x) {
		int s = 0;
		for (int i = 0; i < h; i++) {
			s += a[i][x];
		}
		return s;
	}

	public static int bai155(int x) {
		int s = 0;
		for (int i = 0; i < c; i++) {
			s += a[x][i];
		}
		return s;
	}

	public static int bai167(int x) {
		int s = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < c; j++) {
				s += a[i][j] == x ? 1 : 0;
			}

		}
		return s;
	}

	public static int bai185() {
		int s = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < c; j++) {

				s = a[i][j] > s ? a[i][j] : s;
			}

		}
		return s;
	}

	public static void bai207() {

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < c; j++)
				for (int l = i; l < h; l++) {
					for (int k = 0; k < c; k++) {
						if ((l == i && k > j) || l > i) {
							if (a[i][j] > a[l][k]) {
								int tmp = a[i][j];
								a[i][j] = a[l][k];
								a[l][k] = tmp;
							}
						}
					}
				}
		}
	}
	
	/*
	 * a[m][n] => b[n*m];
	 * sort b;
	 * b[]=>a;
	 */

	public static int bai208(int[][] b) {
		int s = 0;
		for (int i = 0; i < b.length; i++)
			for (int j = i; j < b[0].length; j++) {
				s += b[i][j];
			}
		return s;
	}
	/*
	 * if(i< j)
	 */

	public static int bai210(int[][] b) {
		int s = 0;
		for (int i = 0; i < b.length; i++) {
			s += b[i][i];
		}
		return s;
	}

	public static int bai212(int[][] b) {
		int s = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < i; j++) {
				if (i + (i - j) < b[0].length) {
					s += (b[i][j] == b[i][2 * i - j]) ? 1 : 0;

				}
			}

		}
		return s;
	}
	public static boolean bai218(int[][] b) {
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < i; j++) {
				if (i + (i - j) < b[0].length) {
					if(b[i][j] != b[i][2 * i - j]) return false;

				}
			}

		}
		return true;
	}

	// 174 185 207 208 210 212 218
	public static void main(String[] args) {
		// nhap();
		xuat(a);
		int x = 1;
		System.out.print("bai154 Tong cot " + x + ": " + bai154(x));
		System.out.print("\nbai155 Tong hang " + x + ": " + bai155(x));
		System.out.print("\nbai167 So gia tri bang " + x + ": " + bai167(x));
		System.out.print("\nbai185 So lon nhat : " + bai185());
		bai207();
		System.out.print("\nbai207 Sap xep tang dan :\n");
		xuat(a);
		System.out.println("bai212 co cac cap doi xung qua duong cheo: " + bai212(a));
		System.out.println("bai218 ma tran doi xung qua cheo chinh: " + bai218(a));
		
		System.out.print("\nMang tam giac tren :\n");
		xuat(tgt);
		System.out.println("bai208 Tong gia tri cua tam giac tren: " + bai208(tgt));
		System.out.println("bai210 Tong gia tri tren duong cheo chinh: " + bai210(tgt));
	}

}