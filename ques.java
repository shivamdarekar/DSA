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

public class ques {

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static Node Num(Node head){
       Map<Integer,Integer>mpp = new HashMap<>();

       Node temp = head;
       Node dummy = new Node(-1);
       Node temp2 = dummy;

       while(temp != null){
        mpp.put(temp.data, mpp.getOrDefault(temp.data, 0)+1);
        temp = temp.next;
       }

        temp = head;
        while(temp != null){
            if(mpp.get(temp.data) == 1){
                temp2.next = new Node(temp.data);
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        return dummy.next;

    }

    public static void main(String args[]) {
       Node head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(2);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);
       head.next.next.next.next.next = new Node(6);
       head.next.next.next.next.next.next = new Node(5);

       Node ans = Num(head);
       print(ans);
    }
}