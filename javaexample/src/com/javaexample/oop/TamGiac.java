package com.javaexample.oop;

public class TamGiac {
	private ToaDoDiem dinh1;
	private ToaDoDiem dinh2;
	private ToaDoDiem dinh3;

	public TamGiac() {
		dinh1 = new ToaDoDiem();
		dinh2 = new ToaDoDiem();
		dinh3 = new ToaDoDiem();
	}

	public double getCircumference() {

		double canhA = this.doDaiCanh(dinh1, dinh2);
		double canhB = this.doDaiCanh(dinh1, dinh3);
		double canhC = this.doDaiCanh(dinh2, dinh3);
		return canhA + canhB + canhC;
	}

	public double getArea() {

		double p;
		double canhA = this.doDaiCanh(dinh1, dinh2);
		double canhB = this.doDaiCanh(dinh1, dinh3);
		double canhC = this.doDaiCanh(dinh2, dinh3);
		p = (canhA+canhB+canhC)/2;
		return Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));
	}

	private double doDaiCanh(ToaDoDiem a, ToaDoDiem b) {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}

	public void nhap() {
		System.out.println("Nhap toa do dinh thu nhat cua tam giac");
		this.dinh1.nhap();
		System.out.println("Nhap toa do dinh thu hai cua tam giac");
		this.dinh2.nhap();
		System.out.println("Nhap toa do dinh thu ba cua tam giac");
		this.dinh3.nhap();
	}

	public void xuat() {
		System.out.print("Toa do dinh thu nhat cua tam giac: ");
		this.dinh1.xuat();
		System.out.print("Toa do dinh thu hai cua tam giac: ");
		this.dinh2.xuat();
		System.out.print("Toa do dinh thu ba cua tam giac: ");
		this.dinh3.xuat();
	}

	public ToaDoDiem getDinh1() {
		return dinh1;
	}

	public void setDinh1(ToaDoDiem dinh1) {
		this.dinh1 = dinh1;
	}

	public ToaDoDiem getDinh2() {
		return dinh2;
	}

	public void setDinh2(ToaDoDiem dinh2) {
		this.dinh2 = dinh2;
	}

	public ToaDoDiem getDinh3() {
		return dinh3;
	}

	public void setDinh3(ToaDoDiem dinh3) {
		this.dinh3 = dinh3;
	}

}
