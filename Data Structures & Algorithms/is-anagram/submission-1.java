class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
             return false;

        HashMap<Character, Integer> hash1 = new HashMap<Character,Integer>();
        for(char c : s.toCharArray())
            hash1.put(c,hash1.getOrDefault(c, 0) + 1);
        
        for(char c : t.toCharArray())
            hash1.put(c,hash1.getOrDefault(c, 0) - 1);

        for (var pair : hash1.entrySet()) {
            if (pair.getValue() != 0) {
                return false;
            }
        }
    

        return true;

    }
}
