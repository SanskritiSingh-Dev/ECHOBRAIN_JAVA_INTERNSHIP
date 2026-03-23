package STRINGS;

public class CheckForSubstring {
    public static void main(String[] args) {
        String str = "hello world java";
        String[] l = {"java", "python", "c++"};
        boolean found = false;
        for (String string : l) {
            if(str.contains(string)){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("contains at least one word from the list");
        }
        else{
            System.out.println("no match found");
        }
    }
}
