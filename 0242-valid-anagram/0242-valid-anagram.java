class Solution {
    public boolean isAnagram(String s, String t) {
       
        if (s.length() != t.length()) {
            return false;
        }

       
        int[] counts = new int[26];

        
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        
        for (char c : sChars) {
            counts[c - 'a']++;
        }

        
        for (char c : tChars) {
            counts[c - 'a']--;
            if (counts[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}