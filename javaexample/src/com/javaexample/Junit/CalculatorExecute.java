package com.javaexample.Junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CalculatorExecute {
	public InterfaceCalculator Cal;

	public CalculatorExecute(double FN, double SN, char Operator) {
		switch (Operator) {
		case '-':
			Cal = new Subtract(FN, SN);
			break;
		case '/':
			Cal = new Divide(FN, SN);
			break;
		case '*':
			Cal = new Multiple(FN, SN);
			break;
		default:
			Cal = new Add(FN, SN);
			break;
		}
	}

	public double makeCalculation() {
		return Cal.execute();
	}

	public static void main(String[] args) {
		Result junitResult = JUnitCore.runClasses(JunitTest.class);
		System.out.println("Total TC run: "+junitResult.getRunCount());
		System.out.println("Total TC failed: "+junitResult.getFailureCount());
		for(Failure fail : junitResult.getFailures())
		{
			System.out.print(fail.getTestHeader() + " : ");
			System.out.println(fail.getMessage());
		}
	}
}
