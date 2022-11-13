/*
Find out smallest and largest number in a given Array?
*/

class P5{
	
	public static void main(String args[]){
		
		int arr[] = {1,4,2,7,8,2,3};
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++){
			
			if(min > arr[i])
				min = arr[i];
			
			if(max < arr[i])
				max = arr[i];
		}
		
		System.out.println("The smallest element is: "+min);
		System.out.println("The largest  element is: "+max);
		
	}
}