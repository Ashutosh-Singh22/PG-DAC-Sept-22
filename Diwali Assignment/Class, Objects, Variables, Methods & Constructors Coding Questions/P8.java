/*
Java Program to Count Number of Objects Created for Class
*/

class P8{
	
	static int objCount;
	
	{
		objCount++;
	}
	
	public static void main(String args[]){
		
		P8 obj1 = new P8();
		P8 obj2 = new P8();
		System.out.println("Number of objects created: "+P8.objCount);
		
		new P8();
		new P8();
		new P8();
		System.out.println("Number of objects created: "+P8.objCount);
	}
}