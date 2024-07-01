package day05;
import java.util.Scanner;
public class oneDtoTwoD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] oneD = new int[n];
        for (int i = 0; i < n; i++)
            oneD[i] = in.nextInt();

        int row = in.nextInt();
        int col = in.nextInt();
        int[][] twoD = new int[row][col];
        in.close();
		int counter = 0;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                twoD[i][j] = oneD[counter++];
                
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) 
                System.out.print(twoD[i][j]+" ");
          	System.out.println();
        }
    }
}
