class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] freqs2 = new int[26];
        int[] freqs1 = new int[26];

        if(s1.length() > s2.length())
            return false;

        for(int i = 0; i < s1.length();i++)
        {
            freqs1[s1.charAt(i) - 'a']++;
            freqs2[s2.charAt(i) - 'a']++;
        }

        boolean match = matchFreq(freqs1,freqs2,s1);

        if(match)
            return true;
        for(int i = s1.length();i < s2.length();i++)
        {
            freqs2[s2.charAt(i) - 'a']++;
            freqs2[s2.charAt(i - s1.length()) - 'a']--;
            match = matchFreq(freqs1,freqs2,s1);
            if(match)
                return true;
        }
        return false;

    }

    private boolean matchFreq(int[] freqs1, int[] freqs2, String s1)
    {
        for(int i = 0; i < s1.length();i++)
        {
            if(freqs1[s1.charAt(i) - 'a'] != freqs2[s1.charAt(i) - 'a'])
                return false;
        }
        return true;
    }
}
