/*
Write a Java program to check if a particular element exists in a linked list.
*/
import java.util.*;
class P12{
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        System.out.println(list.contains(10));
        System.out.println(list.contains(40));
    }
}