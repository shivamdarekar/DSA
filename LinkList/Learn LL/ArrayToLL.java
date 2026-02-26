//Node class represent a node in the linklist
class Node{
    int data;   //data value
    Node next;  //pointer to next node or reference to next Node

    ///constructor with data and next
    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }

    Node(int data1){
        data = data1;
        next = null;
    }
}

public class ArrayToLL{

    public static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static int lengthOfLL(Node head){
        Node temp = head;
        int cnt = 0;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public static boolean searchInLL(Node head, int num){
        Node temp = head;
        while(temp != null){
            if(temp.data == num) return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String args[]){
        int[] arr = {12,5,6,8};
        Node head = convertArr2LL(arr);
        System.out.println(head.data);
        System.out.println(lengthOfLL(head));
        System.out.println(searchInLL(head, 10));

        //print all linklist
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;  //temp ko next node pe move karo
        }
    }
}

/*
next - next node ka address/reference store karta hai,
aur next node bhi Node type ka object hota hai, isliye next ka type Node hota hai.
 */