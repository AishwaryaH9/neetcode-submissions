class LRUCache {
    public class Node{
        int val;
        int key;
        Node next;
        Node prev;

        Node(int key,int val)
        {
            this.val = val;
            this.key = key;
        }
    }

    private final int capacity;
    private HashMap<Integer, Node> map;
    public volatile Node tail;
    public volatile Node head;

    public LRUCache(int capacity) {
      this.capacity = capacity;
      this.map  = new HashMap<>(capacity * 2);
      this.head = new Node(0, 0);
      this.tail = new Node(0, 0);
      head.next = tail;
      tail.prev = head;       
    }
    
    public int get(int key) {
        Node node;
        if(map.containsKey(key))
            node = map.get(key);
        else
            return -1;
        node.prev.next = node.next;
        node.next.prev  = node.prev;
        node.next = head.next;
        node.prev = head;      
        head.next.prev  = node;      
        head.next       = node;
        return node.val;
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key))
        {
            Node node = map.get(key);
            node.val = value;

            node.prev.next = node.next;
            node.next.prev = node.prev;

             node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;

           
            return;
        }
        else
        {
            Node node = new Node(key,value);
            map.put(key,node);
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            if(map.size() > capacity)
            {
                Node lastNode = tail.prev;
                lastNode.prev.next = tail;
                tail.prev = lastNode.prev;
                map.remove(lastNode.key);
            }
            return;
           
        }

        


        
    }
}
