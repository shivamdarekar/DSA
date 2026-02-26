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

public class InsertionDLL{
    
    public static Node convertToLL(int[] arr){
    Node head = new Node(arr[0]);
    Node prev = head;

    for(int i=1;i<arr.length;i++){
        Node temp = new Node(prev, arr[i], null);
        prev.next = temp;
        prev = temp;
    }
    return head;
}

public static void print(Node head){
    Node temp = head;

    while(temp != null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
}

public static Node insertBeforeHead(Node head, int val){
    if(head == null) return null;

    Node newHead = new Node(null, val, head);
    head.prev = newHead;

    return newHead;
}

public static Node insertTail(Node head, int val){
    if(head == null) return null;

    Node tail = head;
    while(tail.next != null){
        tail = tail.next;
    }
    Node newTail = new Node(tail, val, null);
    tail.next = newTail;

    return head;
}

public static Node insertBeforeTail(Node head, int val){
    if(head.next == null){
        insertBeforeHead(head, val);
        return head;
    }

    Node tail = head;
    while(tail.next != null){
        tail = tail.next;
    }
    Node prev = tail.prev;
    Node temp = new Node(prev, val, tail);
    prev.next = temp;
    tail.prev = temp;

    return head;
}

public static Node insertAtKth(Node head, int k, int val){
    if( k == 1){
        return insertBeforeHead(head, val);
    }

    Node temp = head;
    int cnt = 0;
    while(temp != null){
        cnt++;
        if(cnt == k) break;
        temp = temp.next;
    }
    Node prev = temp.prev;
    Node newNode = new Node(prev,val,temp);
    prev.next = newNode;
    temp.prev  = newNode;

    return head;
}

    public static void main(String args[]){
        int[] arr = {4,8,3,7,6,9};

        Node head = convertToLL(arr);
        head = insertAtKth(head, 4, 14);
        print(head);
    }
}