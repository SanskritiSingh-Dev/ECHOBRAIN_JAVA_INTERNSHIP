package STRINGS;

public class RemoveAlpha {
        public static void main(String[] args) {
        String s = "1H2e3l4l5o6 J7a8v9a0!";
        String res = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isLetter(c)){
                res = res + c;
            }
        }
        System.out.println("final string :" + res);
    }  
    
}
