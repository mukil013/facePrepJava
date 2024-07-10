package day12;

import java.util.Scanner;

class MergeList{
    
    class Node{
        int data;
        Node next;
        Node(int n){
            this.data = n;
        }
    }

    Node head, tail;

    void add(int n){
        Node newNode = new Node(n);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void addNode(Node n){
        if(head == null){
            head = tail = n;
            return;
        }
        tail.next = n;
        tail = n;
    }

    void mergeTwoList(MergeList list2){
        Node p1 = head;
        Node p2 = list2.head;
        MergeList res = new MergeList();

        while(p1 != null && p2 != null){
            if(p1.data < p2.data){
                res.addNode(p1);
                p1 = p1.next;
            }else{
                res.addNode(p2);
                p2 = p2.next;
            }
        }
        while(p1 != null){
            res.addNode(p1);
            p1 = p1.next;
        }
        while(p2 != null){
            res.addNode(p2);
            p2 = p2.next;
        }
        head = res.head;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
}
public class mergeList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1= in.nextInt();
        System.out.println();
        MergeList list1 = new MergeList();
        for(int i=0;i<n1;i++){
            list1.add(in.nextInt());
        }
        System.out.println();
        int n2= in.nextInt();
        System.out.println();
        MergeList list2 = new MergeList();
        for(int i=0;i<n2;i++){
            list2.add(in.nextInt());
        }
        list1.mergeTwoList(list2);
        list1.display();
        System.out.println();
        in.close();
    }
}
