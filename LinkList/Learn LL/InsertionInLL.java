
class Node {

    int data;
    Node next;

    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class InsertionInLL {

    public static Node convertToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node inserAtHead(Node head, int val) {
        return new Node(val, head);
    }

    public static Node insertAtTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node newVal = new Node(val);
        temp.next = newVal;
        return head;
    }

    public static Node insertAtK(Node head,int val, int k){
        if(head == null){
            if(k == 1) return new Node(val);
        }

        if(k == 1){
            return new Node(val, head);
        }

        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;

            if(cnt == k-1){
                Node x = new Node(val);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    //insert element el before value val
    public static Node insertBeforeValue(Node head, int el, int val ){
        if(head == null) return null;

        if(head.data == val){
            return new Node(el,head);
        }

        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == val){
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String args[]) {
        int[] arr = {2, 7, 4, 8};
        Node head = convertToLL(arr);
        //System.out.print(head.data);

        //head = inserAtHead(head, 100);
        //print(head);

        // head = insertAtTail(head, 14);
        // print(head);

        // head = insertAtK(head, 12, 3);
        // print(head);

        head = insertBeforeValue(head, 10, 4);
        print(head);
    }
}
