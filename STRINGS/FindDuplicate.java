package STRINGS;

public class FindDuplicate {

    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        String[] words = sentence.toLowerCase().split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println("Duplicate word: "
                            + words[i]);
                    break;
                }
            }
        }
    }
}
