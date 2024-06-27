package day03;

import java.util.Scanner;

public class maxRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int mid = 0, moves =0;
        if(n%2==0)
            mid = n/2;
        else
            mid = ((n/2)+1)+(n/2);
        for (int i = 0; i < n; i++) {
            moves += Math.abs(mid-arr[i]);
        }
        System.out.println(moves);
        in.close();
    }
}