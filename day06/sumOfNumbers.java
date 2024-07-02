package day06;
import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
        String input = in.next();
        String[] alphaNums = input.split("");
        int nums = 0;
        String ans = new String();
        for (int i = 0; i < alphaNums.length; i++) {
            if(alphaNums[i].matches("[0-9]"))
                ans=ans+alphaNums[i];
            else{
                if(!ans.equals(""))
                    nums += Integer.parseInt(ans);
                ans="";
            }
        }
        if(!ans.equals(""))
            nums += Integer.parseInt(ans);
        System.out.println(nums);
        in.close();
    }
}
