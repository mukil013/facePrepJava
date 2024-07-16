package day01;
import java.util.*;
class sample{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int dummy = in.nextInt();
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = in.nextInt();
    }
    in.close();
    int counter = 0;
    for(int i = 0; i < dummy; i++){
      for(int j = 0; j < n; j++){
        if(i != j){
        	if(arr[i] == arr[j]){
              counter++;
            }
        }
      }
    }
    System.out.println(counter);
  }
}