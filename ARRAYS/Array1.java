package ARRAYS;

public class Array1{
    public static void main(String[] args){
        int[] arr = new int[5]; //we can also initialize and declare {1,2,3,4,5}
        //store the data in array 
        for(int i = 0; i< arr.length; i++){
            arr[i] = i+1;
        }
        //print the stored data
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        //for each loop to travrse an print data
        for (int i : arr){
            System.out.println(i);
        }

    }
}