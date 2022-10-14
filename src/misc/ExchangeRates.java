package misc;

import java.util.Scanner;

public class ExchangeRates {
	static Scanner sc = new Scanner(System.in);
	static double dolarValue;
	
	
	public static double dolarToCordova(double input) {
		
		System.out.print("Ingrese el valor del dólar en córdovas: ");
		dolarValue = sc.nextDouble();
		

		return input * dolarValue;
	}
	

	public static double cordovaToDolar(double input) {
		
		System.out.print("Ingrese el valor del dólar en córdovas: ");
		dolarValue = sc.nextDouble();
		
	
		return input / dolarValue;
		
		
	}
	
	
	
}
