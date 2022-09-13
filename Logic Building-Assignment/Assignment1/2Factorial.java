import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int result = 1;
		
		for(int i = 1; i<=num; i++){
			result = result * i;
		}
		System.out.println("Factorial of "+num+" is = "+result);
	}
}