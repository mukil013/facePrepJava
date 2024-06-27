package day03;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int target =in.nextInt();
        in.close();
        for (int i = 0; i < n; i++)
            if(arr[i] == target){
                System.out.println(i);
                break;
            }
    }
}
