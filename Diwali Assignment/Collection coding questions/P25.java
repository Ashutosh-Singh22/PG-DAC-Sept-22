/*
Write a Java program to get the value of a specified key in a map
*/
import java.util.*;
class P25{
    public static void main(String args[]){
        HashMap<Integer,String> h_map = new HashMap<>();
        h_map.put(1,"Red");
        h_map.put(2,"Green");
        h_map.put(3,"Blue");

        System.out.println(h_map.get(3));
    }
}