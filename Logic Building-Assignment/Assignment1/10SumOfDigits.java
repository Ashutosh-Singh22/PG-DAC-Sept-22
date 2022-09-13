import java.util.Scanner;

class SumOfDigits{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int remainder, sum = 0;
		
		while(num > 0){
			remainder = num % 10;
			sum = sum + remainder;
			num = num / 10;
		}
		System.out.println("Sum of digits = "+sum);
	}
}