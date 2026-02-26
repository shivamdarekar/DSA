

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

public class Sort0s1s2s{

    public static Node sortList(Node head){
        if(head == null && head.next == null) return head;
        Node temp = head;

        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead, one = oneHead, two = twoHead;

        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }
            else{
                two.next = temp;
                two = two.next;
            }

            temp = temp.next;
        }

        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        Node newHead = zeroHead.next;

        return newHead; 
    }

    public static void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static void main(String args[]){
        Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);

        head = sortList(head);
        print(head);
    }
}