package com.javaexample.oop;

public class ConCho extends DongVat implements IDongVat{

	@Override
	public void keu() {
		System.out.println("Gau Gau");
		
	}

	@Override
	public void diChuyen(String kieu) {
		if(kieu != null) {
			System.out.println("Con cho" + kieu);
		}
	}

	@Override
	public void an() {
		System.out.println("Con cho an com");
		
	}

}
