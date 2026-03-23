package STRINGS;

public class CountWords {
    public static void main(String[] args) {
        String s = "Java is intresting language.";
        String[] words = s.trim().split("\\s+");
        System.out.println("words are:" + words.length);
    }
}
