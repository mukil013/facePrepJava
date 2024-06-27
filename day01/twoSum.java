package day01;
import java.util.Scanner;
public class twoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int target = in.nextInt();
        for (int i = 0; i < arr.length; i++)       
            for (int j = i+1; j < arr.length; j++) 
                if(arr[i]+arr[j] == target && i!=j)
                    System.out.println(i+" "+j);
                    System.exit(0);
        in.close();
    }
}
