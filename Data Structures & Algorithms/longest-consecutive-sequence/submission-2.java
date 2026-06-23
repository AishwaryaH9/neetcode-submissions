class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length;i++)
            set.add(nums[i]);
     
        int largestLength = 0;
       
        
        for(int i = 0 ; i < nums.length;i++)
        {
            int len = 1;
            int no = nums[i];
            if(!set.contains(no - 1))
            {
                while(set.contains(++no))
                {
                    len++;
                }
                largestLength = len > largestLength ? len:largestLength;
            }
        }
        return largestLength;
    }
}
