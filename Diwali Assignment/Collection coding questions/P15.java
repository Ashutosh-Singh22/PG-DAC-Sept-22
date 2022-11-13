/*
Write a Java program to iterate through all elements in a hash list.
*/
import java.util.*;
class P15{
  public static void main(String[] args) {
    // Create a empty hash set
    HashSet<String> h_set = new HashSet<String>();
    // use add() method to add values in the hash set
    h_set.add("Red");
    h_set.add("Green");
    h_set.add("Black");
    h_set.add("White");
    h_set.add("Pink");
    h_set.add("Yellow");
    //dups will not be added
    h_set.add("Pink");

    for(String ele : h_set)
        System.out.print(ele+" ");
   }
}
