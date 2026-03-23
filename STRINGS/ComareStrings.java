package STRINGS;

public class ComareStrings {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        boolean isEqual = true;

        if(str1.length() != str2.length()){
            isEqual = false;
        }
        else{
            for(int i = 0; i < str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    isEqual = false;
                    break;
                }
            }
        }
        if(isEqual){
            System.out.println("Strings are equal");
        }
    }
}
