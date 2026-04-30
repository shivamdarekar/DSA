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

public class ReverseLL_II{

    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }       
    }

    public static Node reverse(Node head, int left, int right){
        Node dummy = new Node(-1);
        dummy.next = head;
        Node prev = dummy;

        for(int i=0;i<left-1;i++) prev = prev.next;

        Node curr = prev.next;

        for(int i=0;i<right-left;i++){
            Node forw = curr.next;

            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
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

        int left = 2;
        int right = 5;

        head = reverse(head,left,right);
        print(head);
    }
}