/*
Write a Java program to remove all the elements from a priority queue.
*/
import java.util.*;
class P21{
    public static void main(String args[]){
        PriorityQueue<Integer> p_q = new PriorityQueue<>();
        p_q.add(1);
        p_q.add(3);
        p_q.add(2);
        p_q.add(5);
        System.out.println(p_q);

        p_q.clear();
        System.out.println(p_q);
    }
}