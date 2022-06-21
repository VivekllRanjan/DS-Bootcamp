package com.vivek;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
public class FindFandLPosInSortedArray {
    public static void main(String[] args) {
        int[] list ={0,1,2,3,4,7,7,7,7,7,7,7,8,8,8,8,8,8,8,9,9,9,9,9,9};
        int target = 8;
        System.out.println(searchRange(list,target));
    }
    public static int[] searchRange(int[] arr, int t) {
        int[] res = {-1,-1};
        //First occurrence
        res[0] = Search(arr, t, true);
        res[1] = Search(arr, t, false);

        return res;
    }
    //Binary search
    static int Search(int[] arr, int t, boolean findStartIndex){
        int res = -1;
        int s = 0;
        int e = arr.length-1;
        int m = 0;
        while(s<=e){
            m = s+(e-s)/2;
            if(t > arr[m])
                s=m+1;
            else if(t < arr[m])
                e = m - 1;
            else {
                res = m;
                if (findStartIndex){
                    // finding the first occurrence
                    e=m-1;
                }
                else {
                    // finding last occurrence
                    s=m+1;
                }
            }
        }
        return res;
    }
}
