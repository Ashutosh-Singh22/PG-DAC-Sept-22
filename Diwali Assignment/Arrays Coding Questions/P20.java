/*
How do you separate zeros and non-zeros in a given Array in java?
*/
import java.util.Arrays;
class P20{
    
    static int[] reOrder(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                temp[n-1] = arr[i];
                n--;
            }
        }
        return temp;
    }
    public static void main(String args[]){
        int arr[] = {1,3,2,0,-10,0,3,4,0};
        System.out.println(Arrays.toString(arr));

        arr = reOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}