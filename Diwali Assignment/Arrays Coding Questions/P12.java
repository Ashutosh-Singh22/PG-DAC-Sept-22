/*
How to rotate an array left and right by a given number K?
*/

//https://www.codingninjas.com/codestudio/library/program-for-array-rotation-in-java
//1) rotate the array left/right by 1 for K times ... has time complexity of O(n*K)
//2) can make time complexity O(n) but will have to make spcae complexity O(k)
import java.util.Arrays;

class P12{
	
	static void shiftLeft(int arr[], int K){
	
		for(int i=0; i<K; i++){
			
			int temp = arr[0];
			for(int j=0; j<arr.length-1; j++){
				
				arr[j] = arr[j+1];	
			}
			arr[arr.length-1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void shiftRight(int arr[], int K){
		
		for(int i=0; i<K; i++){
			
			int temp = arr[arr.length-1];
			for(int j=arr.length-1-1; j>=0; j--){
				
				arr[j+1] = arr[j];
			}
			arr[0] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String args[]){
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {10,9,8,7,6};
		
		System.out.println(Arrays.toString(arr1));
		shiftLeft(arr1,1);
		shiftLeft(arr1,2);
		shiftLeft(arr1,2);
		
		System.out.println("---------------------");
		System.out.println(Arrays.toString(arr2));
		shiftRight(arr2,1);
		shiftRight(arr2,2);
		shiftRight(arr2,2);
	}
}