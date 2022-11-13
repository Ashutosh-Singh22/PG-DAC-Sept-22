/*
How to convert a byte array to String?
*/

class P11{
	
	public static void main(String args[]){
		
		byte arr[] = {97,98,99,100,101};
		
		String str = new String(arr);
		
		System.out.println(str);
	}
}