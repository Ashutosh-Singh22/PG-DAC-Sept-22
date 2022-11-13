/*
Given an array of integers, print whether the numbers are in ascending order or in descending order or in random order without sorting
Input: [5,14,35,90,139] Output: Ascending
Input: [88,67,35,14,-12] Output: Descending
Input: [65,14,129,34,7] Output: Random
*/

class P10{
	
	static void findOrder(int arr[]){
		
		int countAsc = 0;
		int countDec = 0;
		for(int i=0; i<arr.length-1; i++){
			
			if(arr[i]<arr[i+1])
				countAsc++;
			else
				countDec++;
		}
		
		if(countAsc==arr.length-1)
			System.out.println("Ascending"+);
		else if(countDec==arr.length-1)
			System.out.println("Descending");
		else 
			System.out.println("Random");
	}
	
	public static void main(String args[]){
		
		int arr1[] = {5,14,35,90,139};
		int arr2[] = {88,67,35,14,-12};
		int arr3[] = {65,14,129,34,7};
		
		findOrder(arr1);
		findOrder(arr2);
		findOrder(arr3);
	}	
}