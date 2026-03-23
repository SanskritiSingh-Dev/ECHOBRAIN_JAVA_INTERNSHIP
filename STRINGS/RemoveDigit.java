package STRINGS;

public class RemoveDigit {
        public static void main(String[] args) {
        String s = "He1l2lo J3a4v5a!";
        String res = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isDigit(c)){
                res = res + c;
            }
        }
        System.out.println("final string :" + res);
    }  
}
