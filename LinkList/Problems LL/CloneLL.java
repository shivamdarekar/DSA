//clone a linkedlist with next and random pointer

import java.util.*;
class Node{
    int data;
    Node next;
    Node random;

    Node(int data1, Node next1, Node random1){
        data = data1;
        next = next1;
        random = random1;
    }

    Node(int data1){
        data = data1;
        next = null;
        random = null;
    }
}

public class CloneLL{

 public static Node Brut(Node head){
    if(head == null|| head.next == null) return head;

    Map<Node, Node>mpp = new HashMap<>();
    Node temp = head;
    while(temp != null){
        Node newNode = new Node(temp.data);
        mpp.put(temp, newNode);
        temp = temp.next;
    }

    temp = head;

    while(temp != null){
        Node copyNode = mpp.get(temp);
        copyNode.next = mpp.get(temp.next);
        copyNode.random = mpp.get(temp.random);
        temp = temp.next;
    }

    return mpp.get(head);
 }
 //TC = O(2n) | SC = O(n)

 public static void print(Node head){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+ " ");
        temp = temp.next;
    }
 }

    public static void main(String args[]){
    Node head = new Node(7);
    head.next = new Node(14);
    head.next.next = new Node(21);
    head.next.next.next = new Node(28);

    // Assigning random pointers
    head.random = head.next.next;
    head.next.random = head;
    head.next.next.random = head.next.next.next;
    head.next.next.next.random = head.next;

    head = Brut(head);
    print(head);
    }
}