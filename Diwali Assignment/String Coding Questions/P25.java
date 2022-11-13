/*
This question is asked by Facebook. Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical characters.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.
Ex: Given the following strings...
"A man, a plan, a canal: Panama.", return true
*/
class P25{
	
	static String removeExtraCharacters(String str){
		
		String result = "";
		
		for(int i=0; i<str.length(); i++){
			
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
				result += (char)(str.charAt(i)+32);
			else if(str.charAt(i)>=97 && str.charAt(i)<=122)
				result += str.charAt(i);
		}
		
		return result;
	}
	
	static boolean isPalindrome(String str){
		
		String temp = "";
		for(int i=str.length()-1; i>=0; i--){
			
			temp += str.charAt(i);
		}
		
		return (str.equals(temp));
	}
	
	public static void main(String args[]){
		
		String str = "A man, a plan, a canal: Panama.";
		String strTemp = removeExtraCharacters(str);
		
		if(isPalindrome(strTemp))
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+" is NOT a palindrome");
	}
}