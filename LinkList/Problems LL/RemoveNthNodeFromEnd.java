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

public class RemoveNthNodeFromEnd{

    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data+ " ");
            curr = curr.next;
        }
    }

    public static Node Brut(Node head, int n){
        if(head == null || head.next == null) return head;

        int cnt = 0;
        Node temp = head;

        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        if(cnt == n){
            return head.next;
        }

        int res = cnt - n;
        temp = head;
        while(temp != null){
            res--;
            if(res == 0) break;
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    } //O(2*length)

    public static Node Optimal(Node head, int n){
        if(head == null || head.next == null) return head;

        Node fast = head, slow = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }

        if(fast == null){
            return head.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = Optimal(head, 2);
        print(head);
    }
}