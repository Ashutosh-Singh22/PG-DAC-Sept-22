/*
Java Program to Create an Object for Class and Assign Value in the Object using Constructor
*/

class P19{
	
	String ctorName;
	
	P19(){
		this.ctorName = "Default contructor";
	}
	
	P19(String ctorName){
		this.ctorName = ctorName;
	}
	
	public static void main(String args[]){
		
		P18 obj = new P18("One parameter contructor");

		System.out.println(obj.ctorName);
	}
}