class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class CeilAndFloor{

    //smallest val >= key
    public static int findCeil(Node root, int key){
        int ceil = -1;
        while(root != null){
            if(root.data == key){
                ceil = root.data;
                return ceil;
            }

            if(root.data > key){
                ceil = root.data;
                root = root.left;
            }
            else root = root.right;
        }
        return ceil;
    }

    //largest val <= key
    public static int findFloor(Node root, int key){
        int floor = -1;

        while(root != null){
            if(root.data == key){
                return root.data;
            }

            if(root.data > key) root = root.left;
            else {
                floor = root.data;
                root = root.right;
            }
        }
        return floor;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(13);
        root.left.left = new Node(3);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(4);
        root.left.right = new Node(6);
        root.left.right.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(14);

        System.out.println(findCeil(root, 7));
        System.out.print(findFloor(root, 7));
    }
}