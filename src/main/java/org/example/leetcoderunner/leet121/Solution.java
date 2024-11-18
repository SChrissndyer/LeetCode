package org.example.leetcoderunner.leet121;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxProfit(int[] prices) {
        int max=-1;
        int start=prices[0];
        for ( int i =1;i <prices.length;i++ ){
            if (prices[i]< start){
                start= prices[i];
            }
            if (prices[i]> start){
                if( max==-1){
                    max=prices[i] -start;
                }
                else {
                    max = max>prices[i]- start? max : prices[i] - start;
                }
            }
        }
        return max==-1? 0:max;
    }
}