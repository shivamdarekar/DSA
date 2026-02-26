import java.util.*;

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

public class MergeTwoSortedLL{

    public static Node convertToLL(List<Integer> arr){
        Node head = new Node(arr.get(0));
        Node mover = head;

        for(int i=1;i<arr.size();i++){
            Node temp = new Node(arr.get(i));
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node Brut(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        List<Integer>lt = new ArrayList<>();

        while(temp1 != null){
            lt.add(temp1.data);
            temp1 = temp1.next;
        }

        while(temp2 != null){
            lt.add(temp2.data);
            temp2 = temp2.next;
        }

        Collections.sort(lt);

        Node head = convertToLL(lt);
        return head;
    }
    //TC = O(n1 + n2 + nlogn + n) | SC = O(n1+n2)


    //when get a problem which involves creations of new LL then use concept of dummy node
    public static Node Optimal(Node head1, Node head2){
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(t1 != null && t2 != null){
            if(t1.data < t2.data){
                temp.next = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }

        if(t1 != null) temp.next = t1;
        if(t2 != null) temp.next = t2;
        return dummy.next;
    }
    //TC = O(n1 + n2) | Sc = O(1)

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(8);
        head.next.next.next = new Node(10);

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(6);
        head2.next.next.next.next = new Node(11);
        head2.next.next.next.next.next = new Node(14);

        head = Optimal(head, head2);
        print(head);
    }
}