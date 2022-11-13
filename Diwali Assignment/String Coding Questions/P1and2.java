/*
How to Print duplicate characters from String?
For example, if String is "Java" then the program should print "a"
*/
class P1and2{
    public static void main(String args[]){
        String str = "Java";

        for(int i=0; i<str.length()-1; i++){

            for(int j=i+1; j<str.length(); j++){
                
                if(str.charAt(i)==str.charAt(j)){
                    System.out.print(str.charAt(i)+" ");
                    break;
                }
            }
        }
    }
}