/*
How to find duplicate elements in a given Array
*/
class P18{
    static void findDups(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,1,4,2,4,5,6};

        findDups(arr);
    }
}