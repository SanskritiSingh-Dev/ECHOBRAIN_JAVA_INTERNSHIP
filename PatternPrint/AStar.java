public class AStar {
     public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {          // rows
            for (int j = 1; j <= 5; j++) {      // columns

                if (i == 1 && j == 3)
                    System.out.print("*");

                else if (i == 2 && (j == 2 || j == 4))
                    System.out.print("*");

                else if (i == 3)
                    System.out.print("*");

                else if ((i == 4 || i == 5) && (j == 1 || j == 5))
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
