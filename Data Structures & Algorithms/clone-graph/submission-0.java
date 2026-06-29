/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node, Node> map = new HashMap();
    public Node cloneGraph(Node node) {
        if(node == null)
            return null;
        
        if(map.containsKey(node))
            return map.get(node);
        
        Node copy = new Node(node.val);
        map.put(node,copy);

        Queue<Node> q = new LinkedList<Node>();
        q.offer(node);

        while(!q.isEmpty())
        {
            Node curr = q.poll();
            for(Node neighbor : curr.neighbors)
            {
                if(!map.containsKey(neighbor))
                {
                    map.put(neighbor, new Node(neighbor.val));
                    q.offer(neighbor);

                }
                 map.get(curr).neighbors.add(map.get(neighbor));
            }
           
        }
        
        return copy;

        
    }
    
}