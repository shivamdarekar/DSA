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

public class MiddleNodeInLL{

    public static Node Brut(Node head){
        if(head == null || head.next == null) return head;

        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        int midNode = cnt/2 + 1;
        temp = head;

        while(temp != null){
            midNode = midNode - 1;

            if(midNode == 0) break;
            temp = temp.next;
        }

        return temp;
    }//O(n + n/2)

    //tortoise & hare algo
    public static Node Optimal(Node head){
        if(head == null || head.next == null) return head;

        Node slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    } 

    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = Optimal(head);
        System.out.print(head.data);
    }
}