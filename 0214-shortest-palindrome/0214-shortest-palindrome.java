class Solution {
    public String shortestPalindrome(String s) {
        int i = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
        }

        if (i == s.length()) {
            return s;
        }

        String remaining = s.substring(i);
        String reverse = new StringBuilder(remaining).reverse().toString();

        return reverse + shortestPalindrome(s.substring(0, i)) + remaining;
    }
}