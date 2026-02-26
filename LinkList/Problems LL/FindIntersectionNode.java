
import java.util.*;

class Node {

    int data;
    Node next;

    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class FindIntersectionNode {

    public static Node brut(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }//O(m*n)

    public static Node BetterApp(Node head1, Node head2) {
        Set<Node> set = new HashSet<>();

        Node temp = head1;
        while (temp != null) {
            set.add(temp);
            temp = temp.next;
        }

        while (head2 != null) {
            if (set.contains(head2)) {
                return head2;
            }
            head2 = head2.next;
        }
        return null;
    }
    //TC -> O(n+m) | SC -> O(n)

    public static Node Optimal(Node head1, Node head2){
        if(head1 == null || head2 == null) return null;

        Node a = head1, b = head2;

        while(a != b){
            a = a.next;
            b = b.next;

            if(a == null) a = head2;
            if(b == null) b = head1;
        }
        return a;
    }
    //TC -> O(n) | SC -> O(1)

    public static void main(String args[]) {
        Node common = new Node(12);
        common.next = new Node(11);

        Node head1 = new Node(15);
        head1.next = new Node(8);
        head1.next.next = new Node(10);
        head1.next.next.next = common;

        Node head2 = new Node(8);
        head2.next = new Node(2);
        head2.next.next = common;

        Node commonNode = brut(head1, head2);
        System.out.print(commonNode.data);
    }
}
