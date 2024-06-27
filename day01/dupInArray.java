package day01;
import java.util.*;
public class dupInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++)
            arr.add(in.nextInt());
        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i) == arr.get(i+1)){
                System.out.println(arr.get(i));
                System.exit(0);
            }
        }
        in.close();
    }
}
