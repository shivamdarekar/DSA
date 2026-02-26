
class Node {

    Node prev;
    int data;
    Node next;

    Node(Node prev1, int data1, Node next1) {
        prev = prev1;
        data = data1;
        next = next1;
    }

    Node(int data1) {
        prev = null;
        data = data1;
        next = null;
    }
}

public class DoubleyLL {

    public static Node convertToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(prev, arr[i], null);
            prev.next = temp;
            prev = temp;
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

    //remove head 
    public static Node removeHead(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;

        return head;
    }

    public static Node removeTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
        return head;
    }

    //delete kth element
    public static Node removeKthElement(Node head, int k){
        if(head == null) return null;
        int cnt = 0;
        Node temp = head;

        while(temp != null){
            cnt++;
            if(cnt == k) break;
            temp = temp.next;
        }

        Node prev = temp.prev;
        Node next = temp.next;

        if(prev == null && next == null) return null;
        else if(prev == null){
            return removeHead(head);
        }
        else if(next == null){
            return removeTail(head);
        }

        prev.next = next;
        next.prev = prev;

        temp.next = null;
        temp.prev = null;
        
        return head;
    }

    //remove given element and element is not head
    public static void removeEle(Node temp){

        Node prev = temp.prev;
        Node next = temp.next;

        if(next == null){
            prev.next = null;
            temp.prev = null;
        }
        prev.next = next;
        next.prev = prev;

        temp.prev = null;
        temp.next = null;
    }

    public static void main(String args[]) {
        int[] arr = {4, 5, 7, 9, 15};

        Node head = convertToLL(arr);
        //print(head);

        head = removeHead(head);
        print(head);
    }
}
