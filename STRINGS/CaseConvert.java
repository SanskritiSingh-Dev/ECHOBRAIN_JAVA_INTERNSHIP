package STRINGS;

public class CaseConvert {

    public static void main(String[] args) {
        // string
        String str = "Java PROgramming";
        String result = "";
        // to visit each char
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += c;
            }
        }
        System.out.println("resultant string is : " + result);
    }
}
