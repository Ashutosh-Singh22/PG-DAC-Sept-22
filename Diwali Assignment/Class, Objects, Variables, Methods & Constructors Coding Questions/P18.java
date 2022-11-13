/*
Java Program to Illustrates Use of Chaining Constructor
*/

class P18{
	
	String ctorName;
	
	P18(){
		this("Contructor chaining");
	}
	
	P18(String ctorName){
		this.ctorName = ctorName;
	}
	
	public static void main(String args[]){
		
		P18 obj1 = new P18();
		P18 obj2 = new P18("One parameter contructor");
		
		System.out.println(obj1.ctorName);
		System.out.println(obj2.ctorName);
	}
}