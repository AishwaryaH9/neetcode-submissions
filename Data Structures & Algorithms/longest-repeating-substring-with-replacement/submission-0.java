class Solution {
    public int characterReplacement(String s, int k) {
//loop on char of string if next is match then increase count else decrease k
 // k reached to zero then move next pointer to next char

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
