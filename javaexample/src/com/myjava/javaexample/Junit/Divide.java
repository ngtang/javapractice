package com.myjava.javaexample.Junit;

public class Divide implements InterfaceCalculator{
	double FN;
	double SN;
	Divide(double FN, double SN)
	{
		this.FN= FN;
		this.SN = SN;
	}
	@Override
	public double execute() {
		// TODO Auto-generated method stub
		return FN/SN;
	}
}




