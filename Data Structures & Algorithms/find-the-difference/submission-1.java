class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);      // XOR every char of s
        }

        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);      // XOR every char of t
        }

        return (char) result;           // only the extra char is left
    }
}