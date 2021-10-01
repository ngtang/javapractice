package com.javaexample.collection;

public class HocSinh {
	private String hoTen = new String();
	private int tuoi;
	public HocSinh(String ht, int t)
	{
		this.hoTen=ht;
		this.tuoi= t;
	}
	public void xuat()
	{
		System.out.println("Hoc Sinh " + this.hoTen +", " + this.tuoi +" tuoi.");
	}
//	public int compareTo(HocSinh hs) {  

//	    return this.hoTen.compareTo(hs.hoTen);  
//	    }  
//	}  
}
