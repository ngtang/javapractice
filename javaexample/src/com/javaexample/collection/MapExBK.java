package com.javaexample.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapExBK {
	private Map<Integer, HocSinh> mp = new HashMap<Integer, HocSinh>();
	private int size;

	public void nhap(){

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap do dai HashMap: ");
		size = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < size; i++) {
			System.out.print("Phan tu " + i + ", nhap key: ");

			int key = Integer.parseInt(sc.nextLine());

			System.out.print("Phan tu " + i + ", nhap ho ten HS: ");
			String hoten = sc.nextLine();

			System.out.print("Phan tu " + i + ", nhap tuoi HS: ");
			int tuoi = Integer.parseInt(sc.nextLine());

			HocSinh hs = new HocSinh(hoten, tuoi);

			mp.put(key, hs);
		}
	}

	public void xuat() {
		Set set = mp.entrySet();
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			Map.Entry mpEntry = (Map.Entry) ite.next();
			int key = (int) mpEntry.getKey();
			System.out.println("Key: " + key + ", ");
			this.mp.get(key).xuat();
			// System.out.println("Key: " + mpEntry.getKey() + ", " + mpEntry.getValue());
		}

	}

	public void them(int key, HocSinh hs) {
		this.mp.put(key, hs);
	}

	public void xoa(int key) {
		this.mp.remove(key);
	}
}
