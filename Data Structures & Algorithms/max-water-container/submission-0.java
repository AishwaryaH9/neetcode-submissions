class Solution {
    public int maxArea(int[] heights) {
        int right = heights.length -1 ;
        int left = 0;
        int maxArea = 0;
        while(left < right)
        {
            int area = Math.min(heights[left],heights[right]) * (right -left);
            maxArea = Math.max(area,maxArea);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
