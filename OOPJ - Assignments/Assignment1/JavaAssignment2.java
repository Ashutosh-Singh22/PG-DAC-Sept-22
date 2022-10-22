/*02.Write a program that takes radius of a circle as input. Read the entered radius 
using Scanner class. Then calculate and print the area and circumference of the circle.
*/

import java.util.Scanner;

class JavaAssignment2{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter radius for a circle");
		int radius = input.nextInt();
		
		System.out.println( "The circumference is "+(2*3.14f*radius) );
		System.out.println( "The area of is "+(3.14f*radius*radius) );
		
	}
}