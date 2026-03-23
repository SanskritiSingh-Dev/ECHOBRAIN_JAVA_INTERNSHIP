package STRINGS;

public class FindPrintDigit {

    public static void main(String[] args) {
        String str = "abc123def45";
        String digits = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
            }
        }
        System.out.println("Digits: " + digits);
    }
}
