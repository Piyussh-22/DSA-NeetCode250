class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        if(sArray.length != tArray.length){
            return false;
        }
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for ( int i = 0 ; i < sArray.length ; i++){
            if(sArray[i] != tArray[i]){
                return false;
            }
        }
        return true;
    }
}

/* 242. Valid Anagram
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

* */