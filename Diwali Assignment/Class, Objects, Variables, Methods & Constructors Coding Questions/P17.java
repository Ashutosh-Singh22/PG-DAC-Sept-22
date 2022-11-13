/*
Java Program to Illustrate Use of Constructor
*/

class P17{
	
	String ctorName;
	
	P17(){
		this.ctorName = "Default contructor";
	}
	
	P17(String ctorName){
		this.ctorName = ctorName;
	}
	
	public static void main(String args[]){
		
		P17 obj1 = new P17();
		P17 obj2 = new P17("One parameter contructor");
		
		System.out.println(obj1.ctorName);
		System.out.println(obj2.ctorName);
	}
}
