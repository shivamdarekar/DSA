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

public class AddOneToLL{

    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static Node reverse(Node head){
        if(head == null || head.next == null) return head;

        Node prev = null;
        Node temp = head;
        while(temp != null){
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }

    public static Node addOne(Node head){
        if(head == null || head.next == null) return head;

        head = reverse(head);
        Node temp = head;
        int carry = 1;

        while(temp != null){
            temp.data = temp.data + carry;
            if(temp.data < 10){
                carry = 0;
                break;
            }
            else{
                temp.data = 0;
                carry = 1;
            }

            temp = temp.next;
        }

        if(carry == 1){
            Node newNode = new Node(1);
            head = reverse(head);
            newNode.next = head;
            return newNode;
        }

        head = reverse(head);
        return head;
    }//Tc -> O(3n)

    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);

        head = addOne(head);
        print(head);
    }
}