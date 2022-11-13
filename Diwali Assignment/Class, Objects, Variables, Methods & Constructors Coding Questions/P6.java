/*
Java Program to Create Outer Class Bank Account and the Inner Class Interest in it
*/

class BankAccount{
	
	double accountBalance;
	int noOfYears;
	
	BankAccount(){
		
		this.accountBalance = 0.0;
		this.noOfYears = 0;
	}
	
	BankAccount(double accountBalance, int noOfYears){
		
		this.accountBalance = accountBalance;
		this.noOfYears = noOfYears;
	}
	
	public void printInterestAmount(Interest i){
		
		Interest iObj = i;
		
		System.out.println("Balance          : "+this.accountBalance);
		System.out.println("Rate of interest : "+iObj.rateOfInterest);
		System.out.println("Period (in years): "+this.noOfYears);
		System.out.println("Total interest is: "+iObj.calcInterest());
	}
	
	class Interest{
		
		double rateOfInterest;
		
		Interest(){
			
			this.rateOfInterest = 2.75;
		}
		
		Interest(double rateOfInterest){
			
			this.rateOfInterest = rateOfInterest;
		}
	
		double calcInterest(){
			
			return (accountBalance*noOfYears*rateOfInterest*0.01);
		}
	}
}

class P6{
	
	public static void main(String args[]){
		
		BankAccount bObj11 = new BankAccount(10000.0,5);
		
		BankAccount.Interest iObj11 = bObj11.new Interest();
		bObj11.printInterestAmount(iObj11);								//1st way to call
		
		BankAccount.Interest iObj12 = bObj11.new Interest(5.5);
		bObj11.printInterestAmount(iObj12);								//1st way to call
		
		System.out.println("Inner class 1: "+iObj11.calcInterest());	//2nd way to call
		System.out.println("Inner class 2: "+iObj12.calcInterest());	//2nd way to call
	}
}
