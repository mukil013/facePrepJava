package day12;
import java.util.Scanner;

public class NthElementFromLast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LastElement list = new LastElement();
        int n = 0;
      	System.out.println("Enter the nth node:");
        while (n != -1) {
           n = in.nextInt();
           list.add(n); 
        }
        int pos = in.nextInt();
        in.close();
        list.checker(pos);
    }
}

class LastElement{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head,tail;
    int size = 0;
    void add(int n){
        Node newNode = new Node(n);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    void checker(int pos){
        pos = size - pos;
        int counter = 0;
        if(pos < 0){
            System.out.println("There is no nth node in the list");
        }else{
            Node temp = head;
            Node ans = null;
            while( temp != null && counter < pos){
                ans = temp;
                temp = temp.next;
                counter++;
            }
            System.out.println(ans.data+" is the nth node element in the list");
        }
    }
}
