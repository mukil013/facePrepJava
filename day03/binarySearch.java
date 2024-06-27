package day03;
import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int target = in.nextInt();
        in.close();
        int l=0, r=n-1, key = 0;
        for (int i = 0; i < n; i++) {
            key =(l+r)/2;
            if(arr[key] > target)
                r--;
            else if(arr[key] < target)
                l++;
            else if(arr[key] == target){
                System.out.println(key+"\n");
                break;
            }
        }
    }
}
