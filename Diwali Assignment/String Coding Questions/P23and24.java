/*
How to sort String on their length in Java?
Write a Program to sort String on their length in Java? Your method should accept an array of 
String and return a sorted array based upon the length of String.
*/
import java.util.Arrays;
class P23and24{

    static void sortOnLength(String arr[]){

        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){

                if(arr[j].length()>arr[j+1].length()){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){

        String arr[] = {"My", "name", "is","Ashutosh","Singh"};
        sortOnLength(arr);
        System.out.println(Arrays.toString(arr));
    }
}