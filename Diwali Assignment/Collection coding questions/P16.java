/*
Write a Java program to empty an hash set.
*/
import java.util.*;
class P16{
  public static void main(String[] args) {
    HashSet<String> h_set = new HashSet<String>();

    h_set.add("Red");
    h_set.add("Green");
    h_set.add("Black");
    h_set.add("White");
    h_set.add("Pink");
    h_set.add("Yellow");
    System.out.println(h_set);

    h_set.clear();
    System.out.println(h_set);
   }
}