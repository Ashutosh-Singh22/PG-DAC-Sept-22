import java.util.Scanner;

class Digits{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
	
		int remainder;
		System.out.println("Digits of the number are: ");
		while(num > 0){
			remainder = num % 10;
			num = num / 10;
			System.out.print(" "+remainder);
		}
	}
}