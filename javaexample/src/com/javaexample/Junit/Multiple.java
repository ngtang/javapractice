package com.javaexample.Junit;

public class Multiple implements InterfaceCalculator{
	double FN;
	double SN;
	Multiple(double FN, double SN)
	{
		this.FN= FN;
		this.SN = SN;
	}
	@Override
	public double execute() {
		// TODO Auto-generated method stub
		return FN*SN;
	}
}




