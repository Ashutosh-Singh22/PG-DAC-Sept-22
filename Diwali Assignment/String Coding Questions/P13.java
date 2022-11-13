/*
How to find all permutations of String?
*/
class P13{

    static void calcPermutation(String str, String res){

        if(str.length()==0){
            System.out.println(res);
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String temp = str.substring(0,i)+str.substring(i+1);
            calcPermutation(temp, res+ch);
        }
    }

    public static void main(String args[]){
        String str = "ab";

        calcPermutation(str,"");
    }
}