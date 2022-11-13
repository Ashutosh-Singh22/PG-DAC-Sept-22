/*
How to convert Array to TreeSet in java ?
*/
import java.util.*;
class P22{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,1,2,3};

        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<arr.length; i++)
            set.add(arr[i]);

        System.out.println(set);
    }
}