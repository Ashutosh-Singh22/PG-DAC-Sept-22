/*
How to convert Array to ArrayList in java ?
*/
import java.util.ArrayList;
class P21{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,1,3};

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
            list.add(arr[i]);

        System.out.println(list);
    }
}