class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodeWithoutHead{

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void delete(Node node){
        if(node == null || node.next == null) return;

        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        //LL have unique elements and deleting node is not last or first node
        Node nodeToDelete = head.next; // Node with value 2
        delete(nodeToDelete);
        print(head); // Output should be 1 3 4inter
    }
}