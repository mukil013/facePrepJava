package day06;

import java.util.Scanner;

public class powerOfNums {
    static int sqrt(int base, int power){
        if(power == 0)
            return 1;
        else if(power == 1)
            return base;

        return base * sqrt(base,power-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int power = in.nextInt();
        System.out.println(sqrt(base, power));
        in.close();
    }
}
