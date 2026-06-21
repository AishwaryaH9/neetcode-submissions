class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDuplicate = false; 
        HashSet<Integer> newHashSet = new HashSet<Integer>();
        for(int i : nums)
        {
            isDuplicate = !newHashSet.add(i);
            if (isDuplicate)
                return isDuplicate;
           
        }

        return isDuplicate;

    }       
    
}