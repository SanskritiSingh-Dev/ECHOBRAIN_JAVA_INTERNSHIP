package STRINGS;

public class SortWord {

    public static void main(String[] args) {
        String sentence = "Java Python C C++";
        String[] words = sentence.split(" ");

        java.util.Arrays.sort(words);

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
