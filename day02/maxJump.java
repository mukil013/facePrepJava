package day02;
import java.util.Scanner;
public class maxJump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),currentIndex = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(currentIndex > i){
                System.out.println("false");
                break;
            }else if(currentIndex == i){
                System.out.println("true");
                break;
            }
            currentIndex = arr[i]+i;
        }    
        in.close();
    }
}
