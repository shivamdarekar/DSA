
import java.util.*;

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

public class FindPairsInDLL{

    public static void Brut(Node head, int sum){
        Node temp = head;
        while(temp != null){
            Node temp2 = temp.next;

            while(temp2 != null && temp.data + temp2.data <= sum){
                if(temp.data + temp2.data == sum){
                    System.out.println(temp.data + "," + temp2.data);
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
    }//O(n^2)

    public static List<int[]> Optimal(Node head, int sum){
        List<int[]>ans = new ArrayList<>();

        if(head == null) return ans;

        Node left = head;
        Node right = findTail(head);

        while(left != null && right != null && left != right && right.next != left){
            if(left.data + right.data == sum){
                ans.add(new int[]{left.data, right.data});
                left = left.next;
                right = right.prev;
            }
            else if(left.data + right.data < sum){
                left = left.next;
            }else{
                right = right.prev;
            }
        }
        return ans;
    }
    //Tc = O(n) | SC = O(1)
    //we use extra space to store ans not to find ans so SC is constant

    public static Node findTail(Node head){
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        return tail;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(head, 2, null);
        head.next.next = new Node(head.next, 3, null);
        head.next.next.next = new Node(head.next.next, 4, null);
        head.next.next.next.next = new Node(head.next.next.next, 9, null);

        List<int[]> ans = Optimal(head, 5);
        for (int[] pair : ans) {
            System.out.println(pair[0] + "," + pair[1]);
        }
    }
}