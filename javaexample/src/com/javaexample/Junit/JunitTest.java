package com.javaexample.Junit;
import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {
	@Test
	public void add() {
		CalculatorExecute C = new CalculatorExecute(1, 2, '+');
		assertEquals(3, C.makeCalculation(), 0.0);
	}
	@Test
	public void substract() {
		CalculatorExecute C = new CalculatorExecute(5, 7, '-');
		assertEquals(2, C.makeCalculation(), 0.0);
	}
	@Test
	public void multiple() {
		CalculatorExecute C = new CalculatorExecute(8, 6, '*');
		assertEquals(48, C.makeCalculation(), 0.0);
	}
	@Test
	public void divide() {
		CalculatorExecute C = new CalculatorExecute(7, 2, '/');
		assertEquals(3.5, C.makeCalculation(), 0.0);
	}
}

