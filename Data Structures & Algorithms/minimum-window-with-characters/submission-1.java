class Solution {
    public String minWindow(String s, String t) {
        int[] freqs = new int[128];
        int[] freqt = new int[128];
        int minLength = Integer.MAX_VALUE;
        int left =0 ;
        int start = 0;
        int match = 0;

        if (t.length() > s.length())
            return "";

        for(int i =0;i < t.length();i++)
            freqt[t.charAt(i)]++;
        
        for(int right =0;right < s.length();right++)
        {
            char c = s.charAt(right);
            freqs[c]++;
            if(freqt[c] >= freqs[c])
            {
                match++;     
            }
            while(match == t.length())
            {
                if(right - left + 1 < minLength)
                {
                    minLength = right - left + 1;
                    start = left;
                }
                char l = s.charAt(left);
                if (freqs[l] <= freqt[l])
                    match--;
                freqs[l]--;
                left++;
            }
        
        }
        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength); 
    }

}
