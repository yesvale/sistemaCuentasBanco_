package dol;

import java.time.LocalDateTime;
import java.util.Date;

import misc.DateOperator;

public class SavingsAccount extends Account implements IAccount, ISavingsAccount, Comparable<SavingsAccount>{

	DateOperator DO = new DateOperator();
	
	public SavingsAccount() {
		super();
		
	}


	
	
	



	

	public SavingsAccount(double balance, long accountNumber, String holderFirstName, String holderMiddleName,
			String holderSurname, String holderSecondSurname, Date birthDate, int age, String holderID, int landlinePhoneNumber,
			int mobilPhoneNumber, String holderDepartment, String holderMunicipality, String holderNeighborhood,
			String exactAddress, LocalDateTime creationDate, Currency currency, String transactionHistory) {
		super(balance, accountNumber, holderFirstName, holderMiddleName, holderSurname, holderSecondSurname, birthDate, age,
				holderID, landlinePhoneNumber, mobilPhoneNumber, holderDepartment, holderMunicipality, holderNeighborhood,
				exactAddress, creationDate, currency, transactionHistory);
		// TODO Auto-generated constructor stub
	}






	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}


	@Override
	public Date getBirthDate() {
		// TODO Auto-generated method stub
		return super.getBirthDate();
	}


	@Override
	public void setBirthDate(Date birthDate) {
		// TODO Auto-generated method stub
		super.setBirthDate(birthDate);
	}


	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return super.getBalance();
	}

	@Override
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		super.setBalance(balance);
	}

	@Override
	public long getAccountNumber() {
		// TODO Auto-generated method stub
		return super.getAccountNumber();
	}

	@Override
	public void setAccountNumber(long accountNumber) {
		// TODO Auto-generated method stub
		super.setAccountNumber(accountNumber);
	}

	@Override
	public String getHolderFirstName() {
		// TODO Auto-generated method stub
		return super.getHolderFirstName();
	}

	@Override
	public void setHolderFirstName(String holderFirstName) {
		// TODO Auto-generated method stub
		super.setHolderFirstName(holderFirstName);
	}

	@Override
	public String getHolderMiddleName() {
		// TODO Auto-generated method stub
		return super.getHolderMiddleName();
	}

	@Override
	public void setHolderMiddleName(String holderMiddleName) {
		// TODO Auto-generated method stub
		super.setHolderMiddleName(holderMiddleName);
	}

	@Override
	public String getHolderSurname() {
		// TODO Auto-generated method stub
		return super.getHolderSurname();
	}

	@Override
	public void setHolderSurname(String holderSurname) {
		// TODO Auto-generated method stub
		super.setHolderSurname(holderSurname);
	}

	@Override
	public String getHolderSecondSurname() {
		// TODO Auto-generated method stub
		return super.getHolderSecondSurname();
	}

	@Override
	public void setHolderSecondSurname(String holderSecondSurname) {
		// TODO Auto-generated method stub
		super.setHolderSecondSurname(holderSecondSurname);
	}

	@Override
	public String getHolderID() {
		// TODO Auto-generated method stub
		return super.getHolderID();
	}

	@Override
	public void setHolderID(String holderID) {
		// TODO Auto-generated method stub
		super.setHolderID(holderID);
	}

	@Override
	public LocalDateTime getCreationDate() {
		// TODO Auto-generated method stub
		return super.getCreationDate();
	}

	@Override
	public void setCreationDate(LocalDateTime CreationDate) {
		// TODO Auto-generated method stub
		super.setCreationDate(CreationDate);
	}

	@Override
	public Currency getCurrency() {
		// TODO Auto-generated method stub
		return super.getCurrency();
	}

	@Override
	public void setCurrency(Currency currency) {
		// TODO Auto-generated method stub
		super.setCurrency(currency);
	}

	@Override
	public int getLandlinePhoneNumber() {
		// TODO Auto-generated method stub
		return super.getLandlinePhoneNumber();
	}


	@Override
	public void setLandlinePhoneNumber(int landlinePhoneNumber) {
		// TODO Auto-generated method stub
		super.setLandlinePhoneNumber(landlinePhoneNumber);
	}

	@Override
	public int getMobilPhoneNumber() {
		// TODO Auto-generated method stub
		return super.getMobilPhoneNumber();
	}

	@Override
	public void setMobilPhoneNumber(int mobilPhoneNumber) {
		// TODO Auto-generated method stub
		super.setMobilPhoneNumber(mobilPhoneNumber);
	}

	@Override
	public String getHolderDepartment() {
		// TODO Auto-generated method stub
		return super.getHolderDepartment();
	}

	@Override
	public void setHolderDepartment(String holderDepartment) {
		// TODO Auto-generated method stub
		super.setHolderDepartment(holderDepartment);
	}

	@Override
	public String getHolderMunicipality() {
		// TODO Auto-generated method stub
		return super.getHolderMunicipality();
	}

	@Override
	public void setHolderMunicipality(String holderMunicipality) {
		// TODO Auto-generated method stub
		super.setHolderMunicipality(holderMunicipality);
	}

	@Override
	public String getHolderNeighborhood() {
		// TODO Auto-generated method stub
		return super.getHolderNeighborhood();
	}

	@Override
	public void setHolderNeighborhood(String holderNeighborhood) {
		// TODO Auto-generated method stub
		super.setHolderNeighborhood(holderNeighborhood);
	}

	@Override
	public String getExactAddress() {
		// TODO Auto-generated method stub
		return super.getExactAddress();
	}

	@Override
	public void setExactAddress(String exactAdddress) {
		// TODO Auto-generated method stub
		super.setExactAddress(exactAdddress);
	}

	@Override
	public String getTransactionHistory() {
		// TODO Auto-generated method stub
		return super.getTransactionHistory();
	}

	@Override
	public void setTransactionHistory(String transactionHistory) {
		// TODO Auto-generated method stub
		super.setTransactionHistory(transactionHistory);
	}

	 	

	
	
	
	
	
	//Metodos especiales
	

	@Override
	public void withdrawMoney (double amount) {
	    
		double tempBalance = getBalance();
		
		tempBalance = tempBalance - amount;
		
		if(tempBalance < 0) {
			
			System.out.println("Fondos insuficientes.");
		}else {
			
			setBalance(getBalance() - amount);
		}
		
		
		
		
		/*
		 * Hay que agregar una forma de agregar la transaccion al historial de transacciones.
		*/
		
	}

	@Override
	public void depositMoney(double amount) {
		
		
		setBalance(getBalance() + amount);
		
	}

	
	public void lowBalanceFee(){
				
		if(getCurrency() == Currency.CORDOVAS) {
			
			if(getBalance() < 1000) {
				
				if(getBalance() < LOW_BALANCE_FEE_CORDOVAS) {
					
					setBalance(0);
					
				}else {
					
					setBalance(getBalance() - LOW_BALANCE_FEE_CORDOVAS);
				}
				
		}else {
			
			if(getBalance() < 100) {
				
				if(getBalance() < LOW_BALANCE_FEE_DOLARS) {
					
					setBalance(0);
					
				}else {
					
					setBalance(getBalance() - LOW_BALANCE_FEE_DOLARS);
				}
				
			}
			
		}
			
		}
		
	}
	

	
	
	
	@Override
	public void showDataAsRow() {
		System.out.printf("\n%d %s Fecha de creación de la cuenta: %D Balance: %f Titular: %s %s %s %s Fecha de nacimiento: %s Cédula del titular: %s Número de telefono fijo: %d Número de teléfono móvil: %d Dirreción del titular: %s, %s, Barrio %s, %s\n",
				getAccountNumber(),
				getCurrency(),
				getCreationDate(),
				getBalance(),
				getHolderFirstName(),
				getHolderMiddleName(),
				getHolderSurname(),
				getHolderSecondSurname(),
				DateOperator.dateToString(getBirthDate(), "dd/MM/yyyy"),
				getHolderID(),
				getLandlinePhoneNumber(),
				getMobilPhoneNumber(),
				getHolderDepartment(),
				getHolderMunicipality(),
				getHolderNeighborhood(),
				getExactAddress()
				);
		System.out.println("_______________________________________________________________________________________");
		
		
	}

	@Override
	public void showDataAsForm() {
		System.out.printf("\nNúmero de cuenta: %s", getAccountNumber());
		System.out.printf("\nTipo de moneda: %s", getCurrency());
		System.out.printf("\nFecha de creación de la cuenta: %s", getCreationDate());
		System.out.printf("\nBalance de la cuenta: %s", getBalance());
		System.out.printf("\nPrimer nombre del titular: %s", getHolderFirstName());
		System.out.printf("\nSegundo nombre del titular: %s", getHolderMiddleName());
		System.out.printf("\nPrimer apellido del titular: %s", getHolderSurname());
		System.out.printf("\nSegundo apellido del titular: %s", getHolderSecondSurname());
		System.out.printf("\nFecha de nacimiento del titular: %s", DateOperator.dateToString(getBirthDate(), "dd/MM/yyyy"));
		System.out.printf("\nMCédula de indentificación del titular: %s", getHolderID());
		System.out.printf("\nNúmero telefónico de linea fija: %s", getLandlinePhoneNumber());
		System.out.printf("\nNúmero de teléfono móvil: %s", getMobilPhoneNumber());
		System.out.printf("\nDepartamento del titular: %s", getHolderDepartment());
		System.out.printf("\nMunicipio del titular: %s", getHolderMunicipality());
		System.out.printf("\nBarrio del titular: %s", getHolderNeighborhood());
		System.out.printf("\nDirreción exacta: %s", getExactAddress());
	}


	@Override
	public int compareTo(SavingsAccount o) {
				
		if(o.getAccountNumber()>this.getAccountNumber()) {
			return -1;
	
		}else if(o.getAccountNumber()==getAccountNumber()){
			return 0;
		
		}else {
			return 1;
		}
		
	}
	
	
		
	
	
	

}
