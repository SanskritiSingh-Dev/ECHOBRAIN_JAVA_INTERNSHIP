package STRINGS;

public class AnagramsString {
    public static void main(String[] args) {
        String s1 = "Race";
        String s2 = "Care";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        boolean res = java.util.Arrays.equals(arr1, arr2);
        if(res){
            System.out.println("anagrams");
        }
        else{
            System.out.println("not anagrams");
        }
    }
}
