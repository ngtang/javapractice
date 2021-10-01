package com.javaexample.oop;

public class ConCa extends DongVat implements IDongVat{

	@Override
	public void keu() {
		// TODO Auto-generated method stub
		System.out.println("Im lang nhu ca vang");
	}

	@Override
	public void diChuyen(String type) {
		System.out.println("Con ca boi");
	}

	@Override
	public void an() {
		System.out.println("Con ca an con trun");
		// TODO Auto-generated method stub
		
	}

}
