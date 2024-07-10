package day11;

class Linkedlist{
  class Node{
    int data;
    Node next;
    Node(int n){
      this.data = n;
    }
  }
  int size = 0;
  Node head,tail;
  void add(int n){
    Node temp = new Node(n);
    temp.next = head;
    head = temp;
    size++;
  }
  //appending elements
  void append(int n){
    Node newNode = new Node(n);
    if (head == null){
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
    size++;
  }
  //insert value 
  void insert(int pos, int n){
    if(pos > size+1){
      System.out.println("index out of bound!!!");
      return;
    }
    Node newNode = new Node(n);
    if(pos == 1){
      newNode.next = head;
      head = newNode;
      return;
    }
    int counter = 1;
    Node temp = head;
    while(counter < pos-1){
      temp = temp.next;
      counter++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }
  //replace the element
  void replace(int pos, int n){
    if(pos > size+1){
      System.out.println("index out of bound!!!");
      return;
    }
    Node newNode = new Node(n);
    if(pos == 1){
      newNode.next = head;
      head = newNode;
      head.next = head.next.next;
      return;
    }
    int counter = 1;
    Node temp = head;
    while(counter < pos-1){
      temp = temp.next;
      counter++;
    }
    newNode.next = temp.next.next;
    temp.next = newNode;
  }
  //display the linked list
  void display(){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
  }
}

class LinkedListCustom{
  public static void main(String[] args) {
    Linkedlist list = new Linkedlist();
    for (int i = 1; i < 5; i++) {
      list.append(i);
    }
    list.display();
    System.out.println();
    list.insert(1, 22);
    list.replace(9, 24);
    list.display();
    System.out.println();
  }
}
