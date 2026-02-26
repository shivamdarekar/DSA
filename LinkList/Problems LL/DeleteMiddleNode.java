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

public class DeleteMiddleNode{

    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static Node Brut(Node head){
        if(head == null || head.next == null) return head;

        Node temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;                                     
            temp = temp.next;
        }

        int beforeMid = cnt/2;
        temp = head;
        while(temp != null){
            beforeMid--;

            if(beforeMid == 0){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }//O(n * n/2)

    public static Node Optimal(Node head){
        if(head == null || head.next == null) return head;

        Node slow = head, fast = head;
        fast = fast.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;
    } // O(n/2)

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = Brut(head);
        print(head);
    }
}