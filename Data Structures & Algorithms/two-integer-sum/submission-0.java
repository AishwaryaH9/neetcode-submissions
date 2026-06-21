class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashmap = new HashMap();
        for (int i = 0 ; i < nums.length;i++)
        {
            int diff = target - nums[i];
            if(hashmap.containsKey(diff))
                return ( i > hashmap.get(diff) ? new int[]{hashmap.get(diff),i} : new int[]{i,hashmap.get(diff)});
            else
                hashmap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
