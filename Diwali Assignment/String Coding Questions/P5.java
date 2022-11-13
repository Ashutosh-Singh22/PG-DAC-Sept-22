/*
How to check if a String contains only digits?
*/

class P5{
    static boolean containsOnlyDigit(String str){

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>= 48 && str.charAt(i)<=57)
                continue;
            else
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        String str1 = "123456";
        String str2 = "123adc";

        System.out.println(str1+" contains onyl digits? "+containsOnlyDigit(str1));
        System.out.println(str2+" contains onyl digits? "+containsOnlyDigit(str2));
    }
}