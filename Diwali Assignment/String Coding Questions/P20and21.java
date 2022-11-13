/*
Write a program to remove a given character from String?
You need to write a Java method that will accept a String and a character to be removed and return a String, which doesn't has that character e.g remove(String word, char ch).
*/
import java.util.Scanner;
class P20and21{

    static String removeChar(String str, char ch){

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                str = str.substring(0,i) + str.substring(i+1);
                return str;
            }
        }
        return str;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        System.out.print("Enter a character to remove: ");
        char ch = input.next().charAt(0);

        System.out.print(str+" after removing "+ch+" is: "+removeChar(str,ch));

    }
}