class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while(start < end)
        {
            int no = target - numbers[start];
            if(no == numbers[end])
                return new int[]{start+1,end+1};
            else if(numbers[end] > no)
                end--;
            else if(start == end || numbers[end] < no)
                start++;
        }
        return new int[]{-1,-1};
    }
}
