
public class EquiTriangle{
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {        // 3 rows
            for (int j = 1; j <= 5; j++) {    // 5 columns

                if (i == 1) {
                    if (j == 3)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else if (i == 2) {
                    if (j >= 2 && j <= 4)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else {   // row 3
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
