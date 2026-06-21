class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length;i++)
        {
            if(!hs.add(nums[i]))
                return true;
        }
        return false;
    }
}