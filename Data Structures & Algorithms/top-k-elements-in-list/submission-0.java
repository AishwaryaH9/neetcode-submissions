class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap();
       
        for(int i= 0 ; i < nums.length;i++)
        {
               count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->count.get(a) - count.get(b));

        for(int num : count.keySet())
        {
            queue.offer(num);
            if(queue.size() > k)  
                queue.poll(); 
        }
        int[] result = new int[k];
        for(int i = k -1 ; i >= 0 ; i--)
            result[i] = queue.poll();
        return result;
    }
}
