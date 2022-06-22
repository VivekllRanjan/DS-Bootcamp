package com.vivek;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30,40,50};
        int t = 50;
        System.out.println(result(t,arr));
    }
    static int result(int t, int[] arr) {
        int s = 0;
        int e = 1;
        while (t > arr[e]) {
            int temp = e+1; //new start
            e = e + (e-s+1)*2; //size of array (e-s)+1
            s = temp; //updating start
        }
        return BSearch(t,arr,s,e);
    }
    static int BSearch(int t, int[] arr,int s,int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (t == arr[m])
                return m;
            else if (t > arr[m])
                s = m + 1;
            else {
                e = m - 1;

            }
        }
        return -1;
    }
}

