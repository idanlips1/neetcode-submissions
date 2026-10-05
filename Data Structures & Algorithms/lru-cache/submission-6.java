public class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    HashMap<Integer, Node> cache;
    private int cap;
    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        left = new Node(0,0);
        right = new Node(0,0);
        this.left.next = right;
        this.right.prev = left;
    }
    
    public int get(int key) {
        if (cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)){
            remove(cache.get(key));
        }
        Node newNode = new Node(key,value);
        cache.put(key, newNode);
        insert(newNode);

        if (cache.size() > cap){
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
    // remove from list
    private void remove(Node node){
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;
    }
    // insert at right
    private void insert(Node node){
        Node prev = this.right.prev;
        prev.next = node;
        node.next = this.right;
        node.prev = prev;
        this.right.prev = node;
    }
}
