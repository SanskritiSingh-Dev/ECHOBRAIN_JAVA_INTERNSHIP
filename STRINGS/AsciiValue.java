package STRINGS;

public class AsciiValue {

    public static void main(String[] args) {
        String str = "ABC";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " = " + (int) str.charAt(i));
        }
    }
}
