package misc;

import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class BalanceCatcher {
	static Scanner sc = new Scanner(System.in);
	static double amount = 0;
	static long wholePart = 0;
	static double cents = 0;
	//Obtener un balance correcto.
	
	//Debo convertir los misc a staticos para ahorrar memoria.
	
	public static double catchAmount() {
	
		
		
		do {
			
			do {
				System.out.print("Monto de la parte entera: ");
				
				try {
					wholePart = sc.nextLong();
					
				}catch(IllegalArgumentException e) {
					
				System.out.println("Error. Favor de ingresar un valor entero.");	
				}		
				
			}while(wholePart == 0);
			
			
			if(wholePart <= 0) {
				System.out.println("El monto no puede ser menor que 1.");
			}
			
		}while(wholePart <= 0);
		
		
		
		
		do {
			System.out.print("Monto de los centavos: ");
			cents = sc.nextFloat();
			if(cents<0 || cents> 0.99) {
				System.out.println("Monto de centavos inválido.");
			}
		
		}while(cents<0 || cents > 0.99);
		
		amount = wholePart + cents;
		
		return amount;
	}
	
	
	

}
