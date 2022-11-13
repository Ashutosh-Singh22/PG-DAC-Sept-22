/*
Given an array of strings, return the longest common prefix that is shared amongst all strings.
Note: you may assume all strings only contain lowercase alphabetical characters.
Ex: Given the following arrays...
["colorado", "color", "cold"], return "col"
["a", "b", "c"], return ""
["spot", "spotty", "spotted"], return "spot"
*/

import java.util.Arrays;

class P6and7{
	
	static String findCommonPrefix(String arr[]){
		
		if(arr==null)
			return null;
		else if(arr.length==1)
			return arr[0];
		
		String result = "";
		int n = arr.length;
		Arrays.sort(arr);
		
		int firstStringLength = arr[0].length();
		int prefixLength=0;
		
		for(int i=1; i<arr.length; i++){
			
			for(int j=0; j<firstStringLength; j++){
				
				if(arr[0].charAt(j)==arr[i].charAt(j))
					result += arr[0].charAt(j);
				else
					break;
			}
			
			prefixLength = result.length();
			
			result = "";
		}
		
		return arr[0].substring(0,prefixLength);
	}
	
	public static void main(String args[]){
		
		String arr1[] = {"colorado", "color", "cold"};
		String arr2[] = {"a", "b", "c"};
		String arr3[] = {"spot", "spotty", "spotted"};
		String arr4[] = {"apple", "ape", "april"};
		
		System.out.println(findCommonPrefix(arr1));
		System.out.println(findCommonPrefix(arr2));
		System.out.println(findCommonPrefix(arr3));
		System.out.println(findCommonPrefix(arr4));
	}
}