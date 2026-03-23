package STRINGS;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s = "He^^llo J@ava!";
        String res = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c) || Character.isWhitespace(c)){
                res = res + c;
            }
        }
        System.out.println("final string :" + res);
    }  
}
