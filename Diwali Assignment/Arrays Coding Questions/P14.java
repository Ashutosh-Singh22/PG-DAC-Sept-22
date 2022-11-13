/*
Write a program to check whether two given Arrays are equal, 
given both contains same data type and same length ?
*/
import java.util.Arrays;
class P14{

    static void compareArray(int arr1[], int arr2[]){

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]==arr2[i])
                continue;
            else{
                System.out.println("Both arrays are unequal");
                return;
            }
        }
        System.out.println("Both arrays are equal");
    }
    public static void main(String args[]){
        int arr1[] = {1,4,3,5,2};
        int arr2[] = {5,4,3,1,6};
        int arr3[] = {1,2,3,4,5};

        compareArray(arr1,arr2);
        compareArray(arr1,arr3);

    }
}