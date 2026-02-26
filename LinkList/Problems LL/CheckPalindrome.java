
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

public class CheckPalindrome{

    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static boolean Brut(Node head){
        Node temp = head;
        Stack<Integer>st = new Stack<>();

        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            if(temp.data != st.peek()) return false;
            temp = temp.next;
            st.pop();
        }

        return true;
    }//O(2n)

    public static boolean Optimal(Node head){
        if(head == null || head.next == null) return true;

        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node curr = slow;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        while(right != null){
            if(left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);        

        boolean isPalindrome = Optimal(head);
        System.out.println("Is palindrome: " + isPalindrome);
    }
}