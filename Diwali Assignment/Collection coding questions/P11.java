/*
Write a Java program to display the elements and their positions in a linked list.
*/
import java.util.*;
class P11{
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //for(int i=0; i<=list.lastIndexOf(list.getLast()); i++)
        for(int i=0; i<list.size(); i++)
            System.out.println("Element: "+list.get(i)+", position: "+(i+1));
    }
}