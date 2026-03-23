package STRINGS;

public class FindLongestWord {
    public static void main(String[] args) {
        String sentence = "Asta Lavista Pasta Yummmmmy";
        String[] arr = sentence.split(" ");
        String l = arr[0];
        for (String a : arr) {
            if(a.length() > l.length()){
                l = a;
            }
        }
        System.out.println("longest word : " +l);
    }
}
