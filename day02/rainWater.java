package day02;
import java.util.Scanner;
public class rainWater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] waterTank = new int[n];
        for (int i = 0; i < n; i++) {
            waterTank[i] = in.nextInt();
        }
        int[] lm = new int[n];
        int[] rm = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            if(waterTank[i] > max)
                max = waterTank[i];
            lm[i] = max;
        }
        max = 0;
        for (int i = n-1; i > 0; i--) {
            if(waterTank[i] > max)
                max = waterTank[i];
            rm[i] = max;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(lm[i], rm[i])-waterTank[i];
        }
        System.out.println(ans);
        in.close();
    }
}
