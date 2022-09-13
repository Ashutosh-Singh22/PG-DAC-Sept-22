import java.util.Scanner;

class Palindrome{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int temp = num;
		int remainder, reverse = 0;
		
		while(temp > 0){
			remainder = temp % 10;
			reverse = reverse*10 + remainder;
			temp = temp / 10;
		}

		if(reverse == num){
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not an Palindrome");
		}
		
	}
}