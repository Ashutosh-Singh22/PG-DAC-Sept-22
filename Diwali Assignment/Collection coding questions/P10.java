/*
Write a Java program to insert elements into the linked list at the first and last position.
*/
import java.util.*;
class P10{
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.addFirst(40);
        list.addLast(50);
        System.out.println(list);
    }
}