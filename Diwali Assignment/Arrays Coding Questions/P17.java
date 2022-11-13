/*
Find the missing number in an Array between 1 to 100. Given only one number is missing
*/

class P17{
    public static void main(String args[]){

        int arr[] = new int[100];
        int length= arr.length;

        for(int i=0; i<length; i++){
            arr[i] = i+1;
        }

        arr[54] = 0;

        int sumOFFirst100NaturalNos = 5050;
        int sumOfArr = 0;
        for(int i=0; i<arr.length; i++){
            sumOfArr += arr[i];
        }

        System.out.println("Missing number is: "+(sumOFFirst100NaturalNos-sumOfArr));
    }
}