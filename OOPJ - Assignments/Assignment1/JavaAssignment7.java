/*
07.	Write a program to swap two numbers without using third variable.
*/

class JavaAssignment7{
	public static void main(String args[]){
		
		int num1 = 10;
		int num2 = 25;
		
		System.out.println("Numbers before swapping :"+num1+" "+num2);
		
		num1 = num1 + num2; // 10+25=35
		num2 = num1 - num2; // 35-25=10
		num1 = num1 - num2; // 35-10=25
		
		System.out.println("Numbers after  swapping :"+num1+" "+num2);
		
	}
}
