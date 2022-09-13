import java.util.Scanner;

class AddWOArith{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = input.nextInt();
		System.out.println("Enter number2");
		int num2 = input.nextInt();
		
		//need to add logic for Negative numbers****
		
		for(int i = num2; i>=1; i--){
			num1++;
		}
		System.out.println("Sum of numbers WO Arithmetic: "+num1);
	
	}
}