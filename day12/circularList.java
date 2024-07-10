package day12;

import java.util.Scanner;

@SuppressWarnings("rawtypes")
class NewList<T>{
    @SuppressWarnings("hiding")
    class Node<T>{
        T data;
        Node next;
        Node(T n){
            this.data = n;
        }
    }
    Node head,tail;
    @SuppressWarnings("unchecked")
    void add(T n){
        Node<T> newNode = new Node<>(n);
        if(head == null){
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }
    void display(){
        System.out.print(head.data+" ");
        Node temp = head.next;
        while (temp != head) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
public class circularList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NewList<Integer> obj = new NewList<>();
        int choice;
        do{
            obj.add(in.nextInt());
            choice = in.nextInt();
        }while(choice != 0);
        obj.display();
        in.close();
    }
}
