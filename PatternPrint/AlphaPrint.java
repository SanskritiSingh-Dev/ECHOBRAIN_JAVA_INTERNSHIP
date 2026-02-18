public class AlphaPrint {
    public static void main(String[] args) {

        char ch = 'Z';

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch--; 
            }
              // move to next letter
            System.out.println();
        }
    }
}

