package day06;

import java.util.Scanner;

public class islandSize {
    int islandChecker(int[] arr){
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) 
            for (int j = 0; j < col; j++) 
                arr[i][j] = in.nextInt();
        
        in.close();
    }
}
