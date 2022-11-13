/*
Write a Java program to append the specified element to the end of a linked list.
*/
import java.util.*;
class P8{
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(40);
        System.out.println(list);
    }
}