/*
Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
*/
import java.util.*;
class P19{
    public static void main(String args[]){
        TreeSet<String> t_set = new TreeSet<>();
        t_set.add("Red");
        t_set.add("Green");
        t_set.add("Blue");
        t_set.add("Yellow");
        
        System.out.println(t_set);
    }
}