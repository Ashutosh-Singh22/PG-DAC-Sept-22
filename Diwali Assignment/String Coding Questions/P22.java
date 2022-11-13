/*
Write a program to find the longest palindrome in a string?
*/
class P22{

    static boolean isPalindrome(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--)
            rev += str.charAt(i);
        
        if(str.equals(rev))
            return true;
        else
            return false;
    }
    static String longestPalindrome(String str){

        String hold = "";
        String longPalin = "";
        int len = 0;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){

                hold = str.substring(i,j);
                if(isPalindrome(hold) && hold.length()>len){
                    longPalin = hold;
                    len = hold.length();
                }
            }
        }
        return longPalin;
    }
    public static void main(String args[]){
        String str = "forgeeksskeegfor";
        String str2 = "hallaween";
        System.out.println("Longest palindrome: "+longestPalindrome(str));
        System.out.println("Longest palindrome: "+longestPalindrome(str2));
    }
}