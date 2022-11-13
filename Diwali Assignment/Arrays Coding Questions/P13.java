/*
Write a program to sort an Array in Java ?
*/
import java.util.Arrays;
class P13{

    static void sort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
        int arr[] = {5,4,2,1,3};
        System.out.println(Arrays.toString(arr));
        sort(arr);
    }
}