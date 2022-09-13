import java.util.Scanner;

class Reverse{
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

		System.out.println("Reverse of number: "+num+" is: "+reverse);

		
	}
}