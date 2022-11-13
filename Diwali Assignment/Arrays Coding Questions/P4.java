/*
Write a program to reverse an Array in java .
*/

class P4{
	
	public static void main(String args[]){
		
		int arr[] = {1,2,3,4,5,6,7};
		int revArr[] = new int[arr.length];
		
		int j=0; 
		for(int i=arr.length-1; i>=0; i--){
			
			revArr[j] = arr[i];
			j++;
		}
		
		for(int i : revArr){
			
			System.out.print(i+" ");
		}
	}
}