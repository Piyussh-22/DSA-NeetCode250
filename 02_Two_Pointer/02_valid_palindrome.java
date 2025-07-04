class Solution {
    public boolean isPalindrome(String s) {
        String onlyAlpha = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int start = 0;
        int end = onlyAlpha.length()-1;
        for(int i = 0 ; i < onlyAlpha.length()/2 ; i++ ){
            if(onlyAlpha.charAt(start) != onlyAlpha.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}


class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}




/*125. Valid Palindrome
Solved
        Easy
Topics
premium lock icon
        Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



        Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
        Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


        Constraints:

        1 <= s.length <= 2 * 105
s consists only of printable ASCII characters. */