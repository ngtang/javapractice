package com.myjava.javaexample.basic;
import com.myjava.javaexample.oop.PhanSo; 
public class Basic {

	/*
	 * 2 months; basic knowledge; Array Matrix Collection Exception OOP->interface.
	 * 
	 * Spring MVC => website, api. Hibernate => database; Swing/ Java fx => UI
	 * 
	 * fe: html, css, javascript => web UI jquery, angularJS-1, angularJS 4.
	 * boostrap css, font-aws.
	 * 
	 */
	public static boolean isPalindrome(int x) {
		int y = x;
		int z = 0;
		while (y > 0) {
			z = z == 0 ? (z + y % 10) : (z * 10 + y % 10);
			y = y / 10;
		}
		if (z == x && x>=0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Integer a=1;
		Integer b=1;
//		if(a=b)
//		{
//			System.out.println(1);
//		}
		
		//System.out.println(isPalindrome(0));
		// bai20(6);
		// bai28(1);
		// bai29(1);
		// bai30(6);
		// bai31(9);
		// bai32(4);
		// bai35(7);
		// bai36(10);
		// bai37(101);
		// bai38(130);
		// System.out.println(bai40(13025));
		// bai27(6);
		// bai21(6);
		// bai26(6);
		// int kq = bai01(5);
		// System.out.println("bai tap 01: " + kq);
		// System.out.println("bai tap 02: " +bai02(2));
		// System.out.println("bai tap 03: " +bai03(5));
		// System.out.println("bai tap 04: " +bai04(3));
		// System.out.println("bai tap 05: " +bai05(4));
		// System.out.println("bai tap 06: " +bai06(7));
		// System.out.println("bai tap 07: " +bai07(9));
		// System.out.println("bai tap 08: " +bai08(0));
		// System.out.println("bai tap 09: " +bai09(6));
		// System.out.println("bai tap 10: " +bai10(2,0));
		// System.out.println("bai tap 11: " +bai11(3));
		// System.out.println("bai tap 12: " +bai12(2,2));
		// System.out.println("bai tap 13: " +bai13(2,2));
		// System.out.println("bai tap 14: " +bai14(2,0));
		// System.out.println("bai tap 15: " +bai15(2));
		// System.out.println("bai tap 16: " +bai16(3,5));
		// System.out.println("bai tap 17: " +bai17(1,2));

	}

	public static int bai28(int n) {
		int s = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				s += i;
			}
		}
		// System.out.println(s);
		return s;
	}

	public static void bai29(int n) {
		int s = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0 && i % 2 != 0) {
				s = i;
			}
		}
		System.out.println(s);
	}

	public static boolean bai30(int n) {

		if (n == bai28(n)) {
			return true;

		} else {
			return false;

		}

	}

	public static boolean bai31(int n) {

		// if (bai28(n) == 1 || n == 1) {
		// System.out.println(n + " la so nguyen to");
		//
		// } else {
		// System.out.println(n + " khong phai la so nguyen to");
		//
		// }
		int count = 0;
		for (int i = 2; i < n; i++) {
			count += (n % i == 0) ? 1 : 0;
		}
		if (count == 0) {
			// System.out.println(n + " la so nguyen to");
			return true;
		} else {
			// System.out.println(n + " khong phai la so nguyen to");
			return false;
		}

	}

	public static boolean bai32(int n) {

		for (int i = 0; i <= n; i++) {

			if (i * i == n) {
				return true;
			}
		}
		return false;

	}

	public static int bai35(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			if (bai01(i) < n) {
				s = i;
			}
		}
		System.out.println(s);
		return s;
	}

	public static int bai36(int n) {
		int s = 0;
		int m = n;
		while (n > 0) {
			n = n / 10;
			s++;
		}
		System.out.println(m + " co " + s + " chu so");
		return s;
	}

	public static int bai37(int n) {
		int s = 0;
		while (n > 0) {
			s += n % 10;
			n = n / 10;
		}
		return s;
	}

	public static int bai38(int n) {
		int s = 1;
		while (n > 0) {
			s *= n % 10;
			n = n / 10;
		}
		return s;
	}

	public static void bai3940(int n) {
		int sc = 0;
		int tongsc = 0;
		int sl = 0;
		int tongsl = 0;
		int m = n;
		int i;
		do {

			if (m > 0) {
				i = m % 10;
				if (i % 2 == 0) {
					sc += 1;
					tongsc += i;
				} else {
					sl += 1;
					tongsl += i;
				}
				m /= 10;

			}
		} while (m > 0);
		System.out.println(n + " co " + sc + " so chan (tong cac so chan " + tongsc + ") va " + sl
				+ " so le (tong cac chu so le " + tongsl + ")");

	}

	public static int bai39(int n) {
		int s = 0;
		while (n > 0) {
			s += ((n % 10) % 2 != 0) ? 1 : 0;
			n /= 10;
		}
		return s;
	}

	public static int bai40(int n) {
		int s = 0;
		while (n > 0) {
			s += ((n % 10) % 2 != 0) ? n % 10 : 0;
			n /= 10;
		}
		return s;
	}

	public static int bai01(int n) {
		int s = 0;
		for (int i = 0; i <= n; i++) {
			s += i;
		}
		return s;
	}

	public static double bai02(int n) {
		double s = 0;
		for (int i = 0; i <= n; i++) {
			s += i * i;
		}
		return s;
	}

	public static double bai03(int n) {
		double s = 0;
		for (double i = 1; i <= n; i++) {
			s += 1 / i;
		}
		return s;
	}

	public static double bai04(int n) {
		double s = 0;
		for (double i = 1; i <= n; i++) {
			s += 1 / (2 * i);

		}
		return s;
	}

	public static double bai05(int n) {
		double s = 0;
		for (double i = 0; i <= n; i++) {
			s += 1 / (2 * i + 1);
		}
		return s;
	}

	public static double bai06(int n) {
		double s = 0;
		for (double i = 1; i <= n; i++) {
			s += 1 / i * (i + 1);
		}
		return s;
	}

	public static double bai07(int n) {
		double s = 0;
		for (double i = 1; i <= n; i++) {
			s += i / (i + 1);

		}
		return s;
	}

	public static double bai08(int n) {
		double s = 0;
		for (double i = 0; i <= n; i++) {
			s += (2 * i + 1) / (2 * i + 2);
		}
		return s;
	}

	public static int bai09(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s = (i == 1) ? 1 : s * i;
		}
		return s;
	}

	public static double bai10(int x, int n) {
		return Math.pow(x, n);
	}

	public static int bai11(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += bai09(i);
		}

		return s;
	}

	public static double bai12(int x, int n) {
		double s = 0;
		for (int i = 1; i <= n; i++) {
			s += Math.pow(x, i);
		}

		return s;
	}

	public static int bai13(int x, int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += Math.pow(x, 2 * i);
		}

		return s;
	}

	public static double bai14(int x, int n) {
		double s = 0;
		for (int i = 0; i <= n; i++) {
			s += Math.pow(x, 2 * i + 1);
		}

		return s;
	}

	public static double bai15(int n) {
		double s = 0;
		for (int i = 1; i <= n; i++) {
			s += 1 / bai01(i);
		}

		return s;
	}

	public static double bai16(int x, int n) {
		double s = 0;
		for (int i = 1; i <= n; i++) {
			s += x / (double) bai01(i);
		}

		return s;
	}

	public static double bai17(int x, int n) {
		double s = 0;
		for (int i = 1; i <= n; i++) {
			s += Math.pow(x, i) / (double) bai09(i);
		}

		return s;
	}

	public static void bai20(int n) {

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void bai21(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				s += i;
			}

		}
		System.out.println(s);
	}

	public static int bai26(int n) {
		int s = 1;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i % 2 == 1) {
				s *= i;
			}

		}
		System.out.println(s);
		return s;
	}
}
