
/// Calculate sum of diagonal elements of a matrix (ex: [[1,2,3],[4,5,6],[7,8,9] the correct answer would be [1,5,9][3,5,7] = total 30)

public class Prob1_Matrix {

    static void printDiagonalSums(int [][]mat,
                                  int n)
    {
        int principal = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Condition for principal
                // diagonal
                if (i == j)
                    principal += mat[i][j];

                // Condition for secondary
                // diagonal
                if ((i + j) == (n - 1))
                    secondary += mat[i][j];
            }
        }

        System.out.println("Sum of the Principal Diagonal elements:"
                + principal);

        System.out.println("Sum of the Secondary Diagonal elements:"
                + secondary);
        System.out.println("The sum of diagonal elements (principal + secondary) of your matrix is :"+ (principal + secondary));
    }

    // Driver code
    static public void main (String[] args)
    {

        int [][]a = { { 1,2,3},
                { 4, 5, 6},
                { 7,8,9}};

        printDiagonalSums(a, 3);

    }
}
