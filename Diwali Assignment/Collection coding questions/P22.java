/*
Write a Java program to count the number of key-value (size) mappings in a map
*/
import java.util.*;
class P22{
    public static void main(String args[]){
        HashMap<Integer,String> h_map = new HashMap<>();
        h_map.put(1,"Red");
        h_map.put(2,"Green");
        h_map.put(3,"Blue");
        System.out.println(h_map.size());
    }
}