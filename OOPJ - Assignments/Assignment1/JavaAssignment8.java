/*
08.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000, 
then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal 
to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's 
salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
*/

import java.util.Scanner;

class JavaAssignment8{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter the base salary ");
		int basicSalary = input.nextInt();
		
		float HRA, DA , grossSalary;

		if(basicSalary < 10000){
			
			HRA = basicSalary*0.1f; // 10% => 10/100 => 0.1
			DA  = basicSalary*0.9f; // 90% => 90/100 => 0.9
			grossSalary = basicSalary + HRA + DA;
		}
		else{
			
			HRA = 2000.0f;
			DA  = basicSalary*0.98f; // 98% => 98/100 => 0.98
			grossSalary = basicSalary + HRA + DA;
		}
		
		System.out.println("The gross salary is = "+grossSalary);
		
	}
}