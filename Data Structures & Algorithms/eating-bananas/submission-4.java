class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        // get max from piles
        Arrays.sort(piles);
        int max = piles[piles.length - 1];
        int min = 1 ;
        int result = max;
        while( min <= max)
        {
            int mid = min + (max - min) / 2;

            long hours = 0;

            for(int pile : piles)
            {
                hours += (pile + mid - 1) / mid ;
                if(hours > h)
                {
                    break;
                }
            }
            if (hours <= h) {
                result = mid;
                max = mid - 1;   
            }  else
                min = mid + 1;       
        }
        return result;
        
    }
}
