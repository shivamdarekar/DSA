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

public class RemoveDuplicates_II{

    public static void print(Node head){
        Node t1 = head;
        while(t1 != null){
            System.out.print(t1.data+ " ");
            t1 = t1.next;
        }
    }

    public static Node Brut(Node head){
        Node t1 = head;
        Node dummy = new Node(-1);
        Node t2 = dummy;

        Map<Integer,Integer>mpp = new HashMap<>();

        while(t1 != null){
            mpp.put(t1.data, mpp.getOrDefault(t1.data,0)+1);
            t1 = t1.next;
        }

        t1 = head;

        while(t1 != null){
            if(mpp.get(t1.data) == 1){
                t2.next = new Node(t1.data);
                t2 = t2.next;
            }
            t1 = t1.next;
        }

        return dummy.next;
    }

    public static Node optimal(Node head){

        if(head == null || head.next == null) return head;

        Node dummy = new Node(-1);
        dummy.next = head;
        Node prev = dummy;
        Node cur = head;

        while(cur != null){
            if( cur.next != null && cur.data == cur.next.data){
                while(cur.next != null && cur.data == cur.next.data){
                    cur = cur.next;
                }
                prev.next = cur.next;
            }
            else{
                prev = prev.next;
            }
            cur = cur.next;
        }

        return dummy.next;
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