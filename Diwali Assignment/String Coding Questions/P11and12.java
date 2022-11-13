/*
How to replace each given character to other e.g. blank with %20?
For example, if the input is "Java is Great" and asked to replace space with %20 then it should be "Java%20is%20Great".
*/

class P11and12{
    public static void main(String args[]){
        String str = "Java is Great";

        str = str.replace(" ", "%20");
        System.out.println(str);
    }
}