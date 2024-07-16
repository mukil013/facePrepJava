package day13;

import java.util.*;

public class BalancedBracket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        in.close();
        if(flag)
            System.out.println("Balanced");
        else    
            System.out.println("Not Balanced");
    }
}
class BracketChecker{
    boolean matchFound(String str){
        Stack<Character> arr = new Stack<>();
        for (char ch : str.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '['){
                arr.push(ch);
                continue;
            }else if(ch == '(')
                if(ch == '{' || ch == '[')
                    return false;

        }
    }
    
}
