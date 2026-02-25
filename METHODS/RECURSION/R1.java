package RECURSION;


public class R1 {
    public static void main(String[] args) {
        System.out.println("hi..");
        String[] n = new String[1];//length 1
        main(n); //calling same method , memory full then stakOverFlow
    }

    
}