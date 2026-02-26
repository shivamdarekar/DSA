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

public class ReverseInKGroupSize{
    public static Node getKthNode(Node temp, int k){
        k = k-1;
        while(temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public static Node reverseLL(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static Node reverseK(Node head, int k){
        Node temp = head;
        Node prevNode = null;

        while(temp != null){
            Node KthNode = getKthNode(temp, k);
            if(KthNode == null){
                if(prevNode != null) prevNode.next = temp;
                break;
            }

            Node nextNode = KthNode.next;
            KthNode.next = null;

            reverseLL(temp);
            if(temp == head){
                head = KthNode;
            }else{
                prevNode.next = KthNode;
            }

            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }//O(2n)

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(7);
        //head.next.next.next.next.next.next = new Node(8);

        head = reverseK(head, 4);
        print(head);
    }
}