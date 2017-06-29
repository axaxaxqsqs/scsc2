package app;

import lib.CalculatorImpl;
import lib.ICalculator;

public class Main {
	
	public static void main(String[] args){
		ICalculator cal = new CalculatorImpl();
		cal.on();
		System.out.println(cal.add(2, 3));
		System.out.println(cal.subtract(2, 3));
		System.out.println(cal.average(new int [] {2, 3, 4}));
		System.out.println(cal.mul(2, 3));
		cal.off();
	}
}
