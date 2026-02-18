public class CamelToUpper {
    public static void main(String[] args) {
        String s = "Java";
        String res = "";
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char upperCase = (char)(ch - 2);
                res = res + upperCase;
            }
            else{
                res = res + ch;
            }
        }
        System.out.println("upper case result: " + res);
    }
}
