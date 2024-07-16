package day13;

import java.util.Scanner;

public class TwoStackArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StackAdder sa = new StackAdder();
        int n1 = in.nextInt();

        for (int i = 0; i < n1; i++) {
            sa.push1(in.nextInt());
        }
        
        int n2 = in.nextInt();

        for (int i = 0; i < n2; i++) {
            sa.push2(in.nextInt());
        }
        int m1 = in.nextInt();
        int m2 = in.nextInt();


        in.close();

        for (int i = 0; i < m1; i++) {
            if(sa.pop1() == Integer.MIN_VALUE){
                System.out.println("Stack underflow. pop from stack 1 failed");
                break;
            }
        }
        for (int i = 0; i < m2; i++) {
            if(sa.pop2() == Integer.MIN_VALUE){
                System.out.println("Stack underflow. pop from stack 2 failed");
                break;
            }
        }
        sa.display();
    }
}

class StackAdder{
    int size = 1000;
    int[] arr = new int[size];
    int top1 = -1;
    int top2 = size;

    //for stack1
    void push1(int n){
        top1++;
        arr[top1] = n;
    }
    boolean empty1(){
        return top1 == -1;
    }
    int pop1(){
        if(top1 == -1)
            return Integer.MIN_VALUE;
        int temp = arr[top1];
        top1--;
        return temp;
    }

    //for stack2
    void push2(int n){
        top2--;
        arr[top2] = n;
    }
    boolean empty2(){
        return top2 == size;
    }
    int pop2(){
        if(top2 == size)
            return Integer.MIN_VALUE;
        int temp = arr[top2];
        top2++;
        return temp;
    }
    void display(){
        System.out.println("Stack 1 Element");
        for (int i = top1; i >= 0; i--) 
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("Stack 2 Element");
        for (int i = top2; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}