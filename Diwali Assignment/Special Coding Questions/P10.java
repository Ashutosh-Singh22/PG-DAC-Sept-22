/*
Given a string representing your stones and another string representing a list of jewels, 
return the number of stones that you have that are also jewels.
Ex: Given the following jewels and stones...
jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0
*/

class P10{
	
	static int countOfStones(String jewel, String stone){
		
		int count = 0;
		
		for(int i=0; i<jewel.length(); i++){
			
			for(int j=0; j<stone.length(); j++){
				
				if(jewel.charAt(i)==stone.charAt(j))
					count++;
			}
		}
		
		return count;
	}
	
	public static void main(String args[]){
	
		String jewels1 = "abc";
		String stones1 = "ac";
		System.out.println(countOfStones(jewels1, stones1));
		
		String jewels2 = "Af";
		String stones2 = "AaaddfFf";
		System.out.println(countOfStones(jewels2, stones2));
		
		String jewels3 = "AYOPD";
		String stones3 = "ayopd";
		System.out.println(countOfStones(jewels3, stones3));
		
	}
}