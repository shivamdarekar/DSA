//the DLL is sorted

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

public class RemoveDuplicatesFromDLL{

    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static Node removeDuplicates(Node head){
        Node temp = head;
        while(temp != null && temp.next != null){
            Node nextNode = temp.next;
            while(nextNode != null && nextNode.data == temp.data){
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if(nextNode != null) nextNode.prev = temp;
            temp = temp.next;
        }
        return head;
    }//O(n)

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(head, 10, null);
        head.next.next = new Node(head.next, 10, null);
        head.next.next.next = new Node(head.next.next, 16, null);
        head.next.next.next.next = new Node(head.next.next.next, 16, null);

        head = removeDuplicates(head);
        print(head);
    }
}