package com.vivek;

public class BinarySearchTutorial {
    public static void main(String[] args) {
        int[] arr ={2,4,6,7,22,27,67,88,100};
        int t = 100;
        System.out.println(findele(t,arr));
    }

    static int findele(int t, int[] arr) {
        int s = 0;
        int e = arr.length-1;
        int m = 0;
        while(s<=e){
            m = s+(e-s)/2;
            if(t == arr[m])
                return m;
            else if(t > arr[m])
                s=m+1;
            else {
                e = m - 1;

            }
        }
        return arr[s];
    }
}
