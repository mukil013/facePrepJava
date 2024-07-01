package day05;

import java.util.*;
public class stringSplit {
    static String min(String[] arr){
        int min = Integer.MAX_VALUE;
        String ans = "";
        for (int i = 0; i < arr.length; i++){
            String current = arr[i];
            if(current.length() < min){
                ans = current;
                min = current.length();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String phrase = in.nextLine();
        String[] minWords = phrase.split(" ");
        System.out.println(min(minWords));
        in.close();
    }
}
