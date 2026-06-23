class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length;i++)
            set.add(nums[i]);
     
        int largestLength = 0;
        int len = 1;
        
        for(int i = 0 ; i < nums.length;i++)
        {
            int no = nums[i];
            while(set.contains(--no))
            {
                len++;
            }
            largestLength = len > largestLength ? len:largestLength;
            len = 1;
        }
        return largestLength;
    }
}
