package STRINGS;

public class StringOnlyAlpha {

    public static void main(String[] args) {
        String str = "HelloWorld";
        boolean onlyAlpha = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                onlyAlpha = false;
                break;
            }
        }

        if (onlyAlpha) {
            System.out.println("Only alphabets");
        } else {
            System.out.println("Contains other characterstoo");
        }

    }
}
