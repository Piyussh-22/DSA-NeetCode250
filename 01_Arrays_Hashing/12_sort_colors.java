class Solution {
    public void sortColors(int[] nums) {
        int step = 1 ;
        while(step < nums.length){
            for(int i = 0 ; i < nums.length-1 ; i++){
                if(nums[i]>nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
            step++;
        }
    }
}

//method 2 HashMap
class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for(int i = 0 ; i < nums.length ; i++){
            switch (nums[i]){
                case 0:
                    map.put(0,map.get(0)+1);
                    break;
                case 1:
                    map.put(1,map.get(1)+1);
                    break;
                case 2:
                    map.put(2,map.get(2)+1);
                    break;
            }
        }
        int start = 0 ;
        for (int j = 0; j < map.size(); j++) {
            for(int i = 0 ; i < map.get(j) ; i++){
                nums[start] = j;
                start++;
            }
        }
    }
}

/*75. Sort Colors
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]


Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.


Follow up: Could you come up with a one-pass algorithm using only constant extra space?*/