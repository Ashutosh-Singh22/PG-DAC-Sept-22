
class OneToTen{
	public static void main(String args[]){
		func(10);	
	}
	
	public static void func(int num){
		if(num<=1)
			System.out.print(num+" ");
		else{
			func(num-1);
			System.out.print(num+" ");
		}
	}
}
/*
java:4: error: non-static method func(int) cannot be referenced from a static context
                func(10);
                ^
*/