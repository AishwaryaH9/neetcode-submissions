class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        int mid = 0;
        while(left < right)
        {
            mid = (left + right) / 2;
            if(nums[right] < nums[mid])
                left = mid + 1;
            else 
                right = mid;
        }
        return nums[left];
    }
}
