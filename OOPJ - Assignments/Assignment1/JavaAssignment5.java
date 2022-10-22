/*
05.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
Now convert the entered days into complete years, months and days and print them.
*/

import java.util.Scanner;

class JavaAssignment5{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no of days : ");
		int noOfDays = input.nextInt();
		
		int years=0, months=0, days=0;
		
		while(noOfDays > 0){
				
			if(noOfDays >= 365){
				noOfDays = noOfDays - 365;
				years++;
			}
			else if(noOfDays >= 30){
				noOfDays = noOfDays - 30;
				months++;
			}
			else {
				days = noOfDays;
				noOfDays = 0;
			}
		}
		
		System.out.println("Number of years  = "+years);
		System.out.println("Number of months = "+months);
		System.out.println("Number of days   = "+days);
		
	}
}