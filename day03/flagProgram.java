package day03;
import java.util.Scanner;
public class flagProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = in.nextInt();
        in.close();
        int l=0,r=arr.length-1,m=0;
        while(m<=r)
            if(arr[m] == 0){
                int temp = arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                l++;
                m++;
            }else if(arr[m] == 1){
                m++;
            }else{
                int temp = arr[m];
                arr[m]=arr[r];
                arr[r]=temp;
                r--;
            }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
