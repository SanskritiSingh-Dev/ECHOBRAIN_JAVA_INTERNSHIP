//reading and writing bitwise operations

public class BitwiseOp {
    public static void main(String[]args){
        byte read = 1;
        byte write = 2;
        byte exec = 4;

        int permission = read | write; // 1 | 2 = 3
        System.out.println("Permission: you can read and write");
    }
    
}
