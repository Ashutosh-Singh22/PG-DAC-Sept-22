import java.util.Scanner;

class PosNeg{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		if(num==0)
			System.out.println(num+"is neither positive nor negative");
		else if(num>0)
			System.out.println("Positive number");
		else
			System.out.println("Negative number");
		
	}
}
	