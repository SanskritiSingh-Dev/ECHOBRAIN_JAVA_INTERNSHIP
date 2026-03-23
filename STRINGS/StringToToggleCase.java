package STRINGS;

public class StringToToggleCase {

    public static void main(String[] args) {
        String str = "Java Is FUN";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch); 
            }else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch); 
            }else {
                result += ch;
            }
        }

        System.out.println("Toggle case: " + result);
    }

}
