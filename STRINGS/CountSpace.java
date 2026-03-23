package STRINGS;

public class CountSpace {
    public static void main(String[] args) {
        String str = "H e l l o  W o r l d";
        int count= 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count ++;
            }
        }
        System.out.println("space count is : " + count);
    }
}
