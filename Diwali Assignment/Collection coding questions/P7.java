/*
Write a Java program to print all the elements of a ArrayList using the position of the elements.
*/
import java.util.*;
class P7{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Maroon");
        
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}