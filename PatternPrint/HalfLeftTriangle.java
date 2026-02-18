public class HalfLeftTriangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {          // rows
            for (int j = 1; j <= 3; j++) {      // max 3 columns

                if (i == 1 || i == 5) {
                    if (j == 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }

                else if (i == 2 || i == 4) {
                    if (j <= 2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }

                else {   // middle row (i == 3)
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

