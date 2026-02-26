
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

public class SortLL{

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node Brut(Node head){
        if(head == null || head.next == null) return head;

        List<Integer>lt = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            lt.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(lt);
        temp = head;
        int i = 0;
        while(temp != null){
            temp.data = lt.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
    //TC - O(2n + nlogn) | SC - O(n)


    public static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node mergeTwoLists(Node l1, Node l2){
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 != null) temp.next = l1;
        else temp.next = l2;
        return dummy.next;
    }

    public static Node Optimal(Node head){
        if(head == null || head.next == null) return head;

        Node middle = findMiddle(head);

        Node left = head;
        Node right = middle.next;
        middle.next = null;

        //recussively sort left and right
        left = Optimal(left);
        right = Optimal(right);

        return mergeTwoLists(left, right);
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);

        head = Optimal(head);
        print(head);
    }
}