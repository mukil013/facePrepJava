package day06;

import java.util.*;

public class sumOfNatty {
    static int sum(int index, int[] num){
        if(index == 0)
            return num[0];
        return num[index] + sum(index-1, num);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        in.close();
        System.out.println(sum(n-1, arr));
    }
}
