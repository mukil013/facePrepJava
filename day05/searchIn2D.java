package day05;
import java.util.Scanner;
public class searchIn2D {

    // public boolean checker(int[][] arr, int key, int col){
    //     int l = 0, r = arr.length-1,mid = 0, len;
    //     for (int i = 0; i < col; i++){
    //       	len = arr[i].length;
    //         for (int j = 0; j < len; j++){
    //             mid = (l+r)/2;
    //             if(key == arr[i][mid])
    //                 return true;
    //             else if(key > arr[i][mid] && l < len)
    //                 l++;
    //             else if(key < arr[i][mid] && r >= 0)
    //                 r--;
    //         }
    //     }
    //   	return false;
    // } 
    public boolean checker(int[][] arr, int r, int c, int key){
        int start = 0, end = r*c-1;
        while (start < end) {
            int mid = (start-end)/2;
            int ri = mid / c;
            int ci = mid % c;

            if(key == arr[ri][ci])
                return true;
            else if(key > arr[ri][ci])
                start = mid-1;
            else if(key < arr[ri][ci])
                end = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int r = in.nextInt();
        int[][] arr = new int[c][r];

        for (int i = 0; i < c; i++) 
            for (int j = 0; j < r; j++) 
                arr[i][j] = in.nextInt();
		int key = in.nextInt();
        in.close();
        searchIn2D obj = new searchIn2D();
        System.out.println(obj.checker(arr,r,c,key));
    }
}