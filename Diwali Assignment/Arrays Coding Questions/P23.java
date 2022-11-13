/*
How to convert ArrayList to String Array in java ?
*/
import java.util.*;
class P23{
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("1");
        list.add("5");

        String str[] = new String[list.size()];

        for(int i=0; i<list.size(); i++){
            str[i] = list.get(i);
        }

        for(String ele : str)
            System.out.print(ele+" ");
    }
}