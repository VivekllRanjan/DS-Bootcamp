package com.vivek;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetterGreaterthanTarget {
    public static void main(String[] args) {
        char[] l = {'c','d','f','g'};
        char t = 'e';
        System.out.println(nextGreatestLetter(l,t));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;
        int m = 0;
        if (target >= letters[e])
            return letters[s];
        while(s<=e){
            m = s+(e-s)/2;
            // if(target == letters[m])
            //    return m;
            if(target >= letters[m])
                s=m+1;
            else
                e=m-1;
        }
        return letters[s];
    }
}
