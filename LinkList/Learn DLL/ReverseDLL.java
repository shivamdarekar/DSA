import java.util.*;

class Node{
    Node prev;
    int data;
    Node next;

    Node(Node prev1, int data1, Node next1){
        prev = prev1;
        data = data1;
        next = next1;
    }

    Node(int data1){
        prev = null;
        data = data1;
        next = null;
    }
}

public class ReverseDLL{

    public static Node convertToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(prev, arr[i], null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void print(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
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
    }
    //Tc = O(2n) | Sc = O(n)

    public static Node Optimal(Node head){
        if(head == null || head.next == null) return head;

        Node curr = head;
        Node temp = null;

        while(curr != null){
            temp = curr.prev; //null
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        head = temp.prev;

        return head;
    }
    //Tc - O(n) | Sc - O(1)
    
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};

        Node head = convertToLL(arr);
        //print(head);

        head = Optimal(head);
        print(head);
    }
}