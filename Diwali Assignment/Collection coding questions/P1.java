/*
Write a Java program to create a new array list, add some colors (string) and print out the collection.
*/
import java.util.*;
class P1{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        
        //1st way
        //System.out.println(list);

        //2nd way
        for(String ele : list)
            System.out.print(ele+" ");
    }
}