package STRINGS;

public class RemoveConsonant {

    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch
                    == 'o' || ch == 'u' || !Character.isLetter(ch)) {
                result += str.charAt(i);
            }
        }
        System.out.println("After removing consonants: "
                + result);
    }
}
