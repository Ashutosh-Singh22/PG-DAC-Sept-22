/*
Given two arrays, find the intersection between them?
*/

class P16{

    static void findIntersection(int arr1[], int arr2[]){

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j])
                    System.out.print(arr2[j]+" ");
            }
        }
    }

    public static void main(String args[]){

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int arr3[] = {3,3,4,4,5};

        findIntersection(arr1,arr2);
        findIntersection(arr1,arr3);
    }
}