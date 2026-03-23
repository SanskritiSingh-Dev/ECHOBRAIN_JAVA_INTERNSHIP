package STRINGS;

public class CharCheck {
    public static void main(String[] args) {
        String str = "Java Programming";
        char search = 'g';
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == search) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }

    }
}
