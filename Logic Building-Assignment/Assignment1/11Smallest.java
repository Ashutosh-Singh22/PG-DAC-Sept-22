import java.util.Scanner;

class Smallest{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = input.nextInt();
		System.out.println("Enter number2");
		int num2 = input.nextInt();
		System.out.println("Enter number3");
		int num3 = input.nextInt();
		//6,7,6 input pe output nahi aa raha. CHECK -> DONE
		if(num1<num2 && num1<num3){
			System.out.println("Smallest number is: "+num1);
		}
		else if(num2<num3){
			System.out.println("Smallest number is: "+num2);
		}
		else{
			System.out.println("Smallest number is: "+num3);
		}
	}

}