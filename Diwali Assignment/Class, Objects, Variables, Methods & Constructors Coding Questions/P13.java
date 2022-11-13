/*
Java Program to Create a Method without Parameters and Return Type
*/
class P13{
	
	int a;
	int b;
	
	P13(){
		
	}
	
	P13(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void sum(){
		System.out.println("The sum is: "+(a+b));
	}
	
	void power(){
		System.out.println("The power is: "+Math.pow(a,b));
	}
	
	public static void main(String args[]){
		
		P13 obj = new P13(5,10);
		
		obj.sum();
		obj.power();
	}
}
