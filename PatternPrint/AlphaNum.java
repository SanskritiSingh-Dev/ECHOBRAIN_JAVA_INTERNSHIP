public class AlphaNum {
    public static void main(String[] args) {

        char ch = 'A';
        int num = 1;

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + "" + num + " ");
                ch++;
                num++;
            }

            System.out.println();
        }
    }
}

