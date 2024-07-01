package day05;

import java.util.Scanner;

public class sumOf2dArray {
    int sumOfArray(int[][] arr, int r, int c){
        int ans = 0;
        for (int i = 0; i < c; i++) 
            for (int j = 0; j < r; j++) 
                ans += arr[i][j];
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] arr = new int[c][r];

        for (int i = 0; i < c; i++)
            for (int j = 0; j < r; j++)
                arr[i][j] = in.nextInt();
            
        sumOf2dArray obj = new sumOf2dArray();
        System.out.println(obj.sumOfArray(arr,r,c));

        in.close();
    }
}
