/*
Write a Java program of swap two elements in an array list.
*/
import java.util.*;
class P6{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Maroon");
        System.out.println(list);
        
        //swapping using Collections class
        Collections.swap(list,0,2);
        System.out.println(list);
    }
}