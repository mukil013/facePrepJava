package day13;

import java.util.Scanner;

public class ElementInStack {
    public static void main(String[] args) {
        StackOp stack = new StackOp();
        Scanner in = new Scanner(System.in);
        
        while (true) {
            int n = in.nextInt();
            if(n < 0)
                break;
            stack.push(n);
        }
        in.close();
        while(!stack.empty()){
            System.out.println(stack.pop()+" ");
        }
    }
}

class StackInsertList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head,tail;
    int size = 0;
    void add(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
    }
    void delete(){
        Node temp = head;
        if(head == null){
            System.out.println("Stack underflow");
            return;
        }
        else if(head.next == null){
            head = null;
            return;
        }
        else{
            while(temp.next != null && temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
}
class StackOp{
    StackInsertList stack = new StackInsertList();
    void push(int n){
        stack.add(n);
    }
    int pop(){
        int temp = stack.tail.data;
        stack.delete();
        return temp;
    }
    boolean empty(){
        return stack.head == null;
    }
}
