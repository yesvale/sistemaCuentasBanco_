package ui;

import java.util.Scanner;

import bll.Application;
import dol.Currency;
import misc.BalanceCatcher;
import misc.ExchangeRates;
import misc.IndexValidator;

public class DepositOrWithdraw {
	Scanner sc = new Scanner(System.in);
	//indice.
	public void depositInCAWithIndex() {
		IndexValidator iv = new IndexValidator();
		int tempIndex = 0;
		boolean tempValidator = false;
		do {
			
			tempIndex = Application.selectCurrentAccountByCatalog();
			
			if(iv.indexValidatorCA(tempIndex)) {
				
				
				if(Application.getCurrentAccountByIndex(tempIndex).getCurrency() == Currency.CORDOVAS) {
					
					System.out.println("Tipo de moneda: ");
					System.out.println("1. Córdoba.");
					System.out.println("2. Dólar.");
					
					int op = sc.nextShort();
					switch(op) {
					
					case 1:
						

						System.out.print("Igrese el monto a depositar: ");
						double tempAmount = BalanceCatcher.catchAmount();
						
						Application.depositInCA(tempIndex, tempAmount);

						tempValidator = true;
						
						break;
						
					case 2:
						
						System.out.print("Ingrese el monto a depositar: ");
						double tempAmount2 = BalanceCatcher.catchAmount();
						tempAmount2 = ExchangeRates.dolarToCordova(tempAmount2);
						Application.depositInCA(tempIndex, tempAmount2);
						
						tempValidator = true;
						break;
					default:
						System.out.println("Opción inválida.");
						break;
					
					}
					
					
				}else {
					
					System.out.println("Tipo de moneda: ");
					System.out.println("1. Córdoba.");
					System.out.println("2. Dólar.");
					
					int op2 = sc.nextShort();
					switch(op2) {
					
					case 1:
						System.out.print("Igrese el monto a depositar: ");
						double tempAmount = BalanceCatcher.catchAmount();
						tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
						Application.depositInCA(tempIndex, tempAmount);
						tempValidator = true;
						break;
					case 2:
						System.out.print("Ingrese el monto a depositar: ");
						double tempAmount2 = BalanceCatcher.catchAmount();
						
						Application.depositInCA(tempIndex, tempAmount2);
									
						tempValidator = true;
						break;
					default:
						System.out.println("Opción inválida.");
						break;
					
					}
				}
				
			}else {
				System.out.println("Indíce inválido.");
			}
		}while(tempValidator = false);	
	}
	
	
	
	public void depositInSAWithIndex() {
		IndexValidator iv = new IndexValidator();
		int tempIndex = 0;
		boolean tempValidator = false;
		do {
			
			tempIndex = Application.selectSavingsAccountByCatalog();
			
			if(iv.indexValidatorSA(tempIndex)) {
				
				
				if(Application.getSavingsAccountByIndex(tempIndex).getCurrency() == Currency.CORDOVAS) {
					
					System.out.println("Tipo de moneda: ");
					System.out.println("1. Córdoba.");
					System.out.println("2. Dólar.");
					
					int op = sc.nextShort();
					switch(op) {
					
					case 1:
						

						System.out.print("Igrese el monto a depositar: ");
						double tempAmount = BalanceCatcher.catchAmount();
						
						Application.depositInSA(tempIndex, tempAmount);

						tempValidator = true;
						
						break;
						
					case 2:
						
						System.out.print("Ingrese el monto a depositar: ");
						double tempAmount2 = BalanceCatcher.catchAmount();
						tempAmount2 = ExchangeRates.dolarToCordova(tempAmount2);
						Application.depositInSA(tempIndex, tempAmount2);
						
						tempValidator = true;
						break;
					default:
						System.out.println("Opción inválida.");
						break;
					
					}
					
					
				}else {
					
					System.out.println("Tipo de moneda: ");
					System.out.println("1. Córdoba.");
					System.out.println("2. Dólar.");
					
					int op2 = sc.nextShort();
					switch(op2) {
					
					case 1:
						System.out.print("Igrese el monto a depositar: ");
						double tempAmount = BalanceCatcher.catchAmount();
						tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
						Application.depositInSA(tempIndex, tempAmount);
						tempValidator = true;
						break;
					case 2:
						System.out.print("Ingrese el monto a depositar: ");
						double tempAmount2 = BalanceCatcher.catchAmount();
						
						Application.depositInSA(tempIndex, tempAmount2);
									
						tempValidator = true;
						break;
					default:
						System.out.println("Opción inválida.");
						break;
					
					}
				}
				
			}else {
				System.out.println("Indíce inválido.");
			}
		}while(tempValidator = false);	
		
	}

	public void withdrawFromCAWithIndex() {
		IndexValidator iv = new IndexValidator();
		int tempIndex = 0;
		boolean tempValidator = false;
		do {
			
			tempIndex = Application.selectCurrentAccountByCatalog();
			
			if(iv.indexValidatorCA(tempIndex)) {
				
				
				if(Application.getCurrentAccountByIndex(tempIndex).getCurrency() == Currency.CORDOVAS) {
					
					System.out.println("Tipo de moneda: ");
					System.out.println("1. Córdoba.");
					System.out.println("2. Dólar.");
					
					int op = sc.nextShort();
					switch(op) {
					
					case 1:
						

						System.out.print("Igrese el monto a retirar: ");
						double tempAmount = BalanceCatcher.catchAmount();
						
						Application.withdrawFromCA(tempIndex, tempAmount);

						tempValidator = true;
						
						break;
						
					case 2:
						
						System.out.print("Ingrese el monto a retirar: ");
						double tempAmount2 = BalanceCatcher.catchAmount();
						tempAmount2 = ExchangeRates.dolarToCordova(tempAmount2);
						Application.withdrawFromCA(tempIndex, tempAmount2);
						
						tempValidator = true;
						break;
					default:
						System.out.println("Opción inválida.");
						break;
					
					}
					
					
				}else {
					
					System.out.println("Tipo de moneda: ");
					System.out.println("1. Córdoba.");
					System.out.println("2. Dólar.");
					
					int op2 = sc.nextShort();
					switch(op2) {
					
					case 1:
						System.out.print("Igrese el monto a retirar: ");
						double tempAmount = BalanceCatcher.catchAmount();
						tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
						Application.withdrawFromCA(tempIndex, tempAmount);
						tempValidator = true;
						break;
					case 2:
						System.out.print("Ingrese el monto a retirar: ");
						double tempAmount2 = BalanceCatcher.catchAmount();
						
						Application.withdrawFromCA(tempIndex, tempAmount2);
									
						tempValidator = true;
						break;
					default:
						System.out.println("Opción inválida.");
						break;
					
					}
				}
				
			}else {
				System.out.println("Indíce inválido.");
			}
		}while(tempValidator = false);
		
	}
	
	
	public void withdrawFromSAWithIndex() {
		IndexValidator iv = new IndexValidator();
		int tempIndex = 0;
		boolean tempValidator = false;
		do {
			
			tempIndex = Application.selectSavingsAccountByCatalog();
			
			if(iv.indexValidatorSA(tempIndex)) {
				
				
				if(Application.getSavingsAccountByIndex(tempIndex).getCurrency() == Currency.CORDOVAS) {
					
					System.out.println("Tipo de moneda: ");
					System.out.println("1. Córdoba.");
					System.out.println("2. Dólar.");
					
					int op = sc.nextShort();
					switch(op) {
					
					case 1:
						

						System.out.print("Igrese el monto a retirar: ");
						double tempAmount = BalanceCatcher.catchAmount();
						
						Application.withdrawFromSA(tempIndex, tempAmount);

						tempValidator = true;
						
						break;
						
					case 2:
						
						System.out.print("Ingrese el monto a retirar: ");
						double tempAmount2 = BalanceCatcher.catchAmount();
						tempAmount2 = ExchangeRates.dolarToCordova(tempAmount2);
						Application.withdrawFromSA(tempIndex, tempAmount2);
						
						tempValidator = true;
						break;
					default:
						System.out.println("Opción inválida.");
						break;
					
					}
					
					
				}else {
					
					System.out.println("Tipo de moneda: ");
					System.out.println("1. Córdoba.");
					System.out.println("2. Dólar.");
					
					int op2 = sc.nextShort();
					switch(op2) {
					
					case 1:
						System.out.print("Igrese el monto a retirar: ");
						double tempAmount = BalanceCatcher.catchAmount();
						tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
						Application.withdrawFromSA(tempIndex, tempAmount);
						tempValidator = true;
						break;
					case 2:
						System.out.print("Ingrese el monto a retirar: ");
						double tempAmount2 = BalanceCatcher.catchAmount();
						
						Application.withdrawFromSA(tempIndex, tempAmount2);
									
						tempValidator = true;
						break;
					default:
						System.out.println("Opción inválida.");
						break;
					
					}
				}
				
			}else {
				System.out.println("Indíce inválido.");
			}
		}while(tempValidator = false);
		
	}
	
	//Usar numero de cuenta.
	
    public void depositInCAWithAccountNumber() {
    	boolean tempValidator = false;
    	
    	do {
    		System.out.print("Ingrese el número de cuenta: ");
    		long tempAccountNumber = sc.nextLong();
    		if(Application.currentAccountExists(tempAccountNumber)) {
    			
    			if(Application.getCurrentAccountByIndex(Application.getCurrentAccountIndex(tempAccountNumber)).getCurrency() == Currency.CORDOVAS) {
    		
    				System.out.println("Tipo de moneda: ");
    				System.out.println("1. Córdoba.");
    				System.out.println("2. Dólar.");
    				
    				int op = sc.nextShort();
    				switch(op) {
    				
    				case 1:
    					

    					System.out.print("Igrese el monto a depositar: ");
    					double tempAmount = BalanceCatcher.catchAmount();
    					
    												
    					Application.depositInCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount);
    					

    					tempValidator = true;
    					
    					break;
    					
    				case 2:
    					
    					System.out.print("Ingrese el monto a depositar: ");
    					double tempAmount2 = BalanceCatcher.catchAmount();
    					
    					tempAmount2 = ExchangeRates.dolarToCordova(tempAmount2);
    					
    					Application.depositInCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount2);
    						
    					tempValidator = true;
    					
    					break;
    				default:
    					System.out.println("Opción inválida.");
    					break;
    				
    				}
    				
    				
    				
    			}else {
    				

    				System.out.println("Tipo de moneda: ");
    				System.out.println("1. Córdoba.");
    				System.out.println("2. Dólar.");
    				
    				int op2 = sc.nextShort();
    				switch(op2) {
    				
    				case 1:
    					

    					System.out.print("Igrese el monto a depositar: ");
    					double tempAmount = BalanceCatcher.catchAmount();
    					
    				    tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
    					
    					Application.depositInCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount);
    					

    					tempValidator = true;
    					
    					break;
    					
    				case 2:
    					
    					System.out.print("Ingrese el monto a depositar: ");
    					double tempAmount2 = BalanceCatcher.catchAmount();
    					
    											
    					Application.depositInCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount2);
    									
    					tempValidator = true;
    					
    					break;
    				default:
    					System.out.println("Opción inválida.");
    					break;
    				
    				}
    			}
    			
    										
    			
    		}else {
    			System.out.println("No existe ninguna cuenta con ese número de cuenta.");
    		}
    		
    	}while(tempValidator == false);		
	}
	
	public void depositInSAWithAccountNumber() {
       boolean tempValidator = false;
    	
    	do {
    		System.out.print("Ingrese el número de cuenta: ");
    		long tempAccountNumber = sc.nextLong();
    		if(Application.savingsAccountExists(tempAccountNumber)) {
    			
    			if(Application.getSavingsAccountByIndex(Application.getSavingsAccountIndex(tempAccountNumber)).getCurrency() == Currency.CORDOVAS) {
    		
    				System.out.println("Tipo de moneda: ");
    				System.out.println("1. Córdoba.");
    				System.out.println("2. Dólar.");
    				
    				int op = sc.nextShort();
    				switch(op) {
    				
    				case 1:
    					

    					System.out.print("Igrese el monto a depositar: ");
    					double tempAmount = BalanceCatcher.catchAmount();
    					
    												
    					Application.depositInSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount);
    					

    					tempValidator = true;
    					
    					break;
    					
    				case 2:
    					
    					System.out.print("Ingrese el monto a depositar: ");
    					double tempAmount2 = BalanceCatcher.catchAmount();
    					
    					tempAmount2 = ExchangeRates.dolarToCordova(tempAmount2);
    					
    					Application.depositInSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount2);
    						
    					tempValidator = true;
    					
    					break;
    				default:
    					System.out.println("Opción inválida.");
    					break;
    				
    				}
    				
    				
    				
    			}else {
    				

    				System.out.println("Tipo de moneda: ");
    				System.out.println("1. Córdoba.");
    				System.out.println("2. Dólar.");
    				
    				int op2 = sc.nextShort();
    				switch(op2) {
    				
    				case 1:
    					

    					System.out.print("Igrese el monto a depositar: ");
    					double tempAmount = BalanceCatcher.catchAmount();
    					
    				    tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
    					
    					Application.depositInSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount);
    					

    					tempValidator = true;
    					
    					break;
    					
    				case 2:
    					
    					System.out.print("Ingrese el monto a depositar: ");
    					double tempAmount2 = BalanceCatcher.catchAmount();
    					
    											
    					Application.depositInSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount2);
    									
    					tempValidator = true;
    					
    					break;
    				default:
    					System.out.println("Opción inválida.");
    					break;
    				
    				}
    			}
    			
    										
    			
    		}else {
    			System.out.println("No existe ninguna cuenta con ese número de cuenta.");
    		}
    		
    	}while(tempValidator == false);		
		
	}

	public void withdrawFromCAWithAccountNumber() {
boolean tempValidator = false;
    	
    	do {
    		System.out.print("Ingrese el número de cuenta: ");
    		long tempAccountNumber = sc.nextLong();
    		if(Application.currentAccountExists(tempAccountNumber)) {
    			
    			if(Application.getCurrentAccountByIndex(Application.getCurrentAccountIndex(tempAccountNumber)).getCurrency() == Currency.CORDOVAS) {
    		
    				System.out.println("Tipo de moneda: ");
    				System.out.println("1. Córdoba.");
    				System.out.println("2. Dólar.");
    				
    				int op = sc.nextShort();
    				switch(op) {
    				
    				case 1:
    					

    					System.out.print("Igrese el monto a retirar: ");
    					double tempAmount = BalanceCatcher.catchAmount();
    					
    												
    					Application.withdrawFromCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount);
    					

    					tempValidator = true;
    					
    					break;
    					
    				case 2:
    					
    					System.out.print("Ingrese el monto a retirar: ");
    					double tempAmount2 = BalanceCatcher.catchAmount();
    					
    					tempAmount2 = ExchangeRates.dolarToCordova(tempAmount2);
    					
    					Application.withdrawFromCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount2);
    						
    					tempValidator = true;
    					
    					break;
    				default:
    					System.out.println("Opción inválida.");
    					break;
    				
    				}
    				
    				
    				
    			}else {
    				

    				System.out.println("Tipo de moneda: ");
    				System.out.println("1. Córdoba.");
    				System.out.println("2. Dólar.");
    				
    				int op2 = sc.nextShort();
    				switch(op2) {
    				
    				case 1:
    					

    					System.out.print("Igrese el monto a retirar: ");
    					double tempAmount = BalanceCatcher.catchAmount();
    					
    				    tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
    					
    					Application.withdrawFromCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount);
    					

    					tempValidator = true;
    					
    					break;
    					
    				case 2:
    					
    					System.out.print("Ingrese el monto a retirar: ");
    					double tempAmount2 = BalanceCatcher.catchAmount();
    					
    											
    					Application.withdrawFromCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount2);
    									
    					tempValidator = true;
    					
    					break;
    				default:
    					System.out.println("Opción inválida.");
    					break;
    				
    				}
    			}
    			
    										
    			
    		}else {
    			System.out.println("No existe ninguna cuenta con ese número de cuenta.");
    		}
    		
    	}while(tempValidator == false);		
		
	}
	
	
	public void withdrawFromSAWithAccountNumber() {
		  boolean tempValidator = false;
	    	
	    	do {
	    		System.out.print("Ingrese el número de cuenta: ");
	    		long tempAccountNumber = sc.nextLong();
	    		if(Application.savingsAccountExists(tempAccountNumber)) {
	    			
	    			if(Application.getSavingsAccountByIndex(Application.getSavingsAccountIndex(tempAccountNumber)).getCurrency() == Currency.CORDOVAS) {
	    		
	    				System.out.println("Tipo de moneda: ");
	    				System.out.println("1. Córdoba.");
	    				System.out.println("2. Dólar.");
	    				
	    				int op = sc.nextShort();
	    				switch(op) {
	    				
	    				case 1:
	    					

	    					System.out.print("Igrese el monto a retirar: ");
	    					double tempAmount = BalanceCatcher.catchAmount();
	    					
	    												
	    					Application.withdrawFromSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount);
	    					

	    					tempValidator = true;
	    					
	    					break;
	    					
	    				case 2:
	    					
	    					System.out.print("Ingrese el monto a retirar: ");
	    					double tempAmount2 = BalanceCatcher.catchAmount();
	    					
	    					tempAmount2 = ExchangeRates.dolarToCordova(tempAmount2);
	    					
	    					Application.withdrawFromSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount2);
	    						
	    					tempValidator = true;
	    					
	    					break;
	    				default:
	    					System.out.println("Opción inválida.");
	    					break;
	    				
	    				}
	    				
	    				
	    				
	    			}else {
	    				

	    				System.out.println("Tipo de moneda: ");
	    				System.out.println("1. Córdoba.");
	    				System.out.println("2. Dólar.");
	    				
	    				int op2 = sc.nextShort();
	    				switch(op2) {
	    				
	    				case 1:
	    					

	    					System.out.print("Igrese el monto a retirar: ");
	    					double tempAmount = BalanceCatcher.catchAmount();
	    					
	    				    tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
	    					
	    					Application.withdrawFromSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount);
	    					

	    					tempValidator = true;
	    					
	    					break;
	    					
	    				case 2:
	    					
	    					System.out.print("Ingrese el monto a retirar: ");
	    					double tempAmount2 = BalanceCatcher.catchAmount();
	    					
	    											
	    					Application.withdrawFromSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount2);
	    									
	    					tempValidator = true;
	    					
	    					break;
	    				default:
	    					System.out.println("Opción inválida.");
	    					break;
	    				
	    				}
	    			}
	    			
	    										
	    			
	    		}else {
	    			System.out.println("No existe ninguna cuenta con ese número de cuenta.");
	    		}
	    		
	    	}while(tempValidator == false);	
		
	}
	

	
	
	
	
}
