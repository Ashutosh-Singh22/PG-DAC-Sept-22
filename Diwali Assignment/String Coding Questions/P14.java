/*
How to reverse words in a sentence without using a library method?
*/
class P14{
    public static void main(String args[]){
        String str = "how to reverse a string";
        
        String arr[] = str.split(" ");

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}