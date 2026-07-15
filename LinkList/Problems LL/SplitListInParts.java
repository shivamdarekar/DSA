class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SplitListInParts{

    public static Node[] splitListToParts(Node head, int k) {
        Node ans[] = new Node[k];
        Node curr = head;
        int len = 0;

        while(curr != null){
            len++;
            curr = curr.next;
        }

        int size = len/k;
        int extra = len%k;

        curr = head;
        for(int i=0;i<k;i++){
            ans[i] = curr;
            int currSize = size;

            if(extra > 0){
                currSize++;
                extra--;
            }

            for(int j=1;j<currSize;j++){
                if(curr != null) curr = curr.next;
            }

            if(curr != null){
                Node nextPart = curr.next;
                curr.next = null;
                curr = nextPart;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        // Example usage (optional)
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Node[] parts = splitListToParts(head, 2);
        for (int i = 0; i < parts.length; i++) {
            Node cur = parts[i];
            System.out.print("Part " + i + ":");
            while (cur != null) {
                System.out.print(" " + cur.data);
                cur = cur.next;
            }
            System.out.println();
        }
    }
}