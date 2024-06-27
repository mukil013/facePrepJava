package selfProgram;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),counter = 0,l=0,r=0;
        int[] arr = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) 
            arr[i] = in.nextInt();

        for (int i = 0; i < n; i++) {
            r = i;
            for (int j = 0; j < n; j++) {
                if(l == r){
                    l++;
                }else{
                    ans[counter] *= arr[r];
                }
            }
            counter++;
        }
        for (int i = 0; i < n; i++)
            System.out.print(ans[i]+" ");
        System.out.println();
        in.close();
    }
}
