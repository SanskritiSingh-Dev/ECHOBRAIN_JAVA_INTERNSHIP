package STRINGS;

public class StringOnlyDigit {

    public static void main(String[] args) {
        String str = "123456";
        boolean onlyDigits = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                onlyDigits = false;
                break;
            }
        }

        if (onlyDigits) {
            System.out.println("Only digits"); 
        }else {
            System.out.println("Contains non-digit characters");
        }
    }
}
