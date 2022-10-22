/*
06.	Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as 
input using Scanner class. [ formula : C= 5*(f-32)/9 ]
*/

import java.util.Scanner;

class JavaAssignment6{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter temperature in Fahrenheit :");
		float fahrenheit = input.nextFloat();
		float celsius;
		
		celsius = 5*(fahrenheit-32)/9;
		
		System.out.println("Temperature in Celsius is = "+celsius);
		
	}
}