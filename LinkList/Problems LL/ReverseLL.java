
import java.util.Stack;

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

public class ReverseLL{

    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static Node Brut(Node head){
        if(head == null || head.next == null) return head;

        Stack<Integer>st = new Stack<>();
        Node temp = head;

        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            temp.data = st.pop();
            temp = temp.next;
        }

        return head;
    } //Tc = O(2n) | Sc = O(n)

    public static Node Optimal(Node head){
        if(head == null || head.next == null) return head;

        Node prev = null;
        Node temp = head;

        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        head = prev;
        return head;
    } //O(n)

    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = Optimal(head);
        print(head);
    }
}