import java.util.Scanner;

class LCM{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = input.nextInt();
		System.out.println("Enter number2");
		int num2 = input.nextInt();
		int minNumber,lcm;
		
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
		
		lcm = (num1*num2)/minNumber;
		
		System.out.println("The LCM of "+num1+" and "+num2+" is: "+lcm);
	
	}

}