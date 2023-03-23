package interfaceProgram;

public class BankMain {

	public static void main(String[] args) {
		BankImplementation b = new BankImplementation();
		b.account();
		b.debit();
		b.credit();
		b.loan();
		b.carLoan();
		
		Bank obj = new BankImplementation(); /*cannot directly create object for interface so use this method -
		 										Interface_name obj_name = new Class_name;*/
		obj.account();
		obj.credit();
		obj.debit();
		
		Bank2 b2 = new BankImplementation();
		b2.carLoan();
		
		SuperBank s = new BankImplementation();
		s.account();
		
	}

}
