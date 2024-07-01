package day05;

import java.util.ArrayList;
import java.util.Scanner;

public class guessThePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),j;
        String pattern = "1";
        StringBuilder arr = new StringBuilder("");
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (j = 1; j < pattern.length(); j++) {
                if(pattern.charAt(j) == pattern.charAt(j-1))
                    count++;
                else{
                    arr.append(count);
                    arr.append(pattern.charAt(j-1));
                    count = 1;
                }
            }
            arr.append(count);
            arr.append(pattern.charAt(j-1));
        }
        System.out.println(arr);
        in.close();
    }
}
