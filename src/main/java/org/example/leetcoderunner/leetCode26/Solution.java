package org.example.leetcoderunner.leetCode26;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // if empty return 0
        int i = 1;
        for (int j = 1; j < nums.length; j++) { // loop and count the new numbers that don't equal the next number
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}