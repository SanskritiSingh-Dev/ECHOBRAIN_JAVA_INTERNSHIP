package STRINGS;

public class StringIsNumeric {

    public static void main(String[] args) {
        String str = "-123.45";
        boolean isNumeric = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isDigit(ch) && ch != '-' && ch
                    != '.') {
                isNumeric = false;
                break;
            }
        }

        if (isNumeric) {
            System.out.println("Numeric value"); 
        }else {
            System.out.println("Not numeric");
        }

    }
}
