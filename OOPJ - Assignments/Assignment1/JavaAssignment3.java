/*
03.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
Take the obtained marks from user using Scanner class. Output should be in 
this format [ percentage marks = 99 % ]. Use concatenation operator here
*/

import java.util.Scanner;

class JavaAssignment3{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter subject 1 marks b/w 1&100");
		int marksSub1 = input.nextInt();
		System.out.println("Enter subject 2 marks b/w 1&100");
		int marksSub2 = input.nextInt();
		System.out.println("Enter subject 3 marks b/w 1&100");
		int marksSub3 = input.nextInt();
		System.out.println("Enter subject 4 marks b/w 1&100");
		int marksSub4 = input.nextInt();
		System.out.println("Enter subject 5 marks b/w 1&100");
		int marksSub5 = input.nextInt();
		
		int sum = marksSub1+marksSub2+marksSub3+marksSub4+marksSub5;
		
		System.out.println("percentage marks = "+ (100*sum/500) +" %" );
		
	}
}