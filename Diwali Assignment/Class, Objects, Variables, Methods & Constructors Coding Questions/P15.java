/*
Java Program to Illustrate the Use of HashCode() Method
*/
class P15{
	
	int num1;
	int num2;
	
	P15(){
		
	}
	
	P15(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int hashCode(){
		return 17*num1 + 97*num2;
	}
	
	public boolean equals(P15 obj){
		if(this.hashCode() == obj.hashCode())
			return true;
		else
			return false;
	}
	
	public static void main(String args[]){
		
		P15 obj1 = new P15(5,10);
		P15 obj2 = new P15(10,5);
		P15 obj3 = new P15(5,10);
		
		System.out.println("obj1.equals(obj2): "+obj1.equals(obj2));
		System.out.println("obj1.equals(obj3): "+obj1.equals(obj3));
		
	}
}