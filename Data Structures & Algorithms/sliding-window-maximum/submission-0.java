class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int right = 0;
        int max = Integer.MIN_VALUE;
        int counter = 0;
        if(nums.length < k)
            return new int[]{};
        
        int[] result = new int[nums.length - k + 1];
        
        for(int left = 0;left <= nums.length - k;left++)
        {
            right = left;
            while(right - left < k)
            {
                max = Math.max(max,nums[right++]);
            }
            result[counter++] = max;
            max = Integer.MIN_VALUE;
        }

        return result;
    }
}
