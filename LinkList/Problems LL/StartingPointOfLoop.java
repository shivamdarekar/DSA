
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

public class StartingPointOfLoop{

    public static Node Brut(Node head){
        if(head == null || head.next == null) return null;

        Set<Node>set = new HashSet<>();
        Node temp = head;

        while(temp != null){
            if(set.contains(temp)){
                return temp;
            }

            set.add(temp);
            temp = temp.next;
        }

        return null;
    }
    //SC = O(n) | TC = O(n)

    public static Node Optimal(Node head){
        if(head == null || head.next == null) return head;

        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

     public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

        Node ans = Optimal(head);
        if(ans != null){
            System.out.println("Starting point of loop is: " + ans.data);
        } else {
            System.out.println("No loop detected.");
        }
     }
}