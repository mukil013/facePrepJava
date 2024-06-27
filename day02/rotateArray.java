package day02;
import java.util.*;
public class rotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }
        int rotate = in.nextInt();
        rotate = rotate % n;
        for (int i = 0; i < rotate; i++) {
            ans.add(arr.get((n-1)-i));
            arr.remove((n-1)-i);
        }
        if(ans.isEmpty())
            System.out.println(arr);
        else{
            Collections.reverse(ans);
            ans.addAll(arr);
            System.out.println(ans+" "+arr);
        }
        in.close();
    }
}
