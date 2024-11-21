package org.example.leetcoderunner.leet392;

class Solution {
    public boolean isSubsequence(String s, String t) {
        char [] cs = s.toCharArray();
        char [] ts = t.toCharArray();
        if(cs.length==0) return true;
        if(ts.length==0) return false;
        int sCount=0;
        for(int i =0; i < ts.length;i++){
            if(ts[i]==cs[sCount]){
                sCount++;
            }
            if(sCount == cs.length) return true;
        }
        return false;
    }
}