package STRINGS;

public class CharShift {
    public static void main(String[] args) {
        String str = "123";
        String encoded = "";
        for(int i = 0; i < str.length(); i++){
            encoded += (char)(str.charAt(i) + 2);
        }
        System.out.println("encoded : " + encoded);
    }
}
