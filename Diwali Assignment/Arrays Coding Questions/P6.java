/*
Print the third-largest number in an array without sorting it
*/

//code will work only when we have atleast 3 distinct elements
class P6{
	
	public static void main(String args[]){
		
		int arr[] = {0,0,0,2,1};//largest: 5, second largest: 4, third largest: 3
		
		int firstLargest = arr[0];
		for(int i=0; i<arr.length; i++){
			
			if(arr[i] > firstLargest)	//
				firstLargest = arr[i];
		}
		
		System.out.println("firstLargest: "+firstLargest);
		
		int secondLargest = Integer.MIN_VALUE;
		//int secondLargest = a[0];	//doest give the right answer
		for(int i=0; i<arr.length; i++){
			
			if(arr[i] > secondLargest && arr[i] < firstLargest )
				secondLargest = arr[i];
		}
		
		System.out.println("secondLargest: "+secondLargest);
		
		int thirdLargest = Integer.MIN_VALUE;
		//int thirdLargest = a[0];	//doest give the right answer
		for(int i=0; i<arr.length; i++){
			
			if(arr[i] > thirdLargest && arr[i] < secondLargest )
				thirdLargest = arr[i];
		}
		
		System.out.println("thirdLargest: "+thirdLargest);
		
	}
}