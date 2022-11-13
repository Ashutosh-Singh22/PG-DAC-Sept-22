/*
Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).
Note: neither binary string will contain leading 0s unless the string itself is 0
Ex: Given the following binary strings...
"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return "1"
*/
// https://www.youtube.com/watch?v=SwPXgTiv8Ag -> good video
class P4and5{
	
	//static String calcBinary(...) //was giving error as return type was String
	static StringBuilder calcBinary(String s1, String s2){
		
		int i = s1.length()-1;
		int j = s2.length()-1;
		int sum=0, carry = 0;
		StringBuilder result = new StringBuilder(); // so that we can use the reverse method direclty
		
		while(i>=0 || j>=0){
			
			if(i>=0)
				sum += s1.charAt(i) - '0';	//'1'-'0' will return 1 as int
			
			if(j>=0)
				sum += s2.charAt(j) - '0';
			
			sum += carry;	//sum = sum + carry + i + j
			
			//0+0, 0+1, 1+0 produce no carry; 1+1 or 1+1+1(carry) will produce 1 carry
			if(sum>1)
				carry = 1;
			else
				carry = 0;
			
			//result += sum%2; //this does not work with StringBuilder
			result.append(sum%2);
			
			i--;
			j--;
			sum=0;
		}
		
		if(carry==1){
			//result += "1"  //this does not work with StringBuilder
			result.append("1");
			return result.reverse();
		}
		else
			return result.reverse();
		
	}
	
	public static void main(String args[]){
		
		String s1 = "1";
		String s2 = "0";
		
		System.out.println("The sum of two binary numbers are: "+calcBinary(s1,s2));
		
	}
} 