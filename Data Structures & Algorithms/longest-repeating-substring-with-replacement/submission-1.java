class Solution {
    public int characterReplacement(String s, int k) {

    //Window two pointer : calculate max frequency of char if not matching shrink window
    int maxFreq = 0;
    int maxSize = 0;
    int left =0;
    int[] freq = new int[26];
    for(int right = 0;right < s.length(); right++)
    {
        freq[s.charAt(right) - 'A']++;
        maxFreq = Math.max(maxFreq,freq[s.charAt(right) - 'A']);
        while((right - left + 1 )- maxFreq > k)
        {
            freq[s.charAt(left) - 'A']--;
            left++;
        }
        maxSize = Math.max(right-left+1,maxSize);
        
    }


    return maxSize;
        
    }
}
