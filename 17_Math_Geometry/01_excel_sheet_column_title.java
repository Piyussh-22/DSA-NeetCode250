class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0){
            columnNumber--;
            int digit = columnNumber % 26 ;
            char letter = (char) ('A' + digit);
            sb.append(letter);
            columnNumber = ( columnNumber / 26 )  ;
        }
        sb.reverse();
        return sb.toString();

    }
}

/*168. Excel Sheet Column Title
Solved
Easy
Topics
premium lock icon
Companies
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...


Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"


Constraints:

1 <= columnNumber <= 231 - 1*/