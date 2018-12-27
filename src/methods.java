import java.util.ArrayList;
import java.util.Scanner;

public class methods {
    private int[][] array;
    public void creareMatrice() {
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
}
