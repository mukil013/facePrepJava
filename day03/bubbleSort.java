package day03;
import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        in.close();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n-1-i; j++)
                if(arr[j] > arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
