package STRING;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        //string
        String str = "program";
        //stroing char in arr
        char[] arr = str.toCharArray();

        //sorthing predefined method
        Arrays.sort(arr);
        //constructor for the stored result
        String res = new String(arr);
        
        System.out.println("sorrted array : " + res);

    }
}
