/*
How to check if two Strings are anagrams of each other?
*/
import java.util.Arrays;
class P3{
    static boolean isAnagram(String str1, String str2){
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<str1.length(); i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        String str1 = "bored";
        String str2 = "robed";
        String str3 = "board";

        System.out.println(str1+" and "+str2+" are anagram of each other? "+isAnagram(str1,str2));
        System.out.println(str1+" and "+str3+" are anagram of each other? "+isAnagram(str1,str3));
    }
}