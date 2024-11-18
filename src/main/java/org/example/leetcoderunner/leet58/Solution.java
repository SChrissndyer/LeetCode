package org.example.leetcoderunner.leet58;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String [] n= s.split(" ");
        return n[n.length-1].length();
    }
}