package org.example.leetcoderunner.leet14;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        // Take the first string as the reference prefix
        String prefix = strs[0];
        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Shorten the prefix until it matches the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; // No common prefix exists
                }
            }
        }
        return prefix;
    }
}
