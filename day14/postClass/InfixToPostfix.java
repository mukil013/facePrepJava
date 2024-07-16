package day14.postClass;

import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();
        Stack<Character> stack = new Stack<>();
        
        String ans = new String("");

        for (char ch : input.toCharArray()) {
            if(stack.isEmpty())
                stack.push(ch);
            else if(ch == '(')
                stack.push(ch);
            else
                while(!stack.isEmpty() && stack.peek() != '(' && percidence(stack.peek()) >= percidence(ch))
                    ans += stack.pop();
                stack.push(ch);
            if(ch == ')'){
                while(stack.peek() != '(')
                    ans += stack.pop();
                stack.pop();
            }
        }
        System.out.println(ans);
    }
    static int percidence(char ch){
        if(ch == '+' || ch == '-')
            return 1;
        else if(ch == '*' || ch == '/')
            return 2;
        else if(ch == '^')
            return 3;
        else
            return 0;
    }
}
