package day02;

import java.util.Scanner;

public class colSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        int[] colSumAns = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                colSumAns[i] += mat[j][i];
            }
            System.out.println(colSumAns[i]);
            System.out.println();
        }
        in.close();
    }
}
