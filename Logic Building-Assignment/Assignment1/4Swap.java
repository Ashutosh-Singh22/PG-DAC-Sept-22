import java.util.Scanner;

class Swap{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = input.nextInt();
		System.out.println("Enter number2");
		int num2 = input.nextInt();
		//50 100
		num1 = num1 + num2; // 150 100
		num2 = num1 - num2; // 150 50
		num1 = num1 - num2; // 100 50
		
		System.out.println("Numbers after swap "+num1+" "+num2);
		
	}
}