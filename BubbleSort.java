package com.vivek;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        //Run loop n-1 times
        boolean swapped;
        for (int i = 0; i < arr.length-1; i++){
            swapped = false;
            //For each step, max item comes to last index
            for (int j = 1; j < arr.length-i; j++){
                //Swap items if not in order
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
