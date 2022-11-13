/*
How to return the highest occurred character in a String?
For example if input is "aaaaaaaaaaaaaaaaabbbbcddddeeeeee" it should return "a".
*/

class P19{

    static int arr[] = new int[256];

    static void maxOccurrence(String str){

        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)]++;
        }

        int maxIndex = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[maxIndex])
                maxIndex = i;
        }

        System.out.println("highest occurred character: "+(char)maxIndex);
    }

    public static void main(String args[]){
        String str = "aaaaaaaaaaaaaaaaabbbbcddddeeeeee";

        maxOccurrence(str);
    }
}