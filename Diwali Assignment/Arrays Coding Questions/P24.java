/*
Write a program to find second largest element in a given Array in java?
*/

class P24{
    public static void main(String args[]){
        int arr[] = {5,4,-1,2,0,8,10};
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=1; i<arr.length; i++){
            if(arr[i]>largest)
                largest = arr[i];
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondLargest && arr[i]<largest)
                secondLargest = arr[i];
        }

        System.out.println("Largest element is: "+largest);
        System.out.println("Second largest element is: "+secondLargest);
    }
}