/*
Write a Java program to convert a priority queue to an array containing all of the elements of the queue
*/
import java.util.*;
class P23{
    public static void main(String args[]){
        PriorityQueue<Integer> p_q = new PriorityQueue<>();
        p_q.add(1);
        p_q.add(3);
        p_q.add(2);
        p_q.add(5);
        System.out.println(p_q);

        Object arr[] = p_q.toArray();

        for(Object ele : arr)
            System.out.print(ele+" ");
    }
}