import java.util.Scanner;

class FactRecur{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		
		System.out.print(fact(num));
	}
	
	public static int fact(int num){
		int resultFact;
		if(num==1 || num ==0){
			return 1;
		}
		else{
			resultFact = num * fact(num-1);
			return resultFact;
		}
		
	}
}