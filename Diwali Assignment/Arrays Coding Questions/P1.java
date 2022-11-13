/*
Write a program to print elements of Array
*/

class P1{
	
	public static void main(String args[]){
		
		int arr[] = {1,2,3,4,5,6,7};
		
		System.out.println("Printing using for loop:");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("Printing using for each loop:");
		for(int e : arr){
			System.out.print(e+" ");
		}
	}
}