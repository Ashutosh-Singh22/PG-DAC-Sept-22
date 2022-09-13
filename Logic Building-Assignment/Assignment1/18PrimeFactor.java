import java.util.Scanner;

class PrimeFactor{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int tempNum = num;
		
		
		System.out.println("The prime factors of "+num+" is/are: ");
		int divisor = 2;
		while(tempNum>1){
			
			if(tempNum%divisor==0){
				System.out.print(divisor+" ");
				tempNum = tempNum / divisor;
			}
			else
				divisor++;	
		}
	} 
}