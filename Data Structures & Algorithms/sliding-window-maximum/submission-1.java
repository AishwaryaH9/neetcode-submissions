class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int right = 0;
        int max = Integer.MIN_VALUE;
        int counter = 0;
        if(nums.length < k)
            return new int[]{};
        
        int[] result = new int[nums.length - k + 1];
        
        // for(int left = 0;left <= nums.length - k;left++)
        // {
        //     right = left;
        //     while(right - left < k)
        //     {
        //         max = Math.max(max,nums[right++]);
        //     }
        //     result[counter++] = max;
        //     max = Integer.MIN_VALUE;
        // }

        Deque<Integer> deque = new ArrayDeque<Integer>(); 

        for(int i = 0;i < nums.length;i++)
        {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                result[counter++] = nums[deque.peekFirst()];
            }



        }

        return result;
    }
}
