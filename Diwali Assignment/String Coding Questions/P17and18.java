/*
How to check if a String is a valid shuffle of two String?
For example, given first = "abc" and second = "def", third = "dabecf" is a valid shuffle since it preserves the character ordering of the two strings.
*/
class P17and18{
    static boolean isValidShuffle(String first, String second, String third){
        int i=0,j=0,k=0;

        while(k<third.length()){

            if( i<first.length() && (first.charAt(i)==third.charAt(k))){
                i++;
                k++;
            }
            else if(j<second.length() && (second.charAt(j)==third.charAt(k))){
                j++;
                k++;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        String first = "abc";
        String second = "def";
        String third = "dabecf";

        System.out.println(isValidShuffle(first,second,third));
    }
}