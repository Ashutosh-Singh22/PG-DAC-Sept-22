/*
Write a Java program to convert a hash set to an array.
*/
import java.util.*;
class P17{
  public static void main(String[] args) {
    HashSet<String> h_set = new HashSet<String>();

    h_set.add("Red");
    h_set.add("Green");
    h_set.add("Black");
    h_set.add("White");
    h_set.add("Pink");
    h_set.add("Yellow");
    System.out.println(h_set);

    String arr[] = new String[h_set.size()];
    h_set.toArray(arr);

    for(String ele : arr)
        System.out.println(ele);
   }
}