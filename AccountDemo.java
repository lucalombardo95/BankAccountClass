//Luca Lombardo
//CSC 236-64
//Lab 1-A

public class AccountDemo {
	
	public static void main(String[] args) {
		Account acc = new Account(1122, 20000.00);
		
		acc.setAnnualInterestRate(4.5);
		
		acc.withdraw(2500.00);
		acc.deposit(3000.00);

		//print balance
		System.out.println("The balance of this account is: " + "$" + acc.getBalance());
		
		//print monthly interest
		System.out.println("The monthly interest is: " + "$" + acc.getMonthlyInterest());
		
		//print date
		System.out.println("This account was created on " + acc.getDateCreated().toString());
		
	}

}
