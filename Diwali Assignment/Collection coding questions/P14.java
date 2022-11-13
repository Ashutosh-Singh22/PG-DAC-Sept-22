/*
Write a Java program to replace an element in a linked list.
*/
import java.util.*;
class P14{
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.set(1,40);
        System.out.println(list);
    }
}