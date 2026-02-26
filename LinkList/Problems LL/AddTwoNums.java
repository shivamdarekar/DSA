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

public class AddTwoNums{

    static Node createList(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static Node addNums(Node l1, Node l2){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;
            if(l1 != null){
                sum = sum + l1.data;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;

            Node newNode = new Node(sum % 10);
            temp.next = newNode;
            temp = temp.next;
        }
        return dummyNode.next;
    }


    public static void main(String args[]){
        int[] num1 = {2,4,3};
        int[] num2 = {5,6,4};

        Node l1 = createList(num1);
        Node l2 = createList(num2);

        Node head = addNums(l1, l2);
        print(head);
    }
}