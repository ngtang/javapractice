package com.javaexample.Junit;

public class Add implements InterfaceCalculator{
	double FN;
	double SN;
	Add(double FN, double SN)
	{
		this.FN= FN;
		this.SN = SN;
	}
	@Override
	public double execute() {
		// TODO Auto-generated method stub
		return FN+SN;
	}
}




