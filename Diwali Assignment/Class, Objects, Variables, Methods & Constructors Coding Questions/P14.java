/*
Java Program to Create a Method with 2 Parameters and without Return Type
*/
class P14{

	void sum(int a, int b){
		System.out.println("The sum is: "+(a+b));
	}
	
	public static void main(String args[]){
		
		P14 obj = new P14();
		
		obj.sum(1,10);
	}
}