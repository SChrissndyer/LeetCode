package org.example.leetcoderunner.leet2563;

import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
//The array nums is first sorted to enable efficient pair counting with a two-pointer approach.
        Arrays.sort(nums);
        return countTo(nums, upper) - countTo(nums, lower - 1);
    }
//countLess takes an array nums and a target sum, and counts pairs (i, j) such that i < j and nums[i] + nums[j] <= sum.
    private long countTo(int[] nums, int sum) {
        long res = 0;
        for (int i = 0, j = nums.length - 1; i < j; ++i) {
            while (i < j && nums[i] + nums[j] > sum)
                --j;
            res += j - i;
        }
        return res;
    }
}
