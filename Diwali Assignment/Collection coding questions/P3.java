/*
Write a Java program to retrieve an element (at a specified index) from a given array list.
*/
import java.util.*;
class P3{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        System.out.println(list);

        System.out.println(list.get(2));
        //will give IndexOutOfBoundsException if index value > no of elements
    }
}