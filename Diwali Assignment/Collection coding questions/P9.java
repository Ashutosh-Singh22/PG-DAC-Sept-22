/*
Write a Java program to insert the specified element at the specified position in the linked list.
*/
import java.util.*;
class P9{
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(2,40);
        System.out.println(list);
    }
}