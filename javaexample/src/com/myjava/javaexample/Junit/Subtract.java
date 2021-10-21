package com.myjava.javaexample.Junit;

public class Subtract implements InterfaceCalculator{
	double FN;
	double SN;
	Subtract(double FN, double SN)
	{
		this.FN= FN;
		this.SN = SN;
	}
	@Override
	public double execute() {
		// TODO Auto-generated method stub
		return FN-SN;
	}
}




