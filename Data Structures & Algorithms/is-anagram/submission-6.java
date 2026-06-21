class Solution {
    public boolean isAnagram(String s, String t) {
        //cover mismatch no of length
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Integer> countofS = new HashMap();

        for(int i = 0 ; i < s.length();i++)
        {
            countofS.put(s.charAt(i) , countofS.getOrDefault(s.charAt(i),0) + 1);
        }

        for(int j = 0 ; j < t.length();j++)
        {
            countofS.put(t.charAt(j) ,countofS.getOrDefault(t.charAt(j),0) - 1);
            if(countofS.getOrDefault(t.charAt(j),0) < 0)
                return false;
        }
        return true;
    }
}
