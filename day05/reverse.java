package day05;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();
        String[] array = input.split("\\.");
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[n-1-i]);
            if(i < n-1)
                System.out.print(".");
        }
        System.out.println();
    }
}
