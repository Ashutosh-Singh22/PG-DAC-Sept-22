/*
Write a program which takes an array of integers and 
prints the running average of 3 consecutive integers
*/

class P8{
	
	public static void main(String args[]){
	
		int arr[] = {5,14,35,89,140};
		int n = arr.length;
		if(n>=3){
			
			for(int i=0; i<=n-3; i++){ //i=0,1,2
				
				int avg = (arr[i]+arr[i+1]+arr[i+2])/3;
				System.out.println(avg);
			}
		}
		else{
			System.out.println("Please provide an array of size >= to 3");
		}
	}
}