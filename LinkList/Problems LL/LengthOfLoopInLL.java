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

public class LengthOfLoopInLL{

    public static int Brut(Node head){
        Map<Node,Integer>mpp = new HashMap<>();
        Node temp = head;
        int timer = 1;

        while(temp != null){
            if(mpp.containsKey(temp)){
                int loopLength = timer - mpp.get(temp);
                return loopLength;
            }
            mpp.put(temp,timer);
            timer++;
            temp = temp.next;
        }
        return 0;
    };
    //TC = O(n) | SC = O(n)

    public static int Optimal(Node head){
        if(head == null || head.next == null) return 0;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return loopLength(fast, slow);
            }
        }
        return 0;
    }//O(n) | O(1)

    public static int loopLength(Node slow, Node fast){
        int cnt = 1;
        fast = fast.next;

        while(slow != fast){
            cnt++;
            fast = fast.next;
        }
        return cnt;
    }

    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

        System.out.print(Optimal(head));
    }
}