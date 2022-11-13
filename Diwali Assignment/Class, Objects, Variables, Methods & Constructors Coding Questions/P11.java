/*
Java Program to Illustrate Use of Methods in a Class
*/

class P11{
	
	static final String CLASSNAME = "P11";
	
	void sum(int a, int b){
		System.out.println("Sum of "+a+" & "+b+" is: "+(a+b));
	}
	
	//method overloading
	void sum(int a, int b, int c){
		System.out.println("Sum of "+a+" , "+b+" & "+c+" is: "+(a+b+c));
	}
	
	//int return 
	int multiply(int a, int b){
		return a*b;
	}
	
	//static method
	static void display(){
		System.out.println("Instance of "+CLASSNAME);
	}
	
	public static void main(String args[]){
		
		P11 obj = new P11();
		
		P11.display();
		obj.sum(5,10);
		obj.sum(5,10,15);
		System.out.println("Multiplication result is: "+obj.multiply(10,5));
	}
}