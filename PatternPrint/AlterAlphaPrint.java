public class AlterAlphaPrint {
    public static void main(String[] args) {

        int pos = 0;   // letter position counter

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                if (i % 2 == 1)   // odd row → uppercase
                    System.out.print((char)('A' + pos) + " ");
                else              // even row → lowercase
                    System.out.print((char)('a' + pos) + " ");

                pos++;
            }

            System.out.println();
        }
    }
}

