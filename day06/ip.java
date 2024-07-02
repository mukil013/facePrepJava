package day06;

import java.util.Scanner;
public class ip {
    static int ipChecker(String ip){
        String[] parts = ip.split("\\.") ;
        for (int i = 0; i < parts.length; i++) {
            int ipPart = Integer.parseInt(parts[i]);
            if(ipPart < 0 || ipPart > 255)
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ipAdd = in.next();
        System.out.println(ipChecker(ipAdd));
        in.close();
    }
}
