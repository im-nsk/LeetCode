class LRUCache {
    
    final Node head = new Node();
    final Node tail = new Node();
    Map<Integer, Node> cacheMap;
    int cacheSize;

    public LRUCache(int capacity) {
        
        cacheMap = new HashMap(capacity);
        cacheSize = capacity;
        head.next = tail;
        tail.prev = head;
        
        
    }
    
    public int get(int key) {
        int result = -1;
        Node node = cacheMap.get(key);
        if(node != null){
            result = node.value;
            remove(node);
            add(node);
            
        }
        return result;
    }
    
    public void put(int key, int value) {
        Node node = cacheMap.get(key);
        if(node != null){
            remove(node);
            node.value = value;
            add(node);
        }
        else{
            if(cacheMap.size() == cacheSize)
            {
                cacheMap.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            
            cacheMap.put(key, newNode);
            add(newNode);
        }
        
    }
    
    public void add(Node node){
        Node temp = head.next;
        head.next = node;
        node.prev = head;
        
        temp.prev = node;
        node.next = temp;
        
    }
    public void remove(Node node){
        Node nextNode = node.next;
        Node prevNode = node.prev;
        
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
        
    }
}
class Node{
    int value;
    int key;
    Node prev;
    Node next;
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */