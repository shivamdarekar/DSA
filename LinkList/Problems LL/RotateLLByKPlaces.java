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

public class RotateLLByKPlaces{

    public static Node rotateByK(Node head, int k){
        if(head == null || k == 0) return head;

        Node temp = head;
        int len = 1;
        while(temp.next != null){
            temp = temp.next;
            len++;
        }

        k = k % len;
        if(k == 0) return head;

        temp.next = head;
        temp = head;

        int newTail = len - k;
        for(int i=1;i<newTail;i++){
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;
        return head;
    }

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = rotateByK(head, 2);
        print(head);
    }
}