import java.util.ArrayList;
import java.util.Scanner;

public class methods {
    private int[][] array;

    public void createMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introcuceti marimea matricei:");
        int n = sc.nextInt();
        this.array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "]= ");
                array[i][j] = sc.nextInt();
            }

        }
    }

    public void printDiagonalSums(int[][] mat,
                                  int n) {
        int principal = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Condition for principal
                // diagonal
                if (i == j) {
                    principal += mat[i][j];
                }
                // Condition for secondary
                // diagonal
                if ((i + j) == (n - 1)) {
                    secondary += mat[i][j];
                }
            }
        }

        System.out.println("Sum of the Principal Diagonal elements:" + principal);
        System.out.println("Sum of the Secondary Diagonal elements:" + secondary);
        System.out.println("The sum of diagonal elements (principal + secondary) of your matrix is :" + (principal + secondary));


    }

    public void calculatePrincipalDiagonal(int[][] mat,
                                       int n) {
        int principal = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Condition for principal diagonal
                if (i == j) {
                    principal += mat[i][j];
                }

            }
        }

        System.out.println("Sum of the Principal Diagonal elements:" + principal);

    }

    public void calculateSecondaryDiagonal(int[][] mat,
                                       int n) {
        int principal = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Condition for secondary diagonal
                if ((i + j) == (n - 1)) {
                    secondary += mat[i][j];
                }

            }
        }

        System.out.println("Sum of the Secondary Diagonal elements:" + secondary);

    }

    public void generateRandomMatrix(){
        int values[][] = new int[3][4];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = ((int) (Math.random() * 10));
                System.out.print(values[i][j]);
            }
            System.out.println();
        }
    }
}


