package STRING;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        //string
        String str = "cinematography";
        //stroing char in arr
        char[] arr = str.toCharArray();

        //sorthing predefined method
        Arrays.sort(arr);
        //constructor for the stored result
        String res = new String(arr);

        System.out.println("sorrted array : " + res);

        //using comareto method
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                //getting the values of both strings
                String s1 = String.valueOf(arr[i]);
                String s2 = String.valueOf(arr[j]);
                if(s1.compareTo(s2) > 0){
                    //swaping
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String result = new String(arr);
        //print
        System.out.println("sorting using compare to method: " + result);

    }
}
