class Node {
    private int key;
    private int val;
    private Node prev;
    private Node next;
    Node(int key, int val){
        this.key = key;
        this.val = val;
    }
}


class LRUCache {
    private Node left;
    private Node right; 
    private int cap;
    private HashMap<Integer,Node> cache;
    public LRUCache(int capacity) {
        this.cache = new HashMap<>();
        this.cap = capacity;
        this.left = new Node(0,0);
        this.right= new Node(0,0);
        this.left.next = this.right;
        this.right.prev = this.left;
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
            Node node = cache.get(key);
            remove(node);
        }
        Node newNode = new Node(key, value);
        insert(newNode);
        cache.put(key, newNode);

        if (cache.size() > cap){
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
    private void insert(Node node){
        Node prev = this.right.prev;
        prev.next = node;
        node.next = this.right;
        this.right.prev = node;
        node.prev = prev;
    }

    private void remove(Node node){
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;
    }
}
