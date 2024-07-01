package day05;
import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                arr[i][j] = in.nextInt();
        System.out.println();
        for (int i = 0; i < (n+1)/2; i++) {
            for (int j = i; j <= n-1-i; j++)
                System.out.print(arr[i][j]+" ");
            for (int j = i+1; j <= n-1-i; j++)
                System.out.print(arr[j][n-i-1]+" ");
            for (int j = n-2-i; j >= i; j--)
                System.out.print(arr[n-1-i][j]+" ");
            for (int j = n-i-2; j > i ; j--)
                System.out.print(arr[j][i]+" ");
        }
        in.close();
    }
}

