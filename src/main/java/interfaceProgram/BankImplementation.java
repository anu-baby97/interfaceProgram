package interfaceProgram;

public class BankImplementation implements Bank, Bank2 {
	
	public void account() {
		System.out.println("Account method in Super Bank");
	}
	
	public void debit() {
		System.out.println("Debit method in Bank");
	}
	
	public void credit() {
		System.out.println("Credit method in Bank");
	}
	
	public void loan() {
		System.out.println("Loan method in Bank");
	}
	
	public void carLoan() {
		System.out.println("Car Loan method in Bank2");
	}
}
