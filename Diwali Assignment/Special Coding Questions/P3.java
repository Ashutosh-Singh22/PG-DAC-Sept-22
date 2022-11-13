/*
This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.
Ex: Given the following strings...
"LR", return true
"URURD", return false
"RUULLDRD", return true
*/

class P3{
	
	static boolean willBeBackToOriginalPosition(String str){
		
		int countHorizontal = 0;
		int countVertical = 0;
		
		for(int i=0; i<str.length(); i++){
			
			if(str.charAt(i)=='R')
				countHorizontal++;
			else if(str.charAt(i)=='L')
				countHorizontal--;
			else if(str.charAt(i)=='U')
				countVertical++;
			else
				countVertical--;
		}
		
		return (countHorizontal==0 && countVertical==0);
	}
	
	public static void main(String args[]){
		
		String str1 = "LR";
		String str2 = "URURD";
		String str3 = "RUULLDRD";
		
		System.out.println("Is robot back at original position after moving: "+str1+" ? "+willBeBackToOriginalPosition(str1));
		System.out.println("Is robot back at original position after moving: "+str2+" ? "+willBeBackToOriginalPosition(str2));
		System.out.println("Is robot back at original position after moving: "+str3+" ? "+willBeBackToOriginalPosition(str3));
		
	}
}