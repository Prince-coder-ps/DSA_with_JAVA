package LinkedList;
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    void display() {
        Node temp = head;

          while (temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void addAtHead(int val){
        Node temp = new Node(val);

        if(head == null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }

    }

}

public class NodeofLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        // Connecting nodes
        a.next = b;
        b.next = c;
        c.next = d;

        // Creating LinkedList
        LinkedList ll = new LinkedList();

        ll.head = a;
        ll.tail = d;

        // Display Linked List
        ll.display();
        System.out.print("value : ");
        int val = sc.nextInt();

        ll.addAtHead(val);
        ll.display();
    }
}