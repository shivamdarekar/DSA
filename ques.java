import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }

    Node(int data1){
        data = data1;
        next = null;
    }
}

public class ques{
        
    }

    public static void main(String[] args) {
       Node head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(2);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);
       head.next.next.next.next.next = new Node(6);
       head.next.next.next.next.next.next = new Node(6);

       head = optimal(head);
       print(head);
    }
}