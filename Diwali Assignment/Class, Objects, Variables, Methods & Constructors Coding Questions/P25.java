/*
Java Program to Check Whether Which One is Executed First, Static Block or the Static Method
*/

class P25{
	
	static
	{
		System.out.println("Static block is called");
	}
	
	static void method(){
		
		System.out.println("Static method is called");
	}
	
	public static void main(String args[]){
		
		P25.method();
		
		//static block will always be called before static method!
	}
}