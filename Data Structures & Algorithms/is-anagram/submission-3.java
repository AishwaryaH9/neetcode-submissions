class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> countSChars = new HashMap<Character, Integer>();
        HashMap<Character,Integer> countTChars = new HashMap<Character, Integer>();

        Boolean result = false;

        if(s.length() != t.length())
            return false;

        for(char i : s.toCharArray())
        {
            countSChars.put(i, countSChars.getOrDefault(i,0) + 1);
        }

        for(char k : t.toCharArray())
        {
            if(countSChars.getOrDefault(k,0) == 0)
                return false;
            else
                countTChars.put(k, countTChars.getOrDefault(k,0) + 1);

        }
        if(countSChars.size() != countTChars.size())
                return false;
        for (Map.Entry<Character, Integer> entry : countSChars.entrySet()) {
            if(!entry.getValue().equals(countTChars.getOrDefault(entry.getKey(),0)))
                        return false;
            else
                result = true;
        }

        return result;


    }
}
