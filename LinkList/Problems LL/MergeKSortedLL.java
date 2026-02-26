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

public class MergeKSortedLL{

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node Brut(Node[] lists){
        List<Integer>lt = new ArrayList<>();

        for(Node temp: lists){
            while(temp != null){
                lt.add(temp.data);
                temp = temp.next;
            }
        }

        if(lt.size() == 0) return null;
        Collections.sort(lt);

        Node dummy = new Node(-1);
        Node mover = dummy;
        for(int val:lt){
            mover.next = new Node(val);
            mover = mover.next;
        }
        return dummy.next;
    }
    //TC = O(NlogN) | SC = O(N) where N is total number of nodes in all k lists


    public static Node mergeTwoLists(Node l1, Node l2){
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.data <= l2.data){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 != null) temp.next = l1;
        if(l2 != null) temp.next = l2;
        return dummy.next;
    }

    public static Node Better(Node[] lists){
        if(lists == null || lists.length == 0) return null;

        Node result = lists[0];
        for(int i=1;i<lists.length;i++){
            result = mergeTwoLists(result, lists[i]);
        }
        return result;
    }
    //TC - O(n * k) | Sc - O(1)


    // public static Node Optimal(Node[] lists){
    //     if(lists == null || lists.length == 0) return null;

    //     PriorityQueue<Node>pq = new PriorityQueue<>();

    // }

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

        Node head3 = new Node(2);
        head3.next = new Node(3);
        head3.next.next = new Node(9);
        head3.next.next.next = new Node(9);

        Node[] lists = {head, head2, head3};
        Node mergedHead = Better(lists);
        print(mergedHead);
    }
}