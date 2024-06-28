import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    
    Scanner in = new Scanner(System.in);
    int c = in.nextInt();
    int r = in.nextInt();
    int[][] arr = new int[c][r];

    for(int i = 0; i < c; i++)
      for(int j = 0; j < r; j++)
        arr[i][j] = in.nextInt();

    in.close();
  
    for(int i = 0; i < r; i++)
      if(i % 2 == 0)
      	for(int j = 0; j < c; j++)
        	System.out.print(arr[j][i]+" ");
      else
      	for(int j = 0; j < c; j++)
        	System.out.print(arr[c-1-j][i]+" ");

  }
}
