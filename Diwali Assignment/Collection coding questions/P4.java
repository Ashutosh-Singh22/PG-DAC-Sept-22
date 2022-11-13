/*
Write a Java program to sort a given array list.
*/
import java.util.*;
class P4{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Maroon");
        System.out.println(list);
        
        //Ascending order
        Collections.sort(list);
        System.out.println(list);

        //Descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}