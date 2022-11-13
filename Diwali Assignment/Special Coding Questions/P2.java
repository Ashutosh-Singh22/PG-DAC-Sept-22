/*
This question is asked by Google. Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized.
Ex: Given the following strings...
"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
*/

class P2{
	
	static boolean isCapitalizationCorrect(String str){
		
		int capitalCount = 0;
		for(int i=0; i<str.length(); i++){
			
			if(Character.isUpperCase(str.charAt(i)))
				capitalCount++;
		}
		
		if(capitalCount==str.length()) //checking for all capital letters
			return true;
		else if(capitalCount==0)		//checking for all small letters
			return true;
		else if(capitalCount==1 && Character.isUpperCase(str.charAt(0))) //checking for first letter as capital
			return true;
		else
			return false;
	}
	
	public static void main(String args[]){
		
		String str1 = "USA";
		String str2 = "Calvin";
		String str3 = "compUter";
		String str4 = "coding";
		
		System.out.println("Does "+str1+" use proper capitalization? "+isCapitalizationCorrect(str1));
		System.out.println("Does "+str2+" use proper capitalization? "+isCapitalizationCorrect(str2));
		System.out.println("Does "+str3+" use proper capitalization? "+isCapitalizationCorrect(str3));
		System.out.println("Does "+str4+" use proper capitalization? "+isCapitalizationCorrect(str4));
	}
}