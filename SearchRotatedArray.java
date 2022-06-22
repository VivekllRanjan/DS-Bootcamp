package com.vivek;

https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/

public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,1};
        int target = 1;
        int res=99;
        int pivot = findPivot(arr); //Note : pivot+1 is equal to number of rotations of the array
        if (pivot==-1)
            res = BS(0,arr.length-1,arr,target);

        if (arr[pivot] == target)
            res = pivot;

        if (target >= arr[0])
            res = BS(0,pivot-1,arr,target);

        res = BS(pivot+1, arr.length-1,arr,target );

        System.out.println(res);

        }
    static int BS(int s, int e, int[] arr,int t) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (t == arr[m])
                return m;
            else if (t > arr[m])
                s = m + 1;
            else
                e = m - 1;
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int s=0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if (mid < e && arr[mid]>arr[mid+1])
                return mid;
            if (mid < e && arr[mid]<arr[mid-1])
                return mid-1;

            if (arr[mid] <= arr[s])
                e = mid-1;
            else
                s = mid+1;
        }
        return -1;
    }
}
