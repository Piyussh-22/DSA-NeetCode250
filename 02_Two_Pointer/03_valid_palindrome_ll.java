class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return isPalin(s,start+1,end) || isPalin(s,start,end-1);
            }
            start++;
            end--;
        }
        return true;
    }
    private boolean isPalin(String s , int start , int end){
        while(start<end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}

/*680. Valid Palindrome II
Solved
Easy
Topics
premium lock icon
Companies
Given a string s, return true if the s can be palindrome after deleting at most one character from it.



Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false


Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.*/