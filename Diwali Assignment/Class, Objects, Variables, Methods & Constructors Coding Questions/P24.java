/*
Java Program to Demonstrate Usage of a Static Variable in the Test Class
*/

class Test{
	
	static int variable;
	
	public static void main(String args[]){
		
		System.out.println("Static variable: "+variable);
		//above or below methods can be used
		System.out.println("Static variable: "+Test.variable);
	}
}