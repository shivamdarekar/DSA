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

public class SwapPairs{

    public static void print(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static Node swapPairs(Node head){
        if(head == null || head.next == null) return head;

        Node dummy = new Node(-1);
        dummy.next = head;
        Node prev = dummy;

        while(prev.next != null && prev.next.next != null){
            Node first = prev.next;
            Node second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
       Node head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);
       head.next.next.next.next.next = new Node(6);

       head = swapPairs(head);
         print(head);
    }
}