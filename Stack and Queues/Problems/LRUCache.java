
import java.util.HashMap;
import java.util.Map;

//Least recent used cache
public class LRUCache{

    class Node {
        int key, value;
        Node prev, next;

        Node(int k, int v){
            key = k;
            value = v;
        }
    }

    private Map<Integer, Node>mpp;
    private int capacity;
    private Node head, tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        mpp = new HashMap<>();

        head = new Node(-1,-1);
        tail = new Node(-1,-1);

        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node temp){
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    private void insert(Node temp){
        temp.next = head.next;
        temp.prev = head;

        head.next.prev = temp;
        head.next = temp;
    }

    public int get(int key){
        if(!mpp.containsKey(key)){
            return -1;
        }

        Node temp = mpp.get(key);
        remove(temp);
        insert(temp);
        return temp.value;
    }

    public void put(int key, int value){
        if(mpp.containsKey(key)){
            remove(mpp.get(key));
        }

        Node temp = new Node(key, value);
        mpp.put(key, temp);
        insert(temp);

        if(mpp.size() > capacity){
            Node lru = tail.prev;
            remove(lru);
            mpp.remove(lru.key);
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        System.out.println(cache.get(1)); // 1

        cache.put(3, 3); // removes key 2

        System.out.println(cache.get(2)); // -1

        cache.put(4, 4); // removes key 1

        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 3
        System.out.println(cache.get(4)); // 4
    }
}