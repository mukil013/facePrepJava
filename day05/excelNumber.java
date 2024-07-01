package day05;

import java.util.Scanner;

public class excelNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        in.close();
        int ans = 0;
        for (int i = 0; i < input.length(); i++) 
            ans = ans * 26 + input.charAt(i) - 'A' + 1;
        System.out.println(ans);
    }
}
