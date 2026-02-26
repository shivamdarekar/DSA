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

public class DeleteAllOccInDLL{
    
    public static void print(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static Node DeleteKeyOcc(Node head, int key){
        Node temp = head;

        while(temp != null){
            if(temp.data == key){
                if(temp == head) head = head.next;
                Node nextNode = temp.next;
                Node prevNode = temp.prev;

                if(nextNode != null) nextNode.prev = prevNode;
                if(prevNode != null) prevNode.next = nextNode;

                temp = temp.next;
            } else{
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(head, 4, null);
        head.next.next = new Node(head.next, 10, null);
        head.next.next.next = new Node(head.next.next, 10, null);
        head.next.next.next.next = new Node(head.next.next.next, 6, null);

        head = DeleteKeyOcc(head, 10);
        print(head);
    }
}