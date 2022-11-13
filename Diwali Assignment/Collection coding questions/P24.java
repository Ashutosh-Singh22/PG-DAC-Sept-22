/*
Write a Java program to check whether a map contains key-value mappings (empty) or not
*/
import java.util.*;
class P24{
    public static void main(String args[]){
        HashMap<Integer,String> h_map = new HashMap<>();
        h_map.put(1,"Red");
        h_map.put(2,"Green");
        h_map.put(3,"Blue");

        boolean result = h_map.isEmpty();
        System.out.println("Is hash map empty: " + result);

        h_map.clear();
        result = h_map.isEmpty();
        System.out.println("Is hash map empty: " + result);

    }
}