
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

public class DetectLoop{

    public static boolean Brut(Node head){
        Set<Node>mpp = new HashSet<>();
        Node temp = head;

        while(temp != null){
            if(mpp.contains(temp)){
                return true;
            }
            mpp.add(temp);
            temp = temp.next;
        }
        return false;
    }
    //TC = O(n) | Sc = O(n)

    public static boolean Optimal(Node head){
        if(head == null || head.next == null) return false;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) return true;
        }
        return false;
    }//O(n) | O(1)

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

        boolean ans = Brut(head);
        System.out.println(ans);

    }
}