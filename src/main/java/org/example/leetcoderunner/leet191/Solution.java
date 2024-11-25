package org.example.leetcoderunner.leet191;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while (n!=0){
            c += (n & 1);
            n >>>= 1;
        }
        return c ;
    }
}