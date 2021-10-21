package com.myjava.factorypattern.calculator.factory;

import com.myjava.factorypattern.calculator.*;
import com.myjava.factorypattern.calculator.methods.*;
public class calculatorfactory {
	
	public static double calculator(double a, String method, double b)
	{
		calculator cal;
		switch(method) {
		case "-": cal = new sub();
					break;
		case "*": cal = new multiple();
					break;
		case "/": cal = new divide();
					break;
		default: cal = new add();
		}
		return cal.calculating(a,b);
	}
}
