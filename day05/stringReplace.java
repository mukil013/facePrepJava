package day05;

import java.util.Scanner;

public class stringReplace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        char source = in.next().charAt(0);
        char target = in.next().charAt(0);
        System.out.println(a.replace(source, target));
        in.close();
    }
}
