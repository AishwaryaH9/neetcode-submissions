class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] rightProduct = new int[nums.length];
        rightProduct[0] = nums[0];
        for(int i = 1 ; i < nums.length;i++)
        {
            rightProduct[i] = rightProduct[i - 1] * nums[i];
        }
        
        int multiply = 1;
        int temp = 0;
        for(int j = nums.length - 1 ; j > 0  ; j--)
        {
            temp = nums[j];
            nums[j] =multiply * rightProduct[j-1];
            multiply = multiply * temp; 
        }
          nums[0] =multiply;
            

        return nums;
        
        

    }
}  
