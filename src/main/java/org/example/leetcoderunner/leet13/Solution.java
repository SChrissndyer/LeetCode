package org.example.leetcoderunner.leet13;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int number=0;
        char m ='a';
        char p ='a';
        int n = s.length();
        for (int i =0; i < n ; i++){
            m=s.charAt(i);
            if ( m =='M'){
                number += 1000;
            }
            else if (m =='D' ){
                number += 500;
            }
            else if (m =='C'  ){
                if ( i+1 < n){
                    p = s.charAt(i+1);
                    if ( p =='D'){
                        number += 400;
                        i++;
                    }
                    else if (p =='M' ){
                        number += 900;
                        i++;
                    }
                    else {
                        number += 100;
                    }
                }
                else {
                    number += 100;
                }
            }
            else if ( m =='L'){
                number += 50;
            }
            else if (m =='X'  ){
                if ( i+1 < n){
                    p = s.charAt(i+1);
                    if ( p =='L'){
                        number += 40;
                        i++;
                    }
                    else if (p =='C' ){
                        number += 90;
                        i++;
                    }
                    else {
                        number += 10;
                    }
                }
                else {
                    number += 10;
                }
            }
            else if ( m =='V'){
                number += 5;
            }
            else if (m =='I'  ){
                if ( i+1 < n){
                    p = s.charAt(i+1);
                    if ( p =='V'){
                        number += 4;
                        i++;
                    }
                    else if (p =='X' ){
                        number += 9;
                        i++;
                    }
                    else {
                        number += 1;
                    }
                }
                else {
                    number += 1;
                }
            }

        }
        return number;
    }
}
