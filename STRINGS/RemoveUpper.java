package STRINGS;

public class RemoveUpper {
    public static void main(String[] args){
        String s = "hello WORLD";
        String res = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isUpperCase(c)){
                res = res + c;
            }
        }
        System.out.println("final string :" + res);
    }
    
}
