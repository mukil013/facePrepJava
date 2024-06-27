package day03;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),j;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        in.close();
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            j = i-1;
            while(j!=-1 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
    }
}
