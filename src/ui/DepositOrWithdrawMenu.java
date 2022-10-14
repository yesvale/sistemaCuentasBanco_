package ui;

import java.util.Scanner;

import bll.Application;
import dol.Currency;
import misc.BalanceCatcher;
import misc.ExchangeRates;
import misc.IndexValidator;

public class DepositOrWithdrawMenu implements IMenu {

Scanner sc = new Scanner(System.in);
DepositOrWithdraw tool = new DepositOrWithdraw();
	
	@Override
	public void show() {
		short op = 0;
		short op2 = 0;
		short op3 = 0;
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			op = sc.nextShort();

			switch(op) {
			case 1:
				
				System.out.println("\n1. Cuenta corriente.");
				System.out.println("2. Cuenta de ahorros.\n");
				op2 = sc.nextShort();
				
				switch(op2) {
				case 1:
					System.out.println("1. Buscar por indice");
					System.out.println("2. Buscar por número de cuenta");
					op3 = sc.nextShort();
					
					switch(op3) {
					case 1:
						tool.depositInCAWithIndex();
						break;
					case 2:
						tool.depositInCAWithAccountNumber();
						break;
					default:
						System.out.println("Opción inválida");
						break;
					
					}
					
					break;
				case 2:
					System.out.println("1. Buscar por indice");
					System.out.println("2. Buscar por número de cuenta");
					switch(op3) {
					case 1:
						tool.depositInSAWithIndex();
						break;
					case 2:
						tool.depositInSAWithAccountNumber();
						break;
					default:
						System.out.println("Opción inválida");
						break;
					
					}
					
					break;
				default:
					System.out.println("Opción inválida");
					break;
				}
				
			case 2:
				System.out.println("\n1. Cuenta corriente.");
				System.out.println("2. Cuenta de ahorros.\n");
				op2 = sc.nextShort();
				switch(op2) {
				case 1:
					System.out.println("1. Buscar por indice");
					System.out.println("2. Buscar por número de cuenta");
					op3 = sc.nextShort();
					
					switch(op3) {
					case 1:
						tool.withdrawFromCAWithIndex();
						break;
					case 2:
						tool.withdrawFromCAWithAccountNumber();
						break;
					default:
						System.out.println("Opción inválida");
						break;
					
					}
					
					break;
				case 2:
					System.out.println("1. Buscar por indice");
					System.out.println("2. Buscar por número de cuenta");
					switch(op3) {
					case 1:
						tool.withdrawFromSAWithIndex();;
						break;
					case 2:
						tool.withdrawFromSAWithAccountNumber();
						break;
					default:
						System.out.println("Opción inválida");
						break;
					
					}
					
					break;
				default:
					System.out.println("Opción inválida");
					break;
				
				}
				
				
				break;
			case 3:
				Menu menu = new Menu();
				menu.show();
				break;
			default:

				System.out.println("Opción inválida.");
		}
		
		}while(op != 3);
    }
					
					
					

	@Override
	public void displayOptions() {
		System.out.println("1. Depositar dinero.");
		System.out.println("2. Retirar dinero.");
		System.out.println("3. Volver al menú principal.");
	}

}
