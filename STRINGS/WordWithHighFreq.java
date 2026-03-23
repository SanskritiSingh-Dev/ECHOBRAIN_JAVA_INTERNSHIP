package STRINGS;

public class WordWithHighFreq {

    public static void main(String[] args) {
        String sentence = "apple banana apple mango banana
apple
        ";
String[] words = sentence.split(" ");
        String maxWord = "";
        int maxCount = 0;

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxWord = words[i];
            }
        }
        System.out.println("Highest frequency word: "
                + maxWord + " (" + maxCount + " times)");
    }
}
