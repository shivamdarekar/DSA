class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        data = data1;
        next = next1;
    }

    Node(int data1){
        data = data1;
        next = null;
    }
}

//Linked list deletion in Java means removing references, not deleting objects. (Garbage collector remove object/element automatically)

public class DeletionOfLL{

    public static Node convertToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node removeHead(Node head){
        if(head == null) return head;
        head = head.next; //move head to next
        return head;
    }
    //previous head is atomatically clear by garbage collector in java

    public static Node removeTail(Node head){
        if(head == null || head.next == null) return null;

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    //When a linked list has only one node, returning null removes the head reference, 
    //making the node unreachable, and Java’s garbage collector deletes it automatically.

    //remove element at position k
    public static Node removeK(Node head, int k){
        if(head == null) return head;
        if(k == 1){
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node prev = null;
        Node temp = head;

        while(temp != null){
            cnt++;

            if(cnt == k){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    //remove the given element k
    public static Node removeElement(Node head, int k){
        if(head == null) return head;
        if(head.data == k){
            head = head.next;
            return head;
        }
        
        Node prev = null;
        Node temp = head;

        while(temp != null){
            if(temp.data == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String args[]){
        int[] arr = {5};
        Node head = convertToLL(arr);
        //System.out.println(head.data);

        //head = removeHead(head);
        //System.out.print(head.data);

        // Node tail = removeTail(head);
        // System.out.println(tail.data);

        head = removeK(head, 3);
        print(head);

        // head = removeElement(head, 7);
        // print(head);

    }
}