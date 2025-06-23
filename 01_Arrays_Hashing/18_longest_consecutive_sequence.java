class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int k : nums){
            set.add(k);
        }
        int maxLen = 0;
        for(int k : set){
            if(!set.contains(k-1)){
                int currNum = k ;
                int currLen = 1 ;
                while(set.contains(currNum+1)){
                    currNum++;
                    currLen++;
                }
                if (currLen > maxLen) {
                    maxLen = currLen;
                }
            }
        }
        return maxLen;
    }
}

/*128. Longest Consecutive Sequence
Solved
Medium
Topics
premium lock icon
Companies
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.



Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109*/