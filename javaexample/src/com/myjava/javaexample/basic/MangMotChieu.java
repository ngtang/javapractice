package com.myjava.javaexample.basic;

import java.util.Scanner;

public class MangMotChieu {

	public static int a[] = { 1, 2, 3, 4, 5, 6, 7 }; // { -5, 2, -6, 8, 3, 9, 1, 4 };
	public static int n = a.length;

	public static void main(String[] agrs) {
		// nhap();
		// xuat();
		// System.out.println("Liet ke so chan: ");
		// lietKeSoChan();
		// System.out.println("\nVi tri so am: ");
		// viTriSoAm();
		// System.out.println("\nGia tri lon nhat trong mang: " + giaTriLonNhat());
		// System.out.println("\nSo Chan cuoi cung trong mang: " + soChanCuoiCung());
		// System.out.println("\nVi tri cua so nho nhat trong mang: " + viTriNhoNhat());
		// System.out.println("\nVi tri cua so hoan thien trong mang: " + bai57());
		// System.out.println("\nso co can trai dau trong mang: ");
		// bai82();
		// int x = 5;
		// System.out.println("\nso xa " + x + " nhat trong mang: ");
		// bai92(x);
		// System.out.println("\ntong cac so co hang chuc la 5 trong mang: " +
		// bai100(a));
		// System.out.println("Mang chi chua so chan: " + bai124(a));
		/*
		 * a = bai138(1, x); n = a.length; xuat();
		 */

		/*
		 * bai130(); System.out.println("\nMang sau khi sap xep:"); xuat();
		 */

		/*
		 * int y = 4; a = bai139(y);
		 * System.out.println("\nMang tang dan sau khi them gia tri:"); xuat();
		 * 
		 * y = 3; a = bai140(y, a); System.out.println("\nMang sau khi xoa:"); n =
		 * a.length; xuat();
		 */

		/*
		 * System.out.println("\nMang sau khi xoa cac gia tri lon nhat:"); a = bai141();
		 * xuat();
		 */

		/*
		 * System.out.println("\nMang sau khi xoa cac gia tri am:"); a = bai142();
		 * xuat();
		 */
		inmang(a);
	}

	public static void inmang(int a[]) {
		int n=a.length;
		for (int i = 0; i < n; i++) {
			System.out.print("\ni=" + i + ":");
			for (int j = 0; j < n - i; j++) {
				if (i == 0) {
					System.out.print(a[j] + " ");
				} else {
					int so = a[j];
					for (int l = j + 1; l < i + j; l++) {
						so = so * 10 + a[l];
					}
					for (int k = j + i; k < n; k++) {
						System.out.print(so * 10 + a[k] + " ");
					}
				}
			}
		}

	}

	public static void nhap() {
		System.out.print("Nhap n: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
	}

	public static void xuat() {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void lietKeSoChan() {
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}

		}
	}

	public static void viTriSoAm() {
		for (int i = 0; i < n; i++) {
			if (a[i] < 0) {
				System.out.print(+i + " ");
			}

		}
	}

	public static int giaTriLonNhat() {
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = a[i] > max ? a[i] : max;

		}
		return max;
	}

	public static int soChanCuoiCung() {
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] % 2 == 0) {
				return a[i];
			}
		}
		return 1;
	}

	public static int viTriNhoNhat() {
		int min = a[0];
		int vt = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
				vt = i;
			}
		}
		return vt;
	}

	public static int bai57() {
		for (int i = n - 1; i >= 0; i--) {
			if (Basic.bai30(a[i])) {
				return i;
			}
		}
		return 1;
	}

	public static void bai82() {

		for (int i = n - 1; i >= 0; i--) {
			if (i == 0) {
				if (a[i] * a[i + 1] < 0) {
					System.out.print(a[i] + " ");
				}
			} else if (i == n - 1) {
				if (a[i] * a[i - 1] < 0) {
					System.out.print(a[i] + " ");
				}
			} else {
				if (a[i] * a[i - 1] < 0 || a[i] * a[i + 1] < 0) {
					System.out.print(a[i] + " ");
				}
			}

		}

	}

	public static void bai92(int x) {

		int h = 0;
		int h1 = 0;
		int hMax = 0;
		for (int i = 0; i < n; i++) {

			h = a[i] > x ? a[i] - x : x - a[i];

			hMax = (hMax < h) ? h : hMax;
		}
		// 8

		for (int j = 0; j < n; j++) {
			h1 = a[j] > x ? a[j] - x : x - a[j];
			if (h1 == hMax) {
				System.out.print(a[j] + " ");
			}
		}

	}

	public static int bai100(int[] a) {
		int tong = 0;
		for (int i = 0; i < n; i++) {

			if (a[i] % 100 > 49 && a[i] % 100 < 60) {

				tong += a[i];
			}

		}
		return tong;
	}

	public static boolean bai124(int[] a) {

		for (int i = 0; i < n; i++) {

			if (a[i] % 2 != 0) {

				return false;
			}

		}
		return true;
	}

	public static int[] bai138(int k, int x) {
		int[] tmparr = new int[a.length + 1];

		for (int i = 0; i < n; i++) {

			if (i == k) {
				tmparr[i] = x;
				tmparr[i + 1] = a[i];

			} else if (i < k) {

				tmparr[i] = a[i];
			} else if (i > k) {

				tmparr[i + 1] = a[i];
			}

		}
		n = tmparr.length;
		return tmparr;
	}

	public static void bai130() {
		System.out.println(n);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}

	public static int[] bai139(int x) {
		// ->k, x =>
		int[] tmparr = new int[a.length + 1];
		boolean inserted = false;
		for (int i = n - 1; i >= 0; i--) {
			if (!inserted && a[i] < x) {
				tmparr[i + 1] = x;
				tmparr[i] = a[i];
				inserted = true;
			} else if (a[i] > x) {
				tmparr[i + 1] = a[i];
				if (i == 0) {
					tmparr[i] = x;
				}

			} else {
				tmparr[i] = a[i];
			}
		}
		n = tmparr.length;
		return tmparr;

	}

	public static int[] bai140(int x, int[] b) {
		int[] tmparr = new int[b.length - 1];
		int tl = tmparr.length;
		for (int i = 0; i < tl; i++) {

			if (i == x) {
				tmparr[i] = b[i + 1];

			} else if (i < x) {

				tmparr[i] = b[i];
			} else if (i > x) {

				tmparr[i] = b[i + 1];
			}

		}

		/*
		 * 2 3 3 4 5 6 7 6 0 1 2 3 4 5 6 7 k=3 for(i=3->n;){ a[i]=a[i+1]; ] tl--;
		 */

		return tmparr;

	}

	public static int[] bai141() {
		int[] tmparr = a;
		int tl = tmparr.length;
		int i = 0;
		int max = giaTriLonNhat();
		while (i < tl) {
			if (tmparr[i] == max) {
				tmparr = bai140(i, tmparr);
				tl = tmparr.length;
			} else {
				i++;
			}
		}
		n = tmparr.length;
		return tmparr;
	}

	public static int[] bai142() {
		int[] tmparr = a;
		int tl = tmparr.length;
		int i = 0;
		while (i < tl) {
			if (tmparr[i] < 0) {
				tmparr = bai140(i, tmparr);
				tl = tmparr.length;
			} else {
				i++;
			}
		}
		n = tmparr.length;
		return tmparr;
	}

}
