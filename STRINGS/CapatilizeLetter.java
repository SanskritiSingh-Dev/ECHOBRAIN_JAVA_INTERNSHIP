package STRINGS;

public class CapatilizeLetter {

    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase()
                    + words[i].substring(1);
        }
        String result = String.join(" ", words);
        System.out.println(result);
    }
}
