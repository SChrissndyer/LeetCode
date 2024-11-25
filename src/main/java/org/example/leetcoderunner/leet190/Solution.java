package org.example.leetcoderunner.leet190;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans=0;
        for ( int i=0; i <32; i++){
            int bit =(n>>i) & 1;
            ans= ans| (bit <<(31-i ));
        }
        return ans;
    }
}