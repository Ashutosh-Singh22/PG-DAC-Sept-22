/*
04.	Write a program to find the simple interest. Take the principle amount, 
rate of interest and time from user using Scanner class.
*/

import java.util.Scanner;

class JavaAssignment4{
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter principle amount ");
		int principleAmount = input.nextInt();
		System.out.println("Enter Rate of Interest ");
		float rateOfInterest = input.nextFloat();
		System.out.println("Enter Time period");
		int timePeriod = input.nextInt();
		
		System.out.println("The simple interest is = "+((principleAmount*rateOfInterest*timePeriod)/100));
		
	}
}