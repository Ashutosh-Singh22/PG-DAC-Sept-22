/*
Given a string and the ability to delete at most one character, return whether or not it can form a palindrome.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.
Ex: Given the following strings...
"abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false
*/

class P8and9{
	
	static boolean isPalindrome(String str){
		
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
			rev += str.charAt(i);
		
		if(rev.equals(str))
			return true;
		else
			return false;
	}
	
	static void findPalindrome(String str){
		
		boolean flag = false;
		
		for(int i=0; i<str.length(); i++){
			
			String temp = str.substring(0,i) + str.substring(i+1);
			flag = isPalindrome(temp);
			if(flag){
				System.out.println("true");
				return;
			}
		}
		
		System.out.println("false");
	}
	
	public static void main(String args[]){
		
		String str1 = "abcba";
		String str2 = "foobof";
		String str3 = "abccab";
		
		findPalindrome(str1);
		findPalindrome(str2);
		findPalindrome(str3);
	}
}