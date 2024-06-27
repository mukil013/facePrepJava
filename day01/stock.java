package day01;
import java.util.Scanner;
public class stock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int profit = 0;
        int min = 100;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
            else if(arr[i] - min > profit)
                profit = arr[i] - min;
        }
        System.out.println(min);
        System.out.println("\n"+profit);
        in.close();
    }
}
