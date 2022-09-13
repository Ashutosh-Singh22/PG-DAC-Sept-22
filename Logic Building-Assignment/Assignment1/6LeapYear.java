import java.util.Scanner;

class LeapYear{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		
		if(num%400==0 || (num%4==0 && num%100!=0))
			System.out.println("Leap year");
		else
			System.out.println("Not a Leap year");	
	}
}