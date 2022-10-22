/*
Create a class MathOperation that has four static methods. add() method that takes two integer numbers as
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the
product. power() method that takes two integer numbers as parameter and returns the power of first number to
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four
methods of MathOperation class by providing entered numbers and prints the return values of every method
*/
import java.util.Scanner;

class MathOperation{

	static int add(int num1, int num2){
		return (num1+num2);
	}
	
	static int substract(int num1, int num2){
		if(num1>num2)
			return (num1-num2);
		else
			return (num2-num1);
	}
	
	static int multiply(int num1, int num2){
		return (num1*num2);
	}
	
	static int power(int num1, int num2){	//num2^num1
		
		return ((int)Math.pow(num2,num1));
	}
}

class Demo{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		int num1 = input.nextInt();
		System.out.println("Enter number 2 (not 0)");
		int num2 = input.nextInt();
		
		System.out.println(MathOperation.add(num1,num2));
		System.out.println(MathOperation.substract(num1,num2));
		System.out.println(MathOperation.multiply(num1,num2));
		System.out.println(MathOperation.power(num1,num2));	

	}
}