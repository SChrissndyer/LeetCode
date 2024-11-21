package org.example.leetcoderunner.leet242;

class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length()!= t.length())
            return false;
        char[] schar= s.toCharArray();
        char[] tchar= t.toCharArray();

        int[] charMap = new int[26];
        for( int i =0; i <schar.length; i ++ ){
            charMap['z'-schar[i]]++;
            charMap['z'-tchar[i]]--;
        }
        for (int i =0; i <schar.length;i++ ){
            char currChar = schar[i];
            if ( charMap['z'- currChar]!=0){
                return false;
            }
        }
        return true;

    }
}