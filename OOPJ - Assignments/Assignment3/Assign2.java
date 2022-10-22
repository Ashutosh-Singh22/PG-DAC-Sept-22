/*
Write a class for Account containing data members accountNumber, holderName, balance and add
constructors and necessary accessor/modifier functions for these data members. Now create two class
SavingsAccount and CurrentAccount extending from this class. SavingsAccount will have a member
variable interestRate and member function calculateYearlyInterest. Write another class Manager that
contains a list Account. Also write a main() function to create an instance of Manager class. Add two
SavingsAccount and three CurrentAccount to Manager. Calculate interest of each SavingsAccount. Print
the details of all accounts.
*/

class Account{
	int accountNumber;
	String holderName;
	double balance;
	
	Account(){
	}
	
	Account(int accountNumber, String holderName, double balance){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
}

class SavingsAccount extends Account{
	double interestRate;
	
	SavingsAccount(){
	}
	
	SavingsAccount(int accountNumber, String holderName, double balance, double interestRate){
		super(accountNumber, holderName, balance);
		this.interestRate = interestRate;
	}
	
	void calculateYearlyInterest(){
		System.out.printf("Yearly interest is: %.2f \n",((interestRate*balance)/100));
	}
}

class CurrentAccount extends Account{
	
		CurrentAccount(){	
		}
		
		CurrentAccount(int accountNumber, String holderName, double balance){
			super(accountNumber, holderName, balance);
		}
}

class Manager{
	Account acc[];
	
	void printDetails(){
		for(int i=0; i<5; i++){
			System.out.println("Account number: "+this.acc[i].accountNumber);
			System.out.println("Holder name: "+this.acc[i].holderName);
			System.out.println("Balance: "+this.acc[i].balance);
		}
	}
}

class Assign2{
	public static void main(String args[]){
		
		Manager mg = new Manager();
		
		SavingsAccount sa1 = new SavingsAccount(101, "Ashutosh", 11111.11, 3.5);
		SavingsAccount sa2 = new SavingsAccount(102, "Ashutosh", 444444.44, 3.0);
		SavingsAccount sa3 = new SavingsAccount(103, "Ashutosh", 22222.22, 2.7);
		
		CurrentAccount ca1 = new CurrentAccount(111, "Ashutosh", 33333.33);
		CurrentAccount ca2 = new CurrentAccount(112, "Ashutosh", 55555.55);
		
		mg.acc = new Account[]{sa1, sa2, sa3, ca1, ca2};
		
		mg.printDetails();
		sa1.calculateYearlyInterest();
		sa2.calculateYearlyInterest();
		sa3.calculateYearlyInterest();
	}
}