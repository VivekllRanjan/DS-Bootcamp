package com.vivek;

//https://leetcode.com/problems/find-in-mountain-array/

public class SearchMountainArray {
    public static void main(String[] args) {
        int arr[] = {0,1,2,4,2,1};
        int t = 3;
        System.out.println(SearchInMountainArray(arr,t));
    }

    //Below function is the main function to search.
    //We find the peak element and check both the left side and right side respectively(first occurrence) of the array
    static int SearchInMountainArray(int[] arr,int t) {
        int peak = PeakInMountainArray(arr);
        int left = BSearch(t,arr,0,peak);
        if (left != -1)
            return left;
        return RBSearch(t,arr,peak+1,arr.length-1);
    }

    //Below is the function to find the peak element index
    static int PeakInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }

    //BS for descending order Array
    private static int RBSearch(int t, int[] arr, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (t == arr[m])
                return m;
            else if (t < arr[m])
                s = m + 1;
            else
                e = m - 1;
        }
        return -1;
    }

    //BS for ascending order Array
    static int BSearch(int t, int[] arr,int s,int e) {
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
}
