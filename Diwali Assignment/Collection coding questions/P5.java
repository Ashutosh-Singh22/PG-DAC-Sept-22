/*
Write a Java program to reverse elements in a array list.
*/
import java.util.*;
class P5{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Maroon");
        System.out.println(list);
        
        //Sorting in reverse using Collections class
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}