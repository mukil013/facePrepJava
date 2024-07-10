package selfProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class stringToInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split("");
        ArrayList<Integer> nums = new ArrayList<>();
        String num = "";
        for (int i = 0; i < arr.length; i++) {
            num = "";
            if(arr[i].matches("[0-9]"))
                num += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(num);
        int counter = 0, temp = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.size()/2; i++) {
            if(counter < nums.size())
                for (int j = 0; j < 3; j++) {
                    temp *= nums.get(counter);
                }
            counter++;
            ans.add(temp);
            temp = 1;
        }
        System.out.println(ans);
        in.close();
    }
}
