/*
Write a program to merge two arrays of integers by reading one number at a time from each array until 
one of the array is exhausted, and then concatenating the remaining numbers.
*/

class P7{
	
	public static void main(String args[]){
		
		int arr1[] = {23,60,94,3,102};
		int arr2[] = {42,16,74};
		
		int res[] = new int[arr1.length + arr2.length];
		
		int i=0, j=0, k=0;
		
		while( i<arr1.length && j<arr2.length){
			
			res[k] = arr1[i];
			i++;
			k++;
			
			res[k] = arr2[j];
			j++;
			k++;
		}
		
		while(i<arr1.length){
			
			res[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length){
			
			res[k] = arr2[j];
			j++;
			k++;
		}
		
		for(int e : res)
			System.out.print(e+" ");
		
	}
}