package STRINGS;

public class GroupChar {

    public static void main(String[] args) {
        String str = "ab12#@CD";
        String letters = "", digits = "", specials = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                letters += ch; 
            }else if (Character.isDigit(ch)) {
                digits += ch; 
            }else {
                specials += ch;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Specials: " + specials);
    }

}
