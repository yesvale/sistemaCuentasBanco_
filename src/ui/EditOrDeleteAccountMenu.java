package ui;

import java.util.Scanner;

import bll.Application;

public class EditOrDeleteAccountMenu implements IMenu {

Scanner sc = new Scanner(System.in);


public void subMenu() {
	short op = 0;
	
	do {
		System.out.println("1 : Eliminar cuenta corriente");
		System.out.println("2 : Eliminar cuenta de ahorro");
		System.out.println("3 : Salir ");
		
		System.out.println();
		op = sc.nextShort();

		switch(op) {
		case 1:
			System.out.println("Ingrese el numero de la cuenta a eliminar: ");
			long num1 = sc.nextLong();
			Application.removeElement(num1);
			break;
		case 2:
		
			System.out.println("Ingrese el numero de la cuenta a eliminar: ");
			long num2 = sc.nextLong();
			Application.removeElement2(num2);
			break;
		case 3:
			Menu menu = new Menu();
			menu.show();
			break;
		default:
			System.out.println("Opción inválida.");
		
		}
		
	}while(op!=3);
	
}
	
	@Override
	public void show() {
		short op = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			op = sc.nextShort();

			switch(op) {
			case 1:
				EditMenu em = new EditMenu();
				em.show();
				
				break;
			case 2:
				subMenu();
				break;
			case 3:
				Menu menu = new Menu();
				menu.show();
				break;
			default:
				System.out.println("Opción inválida.");
			
			}
			
		}while(op!=3);
		
	}

	@Override
	public void displayOptions() {
		System.out.println("1. Editar una cuenta.");
		System.out.println("2. Eliminar una cuenta.");
		System.out.println("3. Volver al menú principal.");
		
	}

}
