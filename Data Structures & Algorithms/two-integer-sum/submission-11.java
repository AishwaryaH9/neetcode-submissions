class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int j = 0 ; j < nums.length;j++)
        {
            map.put(nums[j],j);
        }
        for(int i = 0 ; i < nums.length;i++)
        {
            int match = map.getOrDefault(target - nums[i] , 0);
            if(match != 0 && i != match)
                return new int[] {i,match};
        }
        return new int[] { -1,-1} ;
    }
}
