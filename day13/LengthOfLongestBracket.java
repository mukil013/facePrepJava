package day13;

import java.util.*;
public class LengthOfLongestBracket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        in.close();
        Checker check = new Checker();
        System.out.println(check.lengthChecker(input));
    }
}

class Checker{
    int lengthChecker(String str){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty())
                    stack.push(i);
                else
                    max = Math.max(max,i-stack.peek());
            }
        }
        return max;
    }
}
