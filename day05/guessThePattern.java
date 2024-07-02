package day05;

import java.util.Scanner;

public class guessThePattern {
    String patternChecker(int n){
        String pattern = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder arr = new StringBuilder();
            int count = 1,j;
            for (j = 1; j < pattern.length(); j++){
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
            pattern = arr.toString();
        }
        return pattern;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        guessThePattern obj = new guessThePattern();
        System.out.println(obj.patternChecker(n));
        in.close();
    }
}
