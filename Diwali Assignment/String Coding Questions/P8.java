/*
How to count the occurrence of a given character in String?
*/
class P8{

    static int countOfChar(String str, char find){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==find)
                count++;
        }

        return count;
    }

    public static void main(String args[]){

        String str = "Programming";

        System.out.println("Count of letter: g in "+str+" is = "+countOfChar(str, 'g'));
    }
}