package day02;
import java.util.Scanner;
public class slidingWindow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = in.nextInt();
        int k = in.nextInt(),l=0,r=0,max=0,zc=0;
        for (int i = 0; i < arr.length; i++) {
            while (zc > k) {
                if(arr[l] == 0)
                    zc--;
                l++;
            }
            r = i;
            if(arr[r] == 0)
                zc++;
            max = Math.max(max, (r-l));
        }
        System.out.println(max);
        in.close();
    }
}
