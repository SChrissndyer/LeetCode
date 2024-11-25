package org.example.leetcoderunner.leet136;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i]; // XOR == ^
        }
        return result;
    }
}