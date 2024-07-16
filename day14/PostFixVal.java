package day14;

import java.util.*;

public class PostFixVal {
    static int calc(int oa1, String op, int oa2){
        if(op.equals("*"))
            return oa1*oa2;
        else if(op.equals("+"))
            return oa1+oa2;
        else if(op.equals("-"))
            return oa1-oa2;
        else
            return oa1/oa2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String[] str = in.next().split("");
            for (String el : str) {
                if(el.matches("[0-9]"))
                    stack.push(Integer.parseInt(el));
                else{
                    int e2 = stack.pop();
                    int e1 = stack.pop();
                    stack.push(calc(e1, el, e2));
                }  
            }
            System.out.println(stack.peek());
        }
        in.close();
    }
}
