package org.example.leetcoderunner.leet2070;

import java.util.Arrays;

public class Runner{
    public static void main(String[] args){
    Solution a= new Solution();
    int [][] items ={{1,2},{3,2},{2,4},{5,6},{3,5}};
    int [] queries ={1,2,3,4,5,6};
    System.out.println(Arrays.toString(a.maximumBeauty(items, queries)));
    }
}