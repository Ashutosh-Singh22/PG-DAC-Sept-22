/*
How to program to print the first non repeated character from String?
*/
class P4{

    static void nonRepeatedChar(String str){

        char arr[] = str.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(str.indexOf(arr[i])==str.lastIndexOf(arr[i])){
                System.out.println(arr[i]);
                return;
            }
        }
    }
    public static void main(String args[]){
        String str1 = "elevale";
        String str2 = "elelea";
        String str3 = "elele";

        nonRepeatedChar(str1);
        nonRepeatedChar(str2);
    }
}