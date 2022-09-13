import java.util.Scanner;

class HCF{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = input.nextInt();
		System.out.println("Enter number2");
		int num2 = input.nextInt();
		int minNumber;
		
		if(num1<=num2)
			minNumber = num1;
		else
			minNumber = num2;
		
		while(minNumber>0){
			if(num1%minNumber==0 && num2%minNumber==0){
				break;
			}
			minNumber--;
		}
		
		System.out.println("The HCF of "+num1+" and "+num2+" is: "+minNumber);
	
	}

}