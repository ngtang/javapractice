package com.javaexample.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapEx {
	private Map<Integer, List<HocSinh>> mp = new HashMap<Integer, List<HocSinh>>();

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap do dai HashMap: ");
		int size = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < size; i++) {
			System.out.print("Phan tu " + i + ", nhap key: ");

			int key = Integer.parseInt(sc.nextLine());
			System.out.print("Phan tu " + i + ", nhap so hoc sinh: ");

			int n = Integer.parseInt(sc.nextLine());
			List<HocSinh> listHS = new ArrayList<HocSinh>();
			for (int j = 0; j < n; j++) {
				System.out.print("Hoc Sinh " + j + ", nhap ho ten HS: ");
				String hoten = sc.nextLine();

				System.out.print("Hoc Sinh " + j + ", nhap tuoi HS: ");
				int tuoi = Integer.parseInt(sc.nextLine());

				HocSinh hs = new HocSinh(hoten, tuoi);
				listHS.add(hs);
			}

			mp.put(key, listHS);
		}
	}

	public void xuat() {
		Set set = mp.entrySet();
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			Map.Entry mpEntry = (Map.Entry) ite.next();
			int key = (int) mpEntry.getKey();
			System.out.println("Key: " + key + ": ");
			List<HocSinh> listHS = new ArrayList<HocSinh>();
			listHS = this.mp.get(key);
			for (int i = 0; i < listHS.size(); i++) {
				HocSinh HS = listHS.get(i);
				HS.xuat();
			}
			
		}
		
//Iterator -> co the them xoa khong bi null exception
		
//		Set<Entry<Integer, List<HocSinh>>> set = mp.entrySet();
//		for(Entry<Integer, List<HocSinh>> ele:set) {
//			List<HocSinh> hs = ele.getValue();
//			System.out.println("Key: " + ele.getKey() + ": ");
//			for(HocSinh h:hs) {
//				h.xuat();
//			}
//		}
	}

	public void them(int key, List<HocSinh> lisths) {
		this.mp.put(key, lisths);
	}

	public void xoa(int key) {
		this.mp.remove(key);
	}
}
