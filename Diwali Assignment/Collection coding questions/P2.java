/*
Write a Java program to insert an element into the array list at the first position.
*/
import java.util.*;
class P2{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        
        System.out.println(list);

        list.add(0,"Purple");
        System.out.println(list);
    }
}