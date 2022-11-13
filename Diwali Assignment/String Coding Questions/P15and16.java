/*
How to remove duplicate characters from String?
For example, if the input is ‘bananas’ the output will be ‘bans’.
*/
class P15and16{

    static String removeDups(String str){
        String noDups = "";
    Outer: for(int i=str.length()-1; i>=0; i--){
            for(int j=0; j<i; j++){  
                
                if(str.charAt(i)==str.charAt(j))
                    continue Outer;
            }

            noDups += str.charAt(i);
        }

        String noDupsRev = "";
        for(int i=noDups.length()-1; i>=0; i--)
            noDupsRev += noDups.charAt(i);

        return noDupsRev;
    }

    public static void main(String args[]){
        String str = "repetition";
        System.out.println(str+" without dups is: "+removeDups(str));

        String str2 = "bananas";
        System.out.println(str2+" without dups is: "+removeDups(str2));
    }
}