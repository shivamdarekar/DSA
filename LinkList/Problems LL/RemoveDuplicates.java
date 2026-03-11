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

public class RemoveDuplicates{
    public static void print(Node head){
        Node t1 = head;
        while(t1 != null){
            System.out.print(t1.data+ " ");
            t1 = t1.next;
        }
    }

    public static Node Brut(Node head){
        if(head == null || head.next == null) return head;
        Node temp = head;
        Node prev = null;
        Set<Integer>st = new HashSet<>();

        while(temp != null){
            if(st.contains(temp.data)){
                prev.next = temp.next;
            }else{
                st.add(temp.data);
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node optimal(Node head){
        if(head == null || head.next == null) return head;

        Node temp = head;

        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
       Node head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(2);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);
       head.next.next.next.next.next = new Node(6);
       head.next.next.next.next.next.next = new Node(6);

         Node ans = optimal(head);
            print(ans);
    }
}